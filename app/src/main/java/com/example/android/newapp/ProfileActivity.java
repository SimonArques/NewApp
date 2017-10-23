package com.example.android.newapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    Button makeCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        makeCall = (Button) findViewById(R.id.makeCall);
        makeCall.setOnClickListener(ProfileActivity.this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        String temp = "tel:" + "0668735557";
        intent.setData(Uri.parse(temp));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent);
    }
}
