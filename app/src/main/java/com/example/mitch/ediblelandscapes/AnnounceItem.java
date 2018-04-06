package com.example.mitch.ediblelandscapes;

/**
 * Created by Yuzi Hu on 4/5/18.
 */

public class AnnounceItem {
    private String announcementTitle;
    private String announcementDesc;
    private String announcementDescSmall;
    private String time;
    private String date;
    private int imageID;

    public AnnounceItem(String announcementTitle, String announcementDesc, String announcementDescSmall, String time, String date, int imageID) {
        this.announcementTitle = announcementTitle;
        this.announcementDesc = announcementDesc;
        this.announcementDescSmall = announcementDescSmall;
        this.time = time;
        this.date = date;
        this.imageID = imageID;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public String getAnnouncementDesc() {
        return announcementDesc;
    }

    public String getAnnouncementDescSmall() {
        return announcementDescSmall;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getImageID() {
        return imageID;
    }
}
