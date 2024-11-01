package com.example.golasizzler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_main_course);

        //noinspection Convert2Lambda
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainsActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:golasizzlers@example.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        CardView dessertCard = findViewById(R.id.card_view_desserts);
        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertActivityIntent);
            }
        });
    }
}