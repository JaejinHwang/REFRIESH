package com.example.wjjin.refriesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_search);
    }

    public void onClick01(View v) {
        Intent intent = new Intent(getApplicationContext(), RecipeSearch.class);
        startActivity(intent);
    }
}
