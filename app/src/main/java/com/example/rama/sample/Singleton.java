package com.example.rama.sample;

/**
 * Created by Rama on 05-02-2016.
 */
public class Singleton {

    private static Singleton mInstance = null;

    private String mString;

    private Singleton(){
        mString = "Hello";
    }

    public static Singleton getInstance(){
        if(mInstance == null)
        {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getString(){
        return this.mString;
    }

    public void setString(String value){
        mString = value;
    }
}
