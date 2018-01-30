package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class CommerceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commerce_activity);


        Button accountancy_list = (Button) findViewById(R.id.accountancy_button);

        accountancy_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "Accountancy");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
            }

        });


        Button economics_list = (Button) findViewById(R.id.economics_button);

        economics_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "Economics");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button bs_list = (Button) findViewById(R.id.bs_button);

        bs_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "Business Studies");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button maths_list = (Button) findViewById(R.id.maths_button);

        maths_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "Maths");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button english_list = (Button) findViewById(R.id.english_button);

        english_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "English");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

        Button hindi_list = (Button) findViewById(R.id.hindi_button);

        hindi_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this, ScienceYearsListActivity.class);

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


        Button pe_list = (Button) findViewById(R.id.pe_button);

        pe_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(CommerceActivity.this,
                        ScienceYearsListActivity.class);

                // Start the new Activity
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                extra.putString("Subject", "Physical Education");
                streamIntent.putExtras(extra);
                startActivity(streamIntent);
                startActivity(streamIntent);
            }

        });

    }
}