package com.example.gamewiki;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class game_detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);

        ImageView gameImage = findViewById(R.id.gameImage);
        TextView gameLongDescription = findViewById(R.id.gameLongDescription);

        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String longDescription = getIntent().getStringExtra("longDescription");

        gameImage.setImageResource(imageResId);
        gameLongDescription.setText(longDescription);
    }
}