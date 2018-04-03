package com.example.mitch.ediblelandscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // hello nice work
    // test 2
    // test 3
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contacts=(Button)findViewById(R.id.contacts);
        contacts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,Contacts.class));
            }

        });

        Button announcements=(Button)findViewById(R.id.announcements);
        announcements.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,Annoucement.class));
            }

        });

        Button resources=(Button)findViewById(R.id.resources);
        resources.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,resources.class));
            }

        });


    }
}
