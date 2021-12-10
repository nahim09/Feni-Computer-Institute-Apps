package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TctCR extends AppCompatActivity {
    Button btntctcr1,btntctcr2,btntctcr3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tct_cr);

        getSupportActionBar().setTitle("TCT CR");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btntctcr1=findViewById(R.id.tctcr1);
        btntctcr2=findViewById(R.id.tctcr2);
        btntctcr3=findViewById(R.id.tctcr3);



        btntctcr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TctCR.this,TheirteenBatchTCT.class);
                startActivity(intent);
            }
        });

        btntctcr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TctCR.this,FourteenBatchTCT.class);
                startActivity(intent);
            }
        });

        btntctcr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TctCR.this,FifteenBatchTCT.class);
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