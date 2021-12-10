package com.example.fenicomputerinstituteapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

 private Button About_Fci,About_Fci1,About_Fci2,About_Fci3,About_Fci4,About_Fci5,About_Fci6,About_Fci7,About_Fci8,About_Fci9,aboutSylabus,
    probidan,webside,notice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Feni Computer Institute");

        About_Fci= findViewById(R.id.aboutbtn);

        About_Fci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,About_Fci.class);
                startActivity(intent);
            }
        });

        About_Fci1= findViewById(R.id.aboutbtn1);

        About_Fci1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Deparment.class);
                startActivity(intent);
            }
        });

        About_Fci2= findViewById(R.id.aboutbtn2);

        About_Fci2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Principal.class);
                startActivity(intent);
            }
        });

        About_Fci3= findViewById(R.id.aboutbtn3);
        About_Fci3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Teachers.class);
                startActivity(intent);
            }
        });

        About_Fci4= findViewById(R.id.aboutbtn4);

        About_Fci4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Hostel.class);
                startActivity(intent);
            }
        });

        About_Fci5= findViewById(R.id.aboutbtn5);
        About_Fci5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,About_Seif.class);
                startActivity(intent);
            }
        });

        About_Fci6= findViewById(R.id.aboutbtn6);
        About_Fci6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,AboutUS.class);
                startActivity(intent);
            }
        });



        About_Fci7= findViewById(R.id.aboutbtn8);

        About_Fci7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,OfficeStaffs.class);
                startActivity(intent);
            }
        });
        About_Fci8= findViewById(R.id.aboutbtn10);

        About_Fci8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,ClassCR.class);
                startActivity(intent);
            }
        });

        About_Fci9= findViewById(R.id.aboutbtn11);

        About_Fci9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,DepartmentHead.class);
                startActivity(intent);
            }
        });


        aboutSylabus= findViewById(R.id.Syllabus_btn11);

        aboutSylabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Syllabus.class);
                startActivity(intent);
            }
        });

        probidan= findViewById(R.id.probidan_btn);

        probidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Probidan.class);
                startActivity(intent);
            }
        });

        webside= findViewById(R.id.fciWebsite_btn);

        webside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Webside.class);
                startActivity(intent);
            }
        });


        notice= findViewById(R.id.notic_btn);

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,NoticeBoard.class);
                startActivity(intent);
            }
        });



    }
}