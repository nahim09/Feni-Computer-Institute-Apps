package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Deparment extends AppCompatActivity {

    private Button Depatment;
    private Button  Depatment1;
    private Button  Depatment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deparment);

        getSupportActionBar().setTitle("Department");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Depatment=findViewById(R.id.btn1);
        Depatment1=findViewById(R.id.btn2);
        Depatment2=findViewById(R.id.btn3);


        Depatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Deparment.this,Cst_Deparment.class);
                startActivity(intent);
            }
        });

        Depatment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Deparment.this,DNT_Deparmenr.class);
                startActivity(intent);


            }
        });
        Depatment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Deparment.this,TCT_Deparment.class);
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