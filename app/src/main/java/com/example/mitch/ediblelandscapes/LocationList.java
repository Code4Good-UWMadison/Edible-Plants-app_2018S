package com.example.mitch.ediblelandscapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocationList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);
    }

    public void goColeLocation(View view) {
        Intent intent = new Intent(this, ColeHallLocation.class);
        startActivity(intent);
    }

    public void goSelleryLocation(View view) {
        Intent intent = new Intent (this, SelleryHallLocation.class);
        startActivity(intent);
    }

    public void goSmithLocation(View view) {
        Intent intent = new Intent (this, SmithHallLocation.class);
        startActivity(intent);
    }
}
