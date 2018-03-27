package com.car.wash.Booking_Client;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.car.wash.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Make_Booking extends AppCompatActivity {

    EditText number, name, phone, email;
    Spinner spn1, spn2, spn3;
    Button btn;
    DatePicker dp;
    DatabaseReference database_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make__booking);

        database_order = FirebaseDatabase.getInstance().getReference("orders");

        number = (EditText) findViewById(R.id.et_Number);
        name = (EditText) findViewById(R.id.et_Name);
        phone = (EditText) findViewById(R.id.et_Phone);
        email = (EditText) findViewById(R.id.et_Email);
        spn1 = (Spinner) findViewById(R.id.sp1);
        spn2 = (Spinner) findViewById(R.id.sp2);
        spn3 = (Spinner) findViewById(R.id.sp3);
        dp = (DatePicker) findViewById(R.id.date_Picker);
        btn = (Button) findViewById(R.id.button_2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOrder();
            }
        });
    }

    private void onOrder() {


        String name1 = name.getText().toString().trim();
        String spnr = spn1.getSelectedItem().toString();
        String phone1 = phone.getText().toString().trim();
        String email1 = email.getText().toString().trim();
        String spn = spn1.getSelectedItem().toString();
        String spna = spn2.getSelectedItem().toString();
        String spnb = spn3.getSelectedItem().toString();
        String number1 = number.getText().toString().trim();
        int d_p = dp.getDayOfMonth();


            String value1 = database_order.push().getKey();
            Order order = new Order(value1,name1);
           database_order.child(value1).setValue(order);
    }
}