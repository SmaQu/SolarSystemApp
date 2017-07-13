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

import com.example.smaqu.solarsystemapp.R;

public class PlanetDetailActivity extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_PLANET_DETAIL = "PLANET_DETAIL";
    private static final String EXTRA_PLANET_IMAGE = "PLANET_IMAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        ((ImageView)findViewById(R.id.planet_detail_imageView)).setImageResource(extras.getInt(EXTRA_PLANET_IMAGE));
        ((TextView)findViewById(R.id.planet_detail_textView)).setText(extras.getString(EXTRA_PLANET_DETAIL));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(PlanetDetailActivity.this,WebActivity.class);
                intent.putExtra(BUNDLE_EXTRAS,extras);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}
