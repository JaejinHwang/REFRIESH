package com.example.wjjin.refriesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IngredientSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_search);
    }

    public void onClick01(View v) {
        Intent intent = new Intent(getApplicationContext(), RecipeByIngredient.class);
        startActivity(intent);
    }
}
