package com.example.golasizzler;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        ListView dessertsListView = findViewById(R.id.list_view_desserts);
        Dish[] desserts = {
                new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499),
                new Dish("Gulab jamun with pistachios", "Gulab jamun served with pistachios and fresh mint", 599)
        };
        ArrayAdapter<Dish> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsListView.setAdapter(adapter);
    }
}