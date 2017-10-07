package com.blowapp.tourguide;

/**
 * Created by Aran on 10/6/2017.
 */

public class LocationItem {
    private int image;
    private String name;
    private String phoneNumber;
    private String address;


    public LocationItem(int image, String name, String phoneNumber, String address) {
        this.image = image;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public LocationItem(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
