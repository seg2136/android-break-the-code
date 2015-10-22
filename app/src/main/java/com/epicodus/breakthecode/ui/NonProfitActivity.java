package com.epicodus.breakthecode.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.Partner;
import com.epicodus.breakthecode.models.PartnerLib;

public class NonProfitActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;
    private Button mHomeButton;

    private PartnerLib mPartnerLib;
    private Partner mCurrentPartner;

    public NonProfitActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mPartnerImage = (ImageView) findViewById(R.id.partnerImage);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mPartnerLib = new PartnerLib();
        mCurrentPartner = mPartnerLib.getPartners().get(0);

        setLayoutContent();


        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentPartner = mPartnerLib.nextPartner(mCurrentPartner);
                setLayoutContent();
            }
        });

        mHomeButton = (Button) findViewById(R.id.homeButton);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonProfitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mPartnerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mCurrentPartner.getWebsite()));
                startActivity(intent);
            }
        });
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentPartner.getName());
        mDescriptionLabel.setText(mCurrentPartner.getDescription());
        mPartnerImage.setImageResource(mCurrentPartner.getImage());
    }
}
