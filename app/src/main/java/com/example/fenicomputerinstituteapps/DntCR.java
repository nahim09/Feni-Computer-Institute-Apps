package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DntCR extends AppCompatActivity {

Button DntCr1,DntCr2,DntCr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnt_cr);

        getSupportActionBar().setTitle("DNT CR");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        DntCr1=findViewById(R.id.dntcr1);
        DntCr2=findViewById(R.id.dntcr2);
        DntCr3=findViewById(R.id.dntcr3);


        DntCr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DntCR.this,ThirteenBatchDNT.class);
                startActivity(intent);
            }
        });
        DntCr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DntCR.this,fourteenBatchDNT.class);
                startActivity(intent);
            }
        });

        DntCr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DntCR.this,FifteenBatchDNT.class);
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