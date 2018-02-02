package com.anuntah.android.cbse_class12solvedquestionpapers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class logo_description extends AppCompatActivity {

    AdView bannerAdView;
    AdView bannerAdview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_description);

        // adTop
        MobileAds.initialize(this,"\n" +
                "ca-app-pub-1852896435962105~9539559937");
        bannerAdView = (AdView)findViewById(R.id.description_ad);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        bannerAdView.loadAd(adRequest);

        //adBottom
        MobileAds.initialize(this,"\n" +
                "ca-app-pub-1852896435962105~9539559937");
        bannerAdview2 = (AdView)findViewById(R.id.description_ad2);
        AdRequest adRequest2 = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        bannerAdview2.loadAd(adRequest2);

    }
}
