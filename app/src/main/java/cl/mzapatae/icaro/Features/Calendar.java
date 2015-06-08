package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cl.bit01.icaro.R;

/*
 * Created by miguelost on 29-05-15.
 */

public class Calendar extends Fragment {
    private TextView eventName;
    private TextView eventDate;
    private TextView eventMonth;
    private TextView eventTime;
    private Button buttonConfirm;
    private Bundle bundle;

    public Calendar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);
        bundle = this.getArguments();

        //Toolbar mToolbarCard = (Toolbar) rootView.findViewById(R.id.toolbar_calendar);

        //SET INITIALIZER

        return rootView;
    }


}
