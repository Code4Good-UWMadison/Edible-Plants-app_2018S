package com.example.mitch.ediblelandscapes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.mitch.ediblelandscapes.R;

/**
 * Created by mikaylabuford on 3/13/18.
 */

public class resources extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.resource_page);
    }
    public void asmButtonClick (View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.asm.wisc.edu/theopenseat/"));
        startActivity(browserIntent);
    }

    public void grwButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.growingpower.org/education/milwaukee-projects/"));
        startActivity(browserIntent);
    }

    public void fhkButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://fhkingstudents.wix.com/fhking#!harvest-handouts/cxro"));
        startActivity(browserIntent);
    }

    public void eagleButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.eagleheightsgardens.org/"));
        startActivity(browserIntent);
    }

    public void daneButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://dcfm.org/"));
        startActivity(browserIntent);
    }

    public void monroeButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.monroestreetfarmersmarket.org/"));
        startActivity(browserIntent);
    }

    public void eastsideButtonClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.wil-mar.org/eastside-farmers-market/"));
        startActivity(browserIntent);
    }
}
