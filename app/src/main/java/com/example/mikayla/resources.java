package com.example.mikayla;

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
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asm.wisc.edu/theopenseat/"));
        startActivity(browserIntent);
    }

}
