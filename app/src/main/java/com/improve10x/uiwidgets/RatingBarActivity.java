package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        RatingBar ratingBar = findViewById(R.id.rating_bar);
        Button buttonBtn = findViewById(R.id.submit_btn);
        buttonBtn.setOnClickListener(v -> {
            String rating = String.valueOf(ratingBar.getRating());
            Toast.makeText(this, "RATING"+rating , Toast.LENGTH_LONG).show();
        });
    }
}