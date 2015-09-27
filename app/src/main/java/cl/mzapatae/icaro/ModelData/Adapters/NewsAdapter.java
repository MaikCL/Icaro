package cl.mzapatae.icaro.ModelData.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cl.mzapatae.icaro.ModelData.Objects.NewsObject;
import cl.mzapatae.icaro.R;

/*
 * Created by MZapatae on 14-05-15.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private List<NewsObject> dataSet;
    private Context context;

    public NewsAdapter(Context mContext, List<NewsObject> newsData) {
        this.context = mContext;
        this.dataSet = newsData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.newsTitle.setText(dataSet.get(position).getTitle());
        holder.newsContent.setText(dataSet.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView newsTitle;
        TextView newsContent;

        public ViewHolder(View itemView) {
            super(itemView);
            this.newsTitle = (TextView) itemView.findViewById(R.id.news_title);
            this.newsContent = (TextView) itemView.findViewById(R.id.news_content);
        }
    }
}
