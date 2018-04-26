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

import org.w3c.dom.Text;

public class ColeHallLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cole_hall_location);

        TextView mapsLink = (TextView) findViewById(R.id.mapsLink);
        TextView beanRecipes = (TextView) findViewById(R.id.recipesBeans);
        TextView peasRecipes = (TextView) findViewById(R.id.recipesPeas);
        TextView borageRecipes = (TextView) findViewById(R.id.recipesBorage);

        mapsLink.setMovementMethod(LinkMovementMethod.getInstance());
        beanRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        peasRecipes.setMovementMethod(LinkMovementMethod.getInstance());
        borageRecipes.setMovementMethod(LinkMovementMethod.getInstance());


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("plant/beans/quantity");
        final TextView beans = (TextView) findViewById(R.id.beans);
        final TextView peas = (TextView) findViewById(R.id.peas);
        final TextView borage = (TextView) findViewById(R.id.borage);

        myRef = database.getReference("plant/beans/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                beans.setText("Beans: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        myRef = database.getReference("plant/peas/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                peas.setText("Peas: " + value.toString() + " available.");
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                // Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        myRef = database.getReference("plant/borrage/quantity");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                borage.setText("Borrage: " + value.toString() + " available.");
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
