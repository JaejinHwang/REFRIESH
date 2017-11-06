package com.example.wjjin.refriesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick01(View v) {
        Intent intent = new Intent(getApplicationContext(), Camera.class);
        startActivity(intent);
    }

    public void onClick02(View v) {
        Intent intent = new Intent(getApplicationContext(), Cookware.class);
        startActivity(intent);
    }

    public void onClick03(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuSearch.class);
        startActivity(intent);
    }

    public void onClick04(View v) {
        Intent intent = new Intent(getApplicationContext(), IngredientSearch.class);
        startActivity(intent);
    }

    public void onClick05(View v) {
        Intent intent = new Intent(getApplicationContext(), AddRecipe.class);
        startActivity(intent);
    }
}
