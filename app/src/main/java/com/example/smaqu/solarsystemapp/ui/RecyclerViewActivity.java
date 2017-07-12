package com.example.smaqu.solarsystemapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.example.smaqu.solarsystemapp.R;
import com.example.smaqu.solarsystemapp.adapter.RecyclerViewAdapter;
import com.example.smaqu.solarsystemapp.model.CreateData;
import com.example.smaqu.solarsystemapp.model.ListItem;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickCallBack {

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_PLANET_DETAIL = "PLANET_DETAIL";
    private static final String EXTRA_PLANET_IMAGE = "PLANET_IMAGE";
    private static final String EXTRA_PLANET_WIKI = "WEB_WIKI";

    private RecyclerView recView;
    private RecyclerViewAdapter adapter;
    private ArrayList listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        listData = (ArrayList) CreateData.getListData();
        recView = (RecyclerView) findViewById(R.id.recycler_view_recview);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerViewAdapter(CreateData.getListData(),this);
        recView.setAdapter(adapter);
        adapter.setItemClickCallBack(this);
    }

    @Override
    public void onItemClick(int pos) {
        ListItem item = (ListItem) listData.get(pos);

        Intent intent = new Intent(this, PlanetDetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_PLANET_DETAIL,item.getDetailText());
        extras.putInt(EXTRA_PLANET_IMAGE,item.getBigDetailImage());
        extras.putString(EXTRA_PLANET_WIKI,item.getPlanetWiki());

        intent.putExtra(BUNDLE_EXTRAS, extras);
        startActivity(intent);

    }
}
