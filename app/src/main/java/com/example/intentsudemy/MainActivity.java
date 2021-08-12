package com.example.intentsudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view webpage ****************************************
        /*String url = "https://yahoo.com";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);*/

        //open dial*******************************************
        /*String phoneNumber = "71186432";
        Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
        startActivity(intent1);*/

        //open youtube vd **************************************
       /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/r72Uqt9Xxdk"));
        startActivity(intent);*/

        //open yt app without any vd // open application using intent ************************************************
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(intent);

    }
}