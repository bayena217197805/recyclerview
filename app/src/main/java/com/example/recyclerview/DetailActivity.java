package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageViewDetail;
    private TextView textViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewDetail = findViewById(R.id.imageViewDetail);
        textViewDetail = findViewById(R.id.textViewDetail);

        Intent intent = getIntent();
        String stoneName = intent.getStringExtra("stone_name");
        int stoneImage = intent.getIntExtra("stone_image", 0);
        int stoneIndex = intent.getIntExtra("stone_index", 0);


        textViewDetail.setText(stoneName);
        imageViewDetail.setImageResource(stoneImage);


        String[] details = getResources().getStringArray(R.array.details);
        if (stoneIndex >= 0 && stoneIndex < details.length) {
            textViewDetail.append("\n\n" + details[stoneIndex]);
        }
    }
}