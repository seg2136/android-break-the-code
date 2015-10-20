package com.epicodus.breakthecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mEnrollButton;
    private Button mSponsorButton;
    private Button mNonProfitPartnersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorButton = (Button) findViewById(R.id.sponsorsButton);
        mNonProfitPartnersButton = (Button) findViewById(R.id.nonProfitButton);

        mNonProfitPartnersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NonProfitActivity.class);
                startActivity(intent);
            }
        });

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);
            }
        });

        mSponsorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);
            }
        });
    }
}
