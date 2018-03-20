package com.vecterix.android.tourguideapp;

public class Location{

    final private String siteName;

    final private String city;

    final private String state;

    final private int imageResourceId;

    final private String description;

    Location(String siteName, String city, String state, int imageResourceId, String description) {
        this.siteName = siteName;
        this.city = city;
        this.state = state;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    String getSiteName() {return siteName;}
    String getCity() {return city;}
    String getState() {return state;}
    int getImageResourceId() {return imageResourceId;}
    String getDescription() {return description;}

}
