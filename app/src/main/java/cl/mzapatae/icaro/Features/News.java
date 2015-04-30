package cl.mzapatae.icaro.Features;


import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import cl.bit01.icaro.R;
import cl.mzapatae.icaro.ModelData.NewsObject;
import cl.mzapatae.icaro.Utils.ProgressBar;

/*
 * Created by miguelost on 09-02-15.
 */
public class News extends Fragment {
    private final String urlNewsDestacado = "http://www.elmostrador.cl/destacado/feed/";
    private final String urlNewsDia = "http://www.elmostrador.cl/dia/feed/";
    private final String urlNewsPais = "http://www.elmostrador.cl/noticias/pais/feed/";
    private final String urlNewsMundo = "http://www.elmostrador.cl/noticias/mundo/feed/";
    private final String urlNewsDeporte = "http://rss.emol.com/rss.asp?canal=4";

    private String typeNews;

    public News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
        Bundle bundle = this.getArguments();
        typeNews = bundle.getString("newsType");

        setNews(typeNews);
        return rootView;
    }

    private void setNews(String typeNews) {
        if (typeNews.equals("destacada")) {
            new executeBackground(urlNewsDestacado).execute();
        }
        if (typeNews.equals("dia")) {
            new executeBackground(urlNewsDia).execute();
        }
        if (typeNews.equals("chile")) {
            new executeBackground(urlNewsPais).execute();
        }
        if (typeNews.equals("mundo")) {
            new executeBackground(urlNewsMundo).execute();
        }
        if (typeNews.equals("deportes")) {
            new executeBackground(urlNewsDeporte).execute();
        }
    }

    private class executeBackground extends AsyncTask<String, Void, Void> {
        private String urlFeed = null;
        private ArrayList<NewsObject> newsData = new ArrayList<>();
        private int errorCode = 0;

        public executeBackground(String url) {
            this.urlFeed = url;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressBar.showLoadProgressBar(getActivity());
        }

        @Override
        protected Void doInBackground(String... params) {
            try {
                Vector<HTMLRemoverBean> vectParse = new Vector<>();
                URL feed = new URL(urlFeed);
                URLConnection con = feed.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String inputLine;
                String fullStr = "";
                while ((inputLine = reader.readLine()) != null)
                    fullStr = fullStr.concat(inputLine + "\n");

                InputStream istream = feed.openStream();
                DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document doc = builder.parse(istream);
                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("item");

                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        HTMLRemoverBean objBean = new HTMLRemoverBean();
                        vectParse.add(objBean);

                        objBean.title = getTagValue("title", eElement);
                        objBean.description = getTagValue("description", eElement);
                        String noHTMLString = objBean.description.replaceAll("\\<.*?\\>", "");
                        objBean.description = noHTMLString;
                        objBean.link = getTagValue("link", eElement);
                        objBean.pubdate = getTagValue("pubDate", eElement);
                    }
                }

                for (int index1 = 0; index1 < vectParse.size(); index1++) {
                    HTMLRemoverBean ObjNB = vectParse.get(index1);
                    newsData.add(index1, new NewsObject(
                            ObjNB.title,
                            ObjNB.description,
                            ObjNB.link,
                            ObjNB.pubdate));

                    Log.d("Icaro", "==============================");
                    Log.d("Icaro", "Item No : " + index1);
                    Log.d("Icaro", "Title is : " + ObjNB.title);
                    Log.d("Icaro", "Description is : " + ObjNB.description);
                    Log.d("Icaro", "Link is : " + ObjNB.link);
                    Log.d("Icaro", "Pubdate is : " + ObjNB.pubdate);
                }
            } catch (Exception e) {
                Log.d("Icaro", "News Error: " + e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (errorCode == 0) {

            }
            ProgressBar.dismissLoadProgressBar();
        }

        private String getTagValue(String sTag, Element eElement) {
            NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
            Node nValue = (Node) nlList.item(0);
            return nValue.getNodeValue();
        }
    }

    public class HTMLRemoverBean {
        public String title;
        public String description;
        public String link;
        public String pubdate;
    }

}
