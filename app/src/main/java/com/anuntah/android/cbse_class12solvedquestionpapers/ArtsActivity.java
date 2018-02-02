package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class ArtsActivity extends AppCompatActivity {

    AdView bannerAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arts_activity);

        MobileAds.initialize(this,"\n" +
                "ca-app-pub-1852896435962105~9539559937");
        bannerAdView = (AdView)findViewById(R.id.arts_subject_ad);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAdView.loadAd(adRequest);


        Button english_list = findViewById(R.id.english_button);

        english_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "English");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button pol_sci_list = findViewById(R.id.pol_sci_button);

        pol_sci_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Political Science");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button history_list = findViewById(R.id.history_button);

        history_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "History");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button hindi_list = findViewById(R.id.hindi_button);

        hindi_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Hindi");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button geography_button =  findViewById(R.id.geography_button);

        geography_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);


                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Geography");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button economics_list = findViewById(R.id.economics_button);

        economics_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Economics");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button pe_list = findViewById(R.id.pe_button);

        pe_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Physical Education");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


    }
}