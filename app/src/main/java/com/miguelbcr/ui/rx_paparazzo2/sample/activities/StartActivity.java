package com.miguelbcr.ui.rx_paparazzo2.sample.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.miguelbcr.ui.rx_paparazzo2.sample.R;

public class StartActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        findViewById(R.id.bt_activity).setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, SampleActivity.class));
        });

        findViewById(R.id.bt_fragment).setOnClickListener(view -> {
            startActivity(new Intent(StartActivity.this, HostActivitySampleFragment.class));
        });
    }
}
