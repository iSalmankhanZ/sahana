package com.car.wash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.car.wash.Booking.MakeBooking;
import com.car.wash.Booking_Client.Make_Booking;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{


    private TextView textView;
    private String userName = "User";
    Intent intent;
    private FirebaseAuth mauth;
    private ImageView mDisplayImageView;
    private TextView mNameTextView;
    private TextView mEmailTextView;
    ImageView imageView;
    FirebaseAuth mAuth;
    ImageButton imgButton;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imgButton =(ImageButton)findViewById(R.id.imgButton);
       button =(Button)findViewById(R.id.make_booking);

       imgButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               intent = new Intent(MainActivity.this,Home.class);
               startActivity(intent);
           }
       });

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               intent = new Intent(MainActivity.this,MakeBooking.class);
               startActivity(intent);
           }
       });


        mauth = FirebaseAuth.getInstance();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);




        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //Load Menu


        //get bundles that were passed
        Bundle bundle = getIntent().getExtras();
        String userName= bundle.getString("userName");
        String Email = bundle.getString("Email");
        String Phone = bundle.getString("Phone");
        String Photo = bundle.getString("Photo");




        if(bundle != null && bundle.isEmpty()){
            userName = "User";
        }else{
            if (bundle != null) {
                if(bundle.containsKey("userName")){
                    userName = bundle.getString("userName");} else{  userName = "User";}
            }
        }

        TextView txtProfileName = (TextView) navigationView.getHeaderView(0).findViewById(R.id.txtName);
        txtProfileName.setText(userName);

        TextView EmailName = (TextView) navigationView.getHeaderView(0).findViewById(R.id.textView_email);
        EmailName.setText(Email);


        TextView PhoneNumber = (TextView) navigationView.getHeaderView(0).findViewById(R.id.textView_phone);
        PhoneNumber.setText(Phone);

    }

    private void sendToAuth() {

        Intent authIntent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(authIntent);
        finish();
    }

    public void onStart()
    {
        super.onStart();;
        FirebaseUser currentuser=mauth.getCurrentUser();
        if(currentuser==null)
        {
            Intent authIntent=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(authIntent);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        }else if (id == R.id.nav_terms) {

            intent = new Intent(MainActivity.this,AddLocationActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_contact) {
            intent = new Intent(MainActivity.this,ContactActivity.class);
            startActivity(intent);

        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_mybookings) {

            intent = new Intent(MainActivity.this, MakeBooking.class);
            startActivity(intent);

        }else if (id == R.id.nav_feedback) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "sahanasonu124@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "50 Street Car Wash: Feedback");
            startActivity(intent);

        }else if (id == R.id.nav_makebooking) {
            intent = new Intent(MainActivity.this, Make_Booking.class);
            startActivity(intent);

        }else if (id == R.id.nav_services) {
            intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);

        }else if (id == R.id.nav_logout) {
            mauth.signOut();
            sendToAuth();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
