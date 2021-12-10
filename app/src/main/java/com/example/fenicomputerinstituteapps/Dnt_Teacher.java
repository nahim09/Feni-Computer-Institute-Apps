package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Dnt_Teacher extends AppCompatActivity {

    Button  Buttondnt,Buttondnt1, Buttondnt2,Buttondnt3,Buttondnt4,Buttondnt5,Buttondnt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnt_teacher);

        getSupportActionBar().setTitle("DNT Teacher");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Buttondnt=findViewById(R.id.mamunCall);
        Buttondnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801818591793"));
                startActivity(intent);
            }
        });

        Buttondnt1=findViewById(R.id.halalCall);

        Buttondnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801815645223"));
                startActivity(intent);
            }
        });
        Buttondnt2=findViewById(R.id.israkCall);

        Buttondnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801814722970"));
                startActivity(intent);
            }
        });
        Buttondnt3=findViewById(R.id.niraCall);

        Buttondnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801828067490"));
                startActivity(intent);
            }
        });

        Buttondnt4=findViewById(R.id.munnyCall);

        Buttondnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801616614292"));
                startActivity(intent);
            }
        });


        Buttondnt5=findViewById(R.id.nahidaCall);

        Buttondnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801615645224"));
                startActivity(intent);
            }
        });

        Buttondnt6=findViewById(R.id.tasnubaCall);

        Buttondnt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801838599437"));
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