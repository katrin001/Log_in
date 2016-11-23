package com.example.lenovo.myapplication;

/**
 * Created by Lenovo on 11.11.2016.
 */

public abstract class Animals{

    Animals(String name, int imageId )
    {
        this.name = name;
        this.imageId = imageId;
    }

    private String name;
    private int imageId;

    public abstract void eat();
    public abstract void sleep();

    public String getName()
    {
     return name;
    }

    public int getImageId()
    {
        return imageId;
    }
}
