package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class Rs_Teacher extends AppCompatActivity {

    Button ButtonRs,ButtonRs1,ButtonRs2,ButtonRs3,ButtonRs4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_teacher);

        getSupportActionBar().setTitle("RS Teacher");


        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ButtonRs=findViewById(R.id.dabanathCall);
        ButtonRs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:=+8801711583992"));
                startActivity(intent);
            }
        });
        ButtonRs1=findViewById(R.id.rajibCall);
        ButtonRs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801767911281"));
                startActivity(intent);
            }
        });
        ButtonRs2=findViewById(R.id.dulalCall);
        ButtonRs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801724363463"));
                startActivity(intent);
            }
        });
        ButtonRs3=findViewById(R.id.mojidCall);
        ButtonRs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801843492677"));
                startActivity(intent);
            }
        });

        ButtonRs4=findViewById(R.id.sanoyarCall);
        ButtonRs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801737463844"));
                startActivity(intent);
            }
        });

    }
    //back button use jnno
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}