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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;


public class ScienceYearsListActivity extends AppCompatActivity {
    YearAdaptor adaptor;
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
        adaptor = new YearAdaptor(this, years, R.color.grey_background);


        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        firebaseFirestore.collection("solved papers")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            for(DocumentSnapshot documentSnapshot : task.getResult()){
                                questionsPaper = documentSnapshot.toObject(QuestionsPaper.class);
                                years.add(new Year(questionsPaper.year));
                                Log.d("TAGGER",questionsPaper.year+"");
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
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("QuestionPapers");
//
//
//        myRef.orderByChild("subject").equalTo(Subject).addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//                    QuestionsPaper ques = postSnapshot.getValue(QuestionsPaper.class);
//                    years.add(new Year(ques.year));
//                }
//                adaptor.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//              //  Log.w("Tag", "Failed to read value.", error.toException());
//            }
//        });
//


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
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


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adaptor);
    }


}