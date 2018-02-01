package com.anuntah.android.cbse_class12solvedquestionpapers;

/**
 * Created by Aman Tyagi on 22-09-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ScienceYearsListActivity extends AppCompatActivity {
    YearAdapter adaptor;
    String Stream;
    String Subject;
    QuestionsPaper questionsPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_10_years);
        final ArrayList<Year> years = new ArrayList<>();
        Intent sub_sci = getIntent();
        Bundle mBundle = sub_sci.getExtras();
        Stream = mBundle.getString("Stream");
        Subject = mBundle.getString("Subject");
        adaptor = new YearAdapter(this, years, R.color.grey_background);


        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        firebaseFirestore.collection("solved papers")
                .whereEqualTo("subject", Subject)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            if (task.getResult() != null) {

                                for (DocumentSnapshot documentSnapshot : task.getResult()) {
                                    questionsPaper = documentSnapshot.toObject(QuestionsPaper.class);
                                    years.add(new Year(Integer.parseInt(questionsPaper.year)));
                                    Log.d("TAGGER", questionsPaper.year + "");
                                }
                                sortList(years);
                                adaptor.notifyDataSetChanged();
                            }

                            else {
                                Toast.makeText(ScienceYearsListActivity.this, "Couldn't update list", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(ScienceYearsListActivity.this, "Failed to fetch records", Toast.LENGTH_SHORT).show();
                    }
                });
        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        firebaseFirestore.setFirestoreSettings(settings);

        final ListView listView = (ListView) findViewById(R.id.list10Years);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(ScienceYearsListActivity.this, SciencePapers.class);
                final TextView tv_id = (TextView) view.findViewById(R.id.year_text_view);
                String txt = tv_id.getText().toString();
                intent.putExtra("year", txt);
                intent.putExtra("stream", Stream);
                intent.putExtra("subject", Subject);
                startActivity(intent);
            }
        });


        listView.setAdapter(adaptor);
    }

    private void sortList(ArrayList<Year> list) {
        Collections.sort(list, new Comparator<Year>() {

            @Override
            public int compare(Year year, Year t1) {
                Integer idea1 = new Integer(year.getYear());
                Integer idea2 = new Integer(t1.getYear());
                return idea1.compareTo(idea2);
            }
        });
    }



}