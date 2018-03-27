package com.car.wash.Booking_Client;

import android.widget.EditText;

/**
 * Created by sahana on 3/25/2018.
 */

public class Order {
    String id;
    String name;
    String email;
    String phone;
    String number;
    String spinner1;
    String spinner2;
    String spinner3;
    String date;
    String time;

    public Order(String s, String value1) {
    }
    public Order(String value1, String name1, String id, String name, String number1, EditText email, String value4, String spn1, String value5, String s, String spn, String spna, String spnb, int d_p) {
        this.id = id;
        this.name = name;
        this.email = this.email;
        this.phone = phone;
        this.number = number;
        this.spinner1 = spinner1;
        this.spinner2 = spinner2;
        this.spinner3 = spinner3;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpinner1() {
        return spinner1;
    }

    public void setSpinner1(String spinner1) {
        this.spinner1 = spinner1;
    }

    public String getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(String spinner2) {
        this.spinner2 = spinner2;
    }

    public String getSpinner3() {
        return spinner3;
    }

    public void setSpinner3(String spinner3) {
        this.spinner3 = spinner3;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
