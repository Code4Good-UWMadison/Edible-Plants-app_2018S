package com.example.mitch.ediblelandscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Button homeButton=(Button)findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener(){
                public void onClick (View v){
                    startActivity(new Intent(Contacts.this,MainActivity.class));
        }
        });
    }
}
