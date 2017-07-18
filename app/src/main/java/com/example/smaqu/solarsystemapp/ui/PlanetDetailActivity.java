package com.example.smaqu.solarsystemapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smaqu.solarsystemapp.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PlanetDetailActivity extends AppCompatActivity  {

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_PLANET_DETAIL = "PLANET_DETAIL";
    private static final String EXTRA_PLANET_IMAGE = "PLANET_IMAGE";
    private static final String EXTRA_PLANET_NAME= "PLANET_NAME";
    private static final String EXTRA_PLANET_MASS = "PLANET_MASS";
    private static final String EXTRA_PLANET_DISTANCE = "PLANET_DISTANCE";
    private static final String EXTRA_PLANET_PERIOD = "PLANET_PERIOD";
    private static final String EXTRA_PLANET_SEMIMAJORAXIS = "PLANET_AXIS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        ((ImageView)findViewById(R.id.planet_detail_imageView))
                .setImageResource(extras.getInt(EXTRA_PLANET_IMAGE));
        ((TextView)findViewById(R.id.planet_detail_textView))
                .setText(extras.getString(EXTRA_PLANET_DETAIL));
        ((TextView)findViewById(R.id.planet_detail_planet_name_textView))
                .setText("Planeta: "+extras.getString(EXTRA_PLANET_NAME));
        ((TextView)findViewById(R.id.planet_detail_planet_semiMajorAxis_textView))
                .setText("Srednia połowa obwodu: "+extras.getLong(EXTRA_PLANET_SEMIMAJORAXIS)+" km");
        ((TextView)findViewById(R.id.planet_detail_planet_mass_textView))
                .setText("Masa planety: "+extras.getDouble(EXTRA_PLANET_MASS)+ " x10^23 kg");
        ((TextView)findViewById(R.id.planet_detail_planet_avrDistanceToSun_textView))
                .setText("Odległoś od słońca: "+extras.getLong(EXTRA_PLANET_DISTANCE)+ " km");
        ((TextView)findViewById(R.id.planet_detail_planet_orbitalPeriod_textView))
                .setText("Okres orbitalny: "+extras.getDouble(EXTRA_PLANET_PERIOD)+" dni");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(PlanetDetailActivity.this,WebActivity.class);
                intent.putExtra(BUNDLE_EXTRAS, extras);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}
