package com.example.cookingbook.models;

import android.media.Image;
import android.widget.ImageView;

public class Food {
    private int photo;
    private String link;
    private String name;

    public Food(int photo, String link,String name) {
        this.photo = photo;
        this.link = link;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
