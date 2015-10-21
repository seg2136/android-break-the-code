package com.epicodus.breakthecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NonProfitActivity extends AppCompatActivity {

    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        mHomeButton = (Button) findViewById(R.id.homeButton);

        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonProfitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
