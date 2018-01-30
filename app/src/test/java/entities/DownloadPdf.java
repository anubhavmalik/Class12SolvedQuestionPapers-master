package entities;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by Aman Tyagi on 29-10-2017.
 */

public class DownloadPdf extends AsyncTask<String, Integer, String>  {
    OnDataSendToActivity dataSendToActivity;
    public DownloadPdf(Activity activity){
        FirebaseStorage storage=FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();

        StorageReference islandRef = storageRef.child("Accountancy_2008.pdf");


        final long ONE_MEGABYTE = 1024 * 1024*5;
        islandRef.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
              //  view = (PDFView) findViewById(R.id.webView1);
               // view.fromBytes(bytes);
                dataSendToActivity.sendData(bytes);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
            }
        });
    }

    @Override
    protected String doInBackground(String... args)
    {
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
       // dataSendToActivity.sendData(result);
    }
}
