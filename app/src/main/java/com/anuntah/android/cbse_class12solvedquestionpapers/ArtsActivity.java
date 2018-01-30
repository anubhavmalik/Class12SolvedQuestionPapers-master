package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ArtsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arts_activity);


        Button english_list = (Button) findViewById(R.id.english_button);

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
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button pol_sci_list = (Button) findViewById(R.id.pol_sci_button);

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
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });


        Button history_list = (Button) findViewById(R.id.history_button);

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
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button hindi_list = (Button) findViewById(R.id.hindi_button);

        hindi_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Hindi");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button geography_button = (Button) findViewById(R.id.geography_button);

        geography_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(ArtsActivity.this, ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                extra.putString("Subject", "Geography");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });


        Button economics_list = (Button) findViewById(R.id.economics_button);

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
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });


        Button pe_list = (Button) findViewById(R.id.pe_button);

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
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });


    }
}