package com.example.smaqu.solarsystemapp.ui;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.smaqu.solarsystemapp.R;
import com.example.smaqu.solarsystemapp.adapter.RecyclerViewAdapter;
import com.example.smaqu.solarsystemapp.model.CreateData;
import com.example.smaqu.solarsystemapp.model.ListItem;

import java.util.ArrayList;
import java.util.List;

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
    private RadioGroup radioGroup;
    private AlertDialog dialog;
    private List<ListItem> arrayListItemForSort;
    private ListItem objForSorting;


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
        arrayListItemForSort = CreateData.getListData();

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
        if (id == R.id.menu_sort_item_sort_delining) {
            createDialogView();
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                    RadioButton radioButto = (RadioButton) group.findViewById(checkedId);
                    int whenToEnd,i;
                    switch (radioButto.getId()){
                        case 0:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getSemiMajorAxis() > arrayListItemForSort.get(i).getSemiMajorAxis())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);

                            listData = (ArrayList) arrayListItemForSort;
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 1:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getMass() > arrayListItemForSort.get(i).getMass())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 2:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getOrbitalPeriod() > arrayListItemForSort.get(i).getOrbitalPeriod())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 3:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getAvrDistanceToSun() > arrayListItemForSort.get(i).getAvrDistanceToSun())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                    }
                }
            });
            return true;
        }
        if (id == R.id.menu_sort_item_sort_increasing) {
            createDialogView();
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                    RadioButton radioButto = (RadioButton) group.findViewById(checkedId);
                    int whenToEnd,i;
                    switch (radioButto.getId()){
                        case 0:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getSemiMajorAxis() < arrayListItemForSort.get(i).getSemiMajorAxis())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);

                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 1:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getMass() < arrayListItemForSort.get(i).getMass())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 2:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getOrbitalPeriod() < arrayListItemForSort.get(i).getOrbitalPeriod())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                        case 3:
                            do
                            {
                                whenToEnd=0;
                                i=(arrayListItemForSort.size()-1);
                                do
                                {
                                    i--;
                                    if (arrayListItemForSort.get((i+1)).getAvrDistanceToSun() < arrayListItemForSort.get(i).getAvrDistanceToSun())
                                    {
                                        objForSorting = arrayListItemForSort.get(i);
                                        arrayListItemForSort.set(i,arrayListItemForSort.get((i+1)));
                                        arrayListItemForSort.set((i+1),objForSorting);
                                        whenToEnd=1;
                                    }
                                }
                                while (i!=0);
                            }while (whenToEnd!=0);
                            adapter.setListData(listData);
                            adapter.notifyDataSetChanged();
                            dialog.cancel();
                            break;
                    }
                }
            });
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void createDialogView(){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(RecyclerViewActivity.this);
        mBuilder.setView(createRadioButtons());
        dialog = mBuilder.create();
        dialog.show();
    }

    public View createRadioButtons(){
        View mView = getLayoutInflater().inflate(R.layout.dialog_sort_recyclerview,null);
        radioGroup = (RadioGroup) mView.findViewById(R.id.dialog_sort_radio_group);
        String[] arrayStringForRadioGrou = getResources().getStringArray(R.array.sort_by_array);
//Create the buttons
        for (int i=0;i<arrayStringForRadioGrou.length;i++){
            String radioGroupString = arrayStringForRadioGrou[i];
            RadioButton button = new RadioButton(this);
            button.setText(radioGroupString);
            button.setId(i);
            radioGroup.addView(button);
        }
        return mView;
    }
    public void listItemSortingSystem(){


    }
}


