package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ScienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_activity);

        Button biology_list = (Button) findViewById(R.id.biology_button);

        biology_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Biology");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button chemistry_list = (Button) findViewById(R.id.chemistry_button);

        chemistry_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Chemistry");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button cs_list = (Button) findViewById(R.id.cs_button);

        cs_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Computer Science");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button english_list = (Button) findViewById(R.id.english_button);

        english_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "English");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button hindi_list = (Button) findViewById(R.id.hindi_button);

        hindi_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Hindi");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button maths_list = (Button) findViewById(R.id.maths_button);

        maths_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Mathematics");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });

        Button physics_list = (Button) findViewById(R.id.physics_button);

        physics_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Physics");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button pe_list = (Button) findViewById(R.id.pe_button);

        pe_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ScienceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                extra.putString("Subject", "Physical Education");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


    }
}