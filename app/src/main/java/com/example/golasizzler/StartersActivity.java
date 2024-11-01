package com.example.golasizzler;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Celeriac and mushroom soup", "Mushroom soup with a touch of celeriac", 999),
                new Dish("Cheese and chickpea gyoza", "Gyoza with a touch of cheese", 899),
                new Dish("Pesto and chickpea wontons", "Wonton soup with a touch of pesto", 799),
                new Dish("Avocado and egg sushi", "Edamame with a touch of avocado", 699),
                new Dish("Honey and caramel mousse", "A sweet mousse made with honey and caramel", 1099),
                new Dish("Yoghurt and rice soup", "A nutritious soup made with yoghurt and rice", 399),
                new Dish("Cauliflower and kohlrabi soup", "A soup made with cauliflower and kohlrabi", 499),
                new Dish("Parsley and horseradish dumplings", "Dumplings made with parsley and horseradish", 599),
                new Dish("Coconut and chilli mousse", "A sweet mousse made with coconut and chilli", 1199),
                new Dish("Celeriac and squash dumplings", "Dumplings made with celeriac and squash", 989)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}