package com.example.cookingbook.models;

import android.media.Image;
import android.widget.ImageView;

public class Food {
    private int photo;
    private String link;

    public Food(int photo, String link) {
        this.photo = photo;
        this.link = link;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
