package com.anuntah.android.cbse_class12solvedquestionpapers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class SciencePapers extends AppCompatActivity {
    PDFView view;
    String subject;
    String year;
    AlphaAnimation inAnimation;
    AlphaAnimation outAnimation;

    FrameLayout progressBarHolder;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_papers);
        progressBarHolder =  findViewById(R.id.progressBarHolder);

        inAnimation = new AlphaAnimation(0f, 1f);
        inAnimation.setDuration(200);
        progressBarHolder.setAnimation(inAnimation);
        progressBarHolder.setVisibility(View.VISIBLE);


        Intent sub_sci = getIntent();
        Bundle mBundle = sub_sci.getExtras();
        subject = mBundle.getString("subject");
        year = mBundle.getString("year");
        String filename = subject + "_" + year.substring(year.length() - 4, year.length())+".pdf";
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();

        StorageReference islandRef = storageRef.child(filename);


        final long ONE_MEGABYTE = 1024 * 1024 * 5;
        islandRef.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {



            @Override
            public void onSuccess(byte[] bytes) {
                view = (PDFView) findViewById(R.id.webView1);
                view.fromBytes(bytes).load();
                outAnimation = new AlphaAnimation(1f, 0f);
                outAnimation.setDuration(200);
                progressBarHolder.setAnimation(outAnimation);
                progressBarHolder.setVisibility(View.GONE);
               // Toast.makeText(getApplicationContext(), "File Downloaded successfully",
                       // Toast.LENGTH_LONG).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
            }
        });
        };


    }


