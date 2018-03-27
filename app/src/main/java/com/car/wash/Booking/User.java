package com.car.wash.Booking;

import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by sahana on 3/23/2018.
 */

public class User {
    private String Reg_Number;
    private String Phone;
    private String Name;
    private String City;
    private String Car_List;
    private String Date;
    private String Time;
    private String Email;
    private Integer Orderno;


    public User(String value1, EditText name1) {
    }

    public User(String reg_Number, String phone, String name, String city, String car_List, String date, String time, String email, Integer orderno) {
        Reg_Number = reg_Number;
        Phone = phone;
        Name = name;
        City = city;
        Car_List = car_List;
        Date = date;
        Time = time;
        Email = email;
        Orderno = orderno;
    }

    public String getReg_Number() {
        return Reg_Number;
    }

    public void setReg_Number(String reg_Number) {
        Reg_Number = reg_Number;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCar_List() {
        return Car_List;
    }

    public void setCar_List(String car_List) {
        Car_List = car_List;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getOrderno() {
        return Orderno;
    }

    public void setOrderno(Integer orderno) {
        Orderno = orderno;
    }
}
