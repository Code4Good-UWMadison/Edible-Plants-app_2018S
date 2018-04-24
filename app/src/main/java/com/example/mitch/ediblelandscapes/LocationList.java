package com.example.mitch.ediblelandscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LocationList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);

        /*
        Makes ImageButtons link to their respective location pages.
         */
        ImageButton coleLocation=(ImageButton)findViewById(R.id.coleLocation);
        coleLocation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(LocationList.this,ColeHallLocation.class));
            }
        });

        ImageButton selleryLocation=(ImageButton)findViewById(R.id.selleryLocation);
        selleryLocation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent( LocationList.this,SelleryHallLocation.class));
            }
        });

        ImageButton smithLocation=(ImageButton)findViewById(R.id.smithLocation);
        smithLocation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent( LocationList.this,SmithHallLocation.class));
            }
        });
    }
}
