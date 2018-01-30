package com.anuntah.android.cbse_class12solvedquestionpapers;

import android.app.Application;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Aman Tyagi on 22-01-2018.
 */


    public class FireApp extends Application {
    static public FirebaseAuth mAuth;

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}

