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

public class SmithHallLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smith_hall_location);

        TextView mapsLink = (TextView) findViewById(R.id.mapsLink);
        TextView beetRecipes = (TextView) findViewById(R.id.recipesBeets);
        TextView radishRecipes = (TextView) findViewById(R.id.recipesRadishes);
        TextView carrotRecipes = (TextView) findViewById(R.id.recipesCarrot);

        mapsLink.setMovementMethod(LinkMovementMethod.getInstance());
        beetRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        radishRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        carrotRecipes.setMovementMethod(LinkMovementMethod.getInstance());

        /*TextView plants[] = new TextView[3];
        for (TextView plant : plants){
            plant = (TextView) findViewById()
        }
        */
        final TextView beets = (TextView) findViewById(R.id.beets);
        final TextView radish = (TextView) findViewById(R.id.radish);
        final TextView carrot = (TextView) findViewById(R.id.carrot);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef;

        myRef = database.getReference("plant/beets/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                beets.setText("Beets: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef = database.getReference("plant/radish/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                radish.setText("Radish: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef = database.getReference("plant/carrot/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                carrot.setText("Carrots: " + value.toString() + " available.");
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
