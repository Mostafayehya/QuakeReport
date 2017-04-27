package com.example.android.quakereport;

/**
 * Created by mostafayehya on 26/04/17.
 */

public class EarthQuake {

    private int quakeMagnitudeId ;
    private int locationId ;
    private int dateId ;

    public EarthQuake(int qm , int loc , int time){
        quakeMagnitudeId=qm;
        locationId= loc;
        dateId= time ;
    }

    int getQuakeMagnitude(){
        return quakeMagnitudeId;
    }

    int getLocation(){
        return locationId;
    }

    int getDate(){
        return dateId;
    }
}
