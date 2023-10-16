package com.noelistic.g1app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.DoubleBuffer;
import java.util.HashMap;
import java.util.List;

public class M_Activity3 extends AppCompatActivity {

    Spinner spType;
    Button btFind;
    SupportMapFragment supportMapFragment;
    GoogleMap map;
    FusedLocationProviderClient fusedLocationProviderClient;
    double currentLat = 0, currentLong = 0;

    BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_3);

//        navigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
//
//        navigationView.setSelectedItemId(R.id.about);

        spType = findViewById(R.id.sp_type);
        btFind = findViewById(R.id.bt_find);




        btFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected position of spinner



            }
        });

//        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//                switch (menuItem.getItemId())
//                {
//                    case R.id.dashbord:
//                        startActivity(new Intent(getApplicationContext(),
//                                MainActivity.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                }
//
//
//                return false;
//            }
//        });




    }









}

