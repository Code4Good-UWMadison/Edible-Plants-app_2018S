package com.example.mitch.ediblelandscapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SelleryHallLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellery_hall_location);

        TextView mapsLink = (TextView) findViewById(R.id.mapsLink);
        TextView kaleRecipes = (TextView) findViewById(R.id.recipesKale);
        TextView chardRecipes = (TextView) findViewById(R.id.recipesChard);
        TextView basilRecipes = (TextView) findViewById(R.id.recipesBasil);

        mapsLink.setMovementMethod(LinkMovementMethod.getInstance());
        kaleRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        chardRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        basilRecipes.setMovementMethod(LinkMovementMethod.getInstance());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("location/Smith/name");
        final TextView kale = (TextView) findViewById(R.id.kale);
        final TextView chard = (TextView) findViewById(R.id.chard);
        final TextView basil = (TextView) findViewById(R.id.basil);

        myRef = database.getReference("plant/kale/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                kale.setText("Kale: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef = database.getReference("plant/chard /quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                chard.setText("Chard: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef = database.getReference("plant/basil/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                basil.setText("Basil: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
    }
}
