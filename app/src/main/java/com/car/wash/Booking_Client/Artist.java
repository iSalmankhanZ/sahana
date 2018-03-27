package com.car.wash.Booking_Client;

import android.widget.EditText;

/**
 * Created by sahana on 3/25/2018.
 */

public class Artist {

    String a_id;
    String a_name;
    String a_number;
    String a_phone;
    String a_email;
    String a_spinner;
    String a_spinner1;
    String a_spinner2;
    String datepicker;
    String time;

    public Artist() {
    }

    public Artist(String a_id, String a_name, String a_number, String a_phone, String a_email, String a_spinner, String a_spinner1, String a_spinner2, String datepicker, String time) {
        this.a_id = a_id;
        this.a_name = a_name;
        this.a_number = a_number;
        this.a_phone = a_phone;
        this.a_email = a_email;
        this.a_spinner = a_spinner;
        this.a_spinner1 = a_spinner1;
        this.a_spinner2 = a_spinner2;
        this.datepicker = datepicker;
        this.time = time;
    }

    public Artist(String value1) {
    }

    public Artist(String value1, EditText name) {
    }

    public String getA_id() {
        return a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public String getA_number() {
        return a_number;
    }

    public String getA_phone() {
        return a_phone;
    }

    public String getA_email() {
        return a_email;
    }

    public String getA_spinner() {
        return a_spinner;
    }

    public String getA_spinner1() {
        return a_spinner1;
    }

    public String getA_spinner2() {
        return a_spinner2;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public String getTime() {
        return time;
    }
}