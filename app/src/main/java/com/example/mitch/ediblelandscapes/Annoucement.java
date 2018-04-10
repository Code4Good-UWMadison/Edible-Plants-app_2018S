package com.example.mitch.ediblelandscapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Annoucement extends AppCompatActivity {

    private List<AnnounceItem> newsFeed = new ArrayList<AnnounceItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annoucement);

        newsFeed.add(new AnnounceItem("New Vegetables!", "There are new vegetables today!", "9am", "04/05/2018", R.mipmap.ic_launcher));

        ArrayAdapter<AnnounceItem> adapter = new customAdapter();

        ListView announcements = (ListView) (findViewById(R.id.announcementItems));
        announcements.setAdapter(adapter);

    }

    // back to homepage
    Intent home = new Intent(Annoucement.this, MainActivity.class);
    public void backToHomepage(){
        startActivity(home);
    }

    private class customAdapter extends ArrayAdapter<AnnounceItem> {
        public customAdapter() {
            super(Annoucement.this, R.layout.news, newsFeed);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.news, parent, false);
            }

            AnnounceItem currAnnounce = newsFeed.get(position);

            ImageView newsPhoto = (ImageView) convertView.findViewById(R.id.newsPhoto);
            TextView newsTitle = (TextView) convertView.findViewById(R.id.newsTitle);
            TextView newsDesc = (TextView) convertView.findViewById(R.id.newsDesc);

            newsPhoto.setImageResource(currAnnounce.getImageID());
            newsTitle.setText(currAnnounce.getAnnouncementTitle());
            newsDesc.setText(currAnnounce.getAnnouncementDesc());

            return convertView;
        }
    }
}
