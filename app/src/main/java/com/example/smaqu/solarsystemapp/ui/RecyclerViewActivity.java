package com.example.smaqu.solarsystemapp.ui;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
    private static final String EXTRA_PLANET_NAME= "PLANET_NAME";
    private static final String EXTRA_PLANET_MASS = "PLANET_MASS";
    private static final String EXTRA_PLANET_DISTANCE = "PLANET_DISTANCE";
    private static final String EXTRA_PLANET_PERIOD = "PLANET_PERIOD";
    private static final String EXTRA_PLANET_SEMIMAJORAXIS = "PLANET_AXIS";

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
        extras.putLong(EXTRA_PLANET_SEMIMAJORAXIS,item.getSemiMajorAxis());
        extras.putDouble(EXTRA_PLANET_MASS,item.getMass());
        extras.putDouble(EXTRA_PLANET_PERIOD,item.getOrbitalPeriod());
        extras.putLong(EXTRA_PLANET_DISTANCE,item.getAvrDistanceToSun());
        extras.putString(EXTRA_PLANET_NAME,item.getPlanetName());

        intent.putExtra(BUNDLE_EXTRAS, extras);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sort, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            AlertDialog.Builder mBulider = new AlertDialog.Builder(RecyclerViewActivity.this);
            View mView = getLayoutInflater().inflate(R.layout.dialog_sort_recyclerview,null);

            mBulider.setView(mView);
            AlertDialog dialog = mBulider.create();
            dialog.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

