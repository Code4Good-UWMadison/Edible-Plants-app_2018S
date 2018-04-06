package com.example.mitch.ediblelandscapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class Annoucement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annoucement);
    }

    // back to homepage
    Intent home = new Intent(Annoucement.this, MainActivity.class);
    public void backToHomepage(){
        startActivity(home);
    }
}
