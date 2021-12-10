package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CstTeacher extends AppCompatActivity {

    Button ButtonCst,ButtonCst1,ButtonCst2,ButtonCst3,ButtonCst4,ButtonCst5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cst_teacher);

        getSupportActionBar().setTitle("CST Teacher");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ButtonCst=findViewById(R.id.afrojaCall);

        ButtonCst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801711132353"));
                startActivity(intent);
            }
        });
        ButtonCst1=findViewById(R.id.nakibCall);
        ButtonCst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801710020761"));
                startActivity(intent);
            }
        });
        ButtonCst2=findViewById(R.id.sohalCall);
        ButtonCst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801625225586"));
                startActivity(intent);
            }
        });
        ButtonCst3=findViewById(R.id.molyCall);
        ButtonCst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801776290973"));
                startActivity(intent);
            }
        });

        ButtonCst4=findViewById(R.id.nehalCall);
        ButtonCst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8807629927719"));
                startActivity(intent);
            }
        });

        ButtonCst5=findViewById(R.id.samimCall);
        ButtonCst5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+8801813243436"));
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