package com.car.wash.Booking;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by sahana on 3/26/2018.
 */

public class Order {
    String name;
    String email;
    String phone;
    String number;
    String spinner1;
    String spinner2;
    String spinner3;
    String date;
    String time;

    public Order(String s) {
    }

    public Order(String name, String email, String phone, String number, String spinner1, String spinner2, String spinner3, String date, String time) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.number = number;
        this.spinner1 = spinner1;
        this.spinner2 = spinner2;
        this.spinner3 = spinner3;
        this.date = date;
        this.time = time;
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
