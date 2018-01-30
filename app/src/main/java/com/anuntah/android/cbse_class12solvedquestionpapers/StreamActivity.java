package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class StreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_activity);


        //Set intent to Science Activity
        Button stream_S = (Button) findViewById(R.id.science_button);

        stream_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(StreamActivity.this, ScienceActivity.class);
                Bundle extra = new Bundle();
                extra.putString("Stream", "Science");
                streamIntent.putExtras(extra);
                // Start the new Activity
                startActivity(streamIntent);
            }

        });

        //Set intent to Commerce Activity
        Button stream_C = (Button) findViewById(R.id.commerce_button);

        stream_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(StreamActivity.this, CommerceActivity.class);
                Bundle extra = new Bundle();
                extra.putString("Stream", "Commerce");
                streamIntent.putExtras(extra);

                // Start the new Activity
                startActivity(streamIntent);
            }

        });

        //Set intent to Commerce Activity
        Button stream_A = (Button) findViewById(R.id.arts_button);

        stream_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create new intent
                Intent streamIntent = new Intent(StreamActivity.this, ArtsActivity.class);
                Bundle extra = new Bundle();
                extra.putString("Stream", "Arts");
                streamIntent.putExtras(extra);
                // Start the new Activity
                startActivity(streamIntent);
            }

        });


    }
}