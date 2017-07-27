package com.example.smaqu.solarsystemapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smaqu.solarsystemapp.R;
import com.example.smaqu.solarsystemapp.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SmaQu on 2017-07-11.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(List<ListItem> listData, Context context){
        this.listData=listData;
        this.inflater=LayoutInflater.from(context);
    }

    private ItemClickCallBack itemClickCallBack;

    public interface ItemClickCallBack{
        void onItemClick(int pos);
    }

    public void setItemClickCallBack(final ItemClickCallBack itemClickCallBack){
        this.itemClickCallBack=itemClickCallBack;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_view,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.planetName.setText(item.getPlanetName());
        holder.planetIco.setImageResource(item.getPlanetImageIco());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void setListData(ArrayList<ListItem> arrayAfterSortSet){
        this.listData.clear();
        this.listData.addAll(arrayAfterSortSet);
    }
    class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView planetName;
        private ImageView planetIco;
        private View container;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            planetName = (TextView) itemView.findViewById(R.id.list_item_view_textview);
            planetIco = (ImageView) itemView.findViewById(R.id.list_item_view_imageview);
            container = (View) itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickCallBack.onItemClick(getAdapterPosition());
        }
    }
}
