package com.example.doctruyen.Model;

public class Truyen {
    private String mName;
    private int mImage;

    public Truyen() {

    }

    public Truyen(String mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
