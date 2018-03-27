package com.car.wash.Booking;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.car.wash.AppBaseActivity;
import com.car.wash.Home;
import com.car.wash.R;
import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MakeBooking extends AppBaseActivity {

    private EditText edtnumber, edtphone, edtname, edtemail;
    private Button button2;
    private Firebase refr;
    private Spinner spinner, spinner2, spinner3;
    private DatePicker dp;
    private Integer startYear, startMonth, startDay;
    Context context;
    FirebaseDatabase database;
    DatabaseReference ref;
    private FirebaseAuth mauth;
    //User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_booking);


        mauth = FirebaseAuth.getInstance();
        refr = new Firebase("https://carwash-a59df.firebaseio.com/Category01/Booking");
        ref = FirebaseDatabase.getInstance().getReference("new_orders");


        edtnumber = (EditText) findViewById(R.id.edtNumb);
        edtphone = (EditText) findViewById(R.id.edtPhone);
        edtname = (EditText) findViewById(R.id.edtName);
        button2 = (Button) findViewById(R.id.button2);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        dp = (DatePicker) findViewById(R.id.datePicker);
        edtemail = (EditText) findViewById(R.id.edtEmail);


        //StringBuilder builder = new StringBuilder();
        //builder.append("Date :"+dp.getDayOfMonth()+"\n");
        //dp.getDayOfMonth();
        //builder.append("Month :"+(dp.getMonth()+1)+"\n");
        //builder.append("Year :"+dp.getYear());


        final ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MakeBooking.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.service));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);

        final ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MakeBooking.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.car_list));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter2);

        final ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(MakeBooking.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.time));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(myAdapter3);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOrder();
            }
        });
    }

    private void onOrder(){

         String value = edtnumber.getText().toString().trim();


         if (!TextUtils.isEmpty(value)) {
             ref.child("Reg_Number").setValue(value);

         } else {
             Intent intent = new Intent(MakeBooking.this, MakeBooking.class);
            Toast.makeText(MakeBooking.this, "Enter a Number", Toast.LENGTH_SHORT).show();
        }


        //Firebase mrefr = refr.child("Reg_Number");

        String value1 = edtphone.getText().toString();
                    String valueb = ref.push().getKey();

                    //Firebase mrefr1 = refr.child("Phone");
        ref.child("Phone").setValue(value1);

        String value2 = edtname.getText().toString();
        //Firebase mrefr2 = refr.child("Name");
        ref.child("Name").setValue(value2);

        String value3 = spinner.getSelectedItem().toString();
        //Firebase mrefr3 = refr.child("Service");
        ref.child("Service").setValue(value3);

        String value4 = spinner2.getSelectedItem().toString();
        //Firebase mrefr4 = refr.child("Car");
        ref.child("Car").setValue(value4);

        int value5 = dp.getDayOfMonth();
        //Firebase mrefr5 = refr.child("Date");
        ref.child("Date").setValue(value5);

        String value6 = spinner3.getSelectedItem().toString();
        //Firebase mrefr6 = refr.child("Time");
        ref.child("Time").setValue(value6);

        String value7 = edtemail.getText().toString();
        //Firebase mrefr7 = refr.child("Email");
         ref.child("Email").setValue(value7);

                Intent intent = new Intent(MakeBooking.this, Home.class);
                Toast.makeText(MakeBooking.this, "Booking Placed.",
                        Toast.LENGTH_SHORT).show();
                startActivity(intent);


    }
}

 /*       edtname=(EditText)findViewById(R.id.edtName);
        edtname1=(EditText)findViewById(R.id.edtName1);
        edtname2=(EditText)findViewById(R.id.edtName2);
        button = (Button)findViewById(R.id.button2);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");
        user = new User();
    }
    private void getValues()
    {
        user.setName(edtname.getText().toString());
        user.setName1(edtname1.getText().toString());
        user.setName2(edtname2.getText().toString());
    }

    public void button2(View view) {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ref.child("User01").setValue(user);
                Toast.makeText(MakeBooking.this,"Entered",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }*/


