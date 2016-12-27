package com.melkir.googlesamplesdemo.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.melkir.googlesamplesdemo.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        if (null != getSupportActionBar()) {
            getSupportActionBar().setTitle(R.string.action_about);
        }
    }

    public void onContributorCardClick(View view) {
        String url = "http://vioncassandra.wixsite.com/portfolio";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
