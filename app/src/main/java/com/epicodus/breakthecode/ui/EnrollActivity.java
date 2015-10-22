package com.epicodus.breakthecode.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.breakthecode.R;

public class EnrollActivity extends AppCompatActivity {

    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mHomeButton = (Button) findViewById(R.id.homeButton);

        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnrollActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
