package com.car.wash.Booking;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by sahana on 3/24/2018.
 */

public class CarWash extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
