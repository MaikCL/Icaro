package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/*
 * Created by miguelost on 17-05-15.
 */
public class Whatsapp extends Fragment {


    public Whatsapp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        String contactName = bundle.getString("user");
        findContact(contactName);
        return null;
    }

    private void findContact(String contactName) {
        String numberUser = null;
        String selection = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " like'%" + contactName + "%'";
        String[] projection = new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER};

        Cursor c = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                projection, selection, null, null);

        if (c.moveToFirst()) {
            numberUser = c.getString(0);
        }

        c.close();
        if (numberUser == null) numberUser = "Unsaved";
        else openWhatsapp(numberUser);

        Log.d("Icaro", "Nombre Contacto Ingresado: " + contactName + " / Numero Contacto: " + numberUser);
    }

    private void openWhatsapp(String numberUser) {
        try {
            Cursor c2 = getActivity().getContentResolver().query(ContactsContract.Data.CONTENT_URI,
                    new String[]{ContactsContract.Contacts.Data._ID}, ContactsContract.Data.DATA1 + "=?",
                    new String[]{numberUser.substring(1).replaceAll("\\s", "") + "@s.whatsapp.net"}, null);
            c2.moveToFirst();

            Intent whatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse("content://com.android.contacts/data/" + c2.getString(0)));
            c2.close();
            Toast.makeText(getActivity(), "Abriendo Whatsapp...", Toast.LENGTH_SHORT).show();
            getActivity().startActivity(whatsapp);
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Usuario no encontrado en Whatsapp", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
