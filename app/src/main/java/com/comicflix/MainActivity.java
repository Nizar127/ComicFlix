package com.comicflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.comicflix.comicflix.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout premium, basic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        premium = findViewById(R.id.premiumplan);
        basic = findViewById(R.id.basicplan);

        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PremiumPlan();
            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BasicPlan();
            }
        });
    }

    private void BasicPlan() {
        Intent intent = new Intent(MainActivity.this, StartView.class);
        startActivity(intent);
    }

    private void PremiumPlan() {

        Intent intent = new Intent(MainActivity.this, StartView.class);
        startActivity(intent);
    }
}
