package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CstClassCR extends AppCompatActivity {
    Button btnCstCr1,btnCstCr2,btnCstCr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cst_class_cr);

        getSupportActionBar().setTitle("CST Class CR");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnCstCr1=findViewById(R.id.cstcr1);
        btnCstCr2=findViewById(R.id.cstcr2);
        btnCstCr3=findViewById(R.id.cstcr3);


        btnCstCr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CstClassCR.this,ThirteenBatchCST.class);
                startActivity(intent);
            }
        });

        btnCstCr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CstClassCR.this,FourteenBatchCST.class);
                startActivity(intent);
            }
        });

        btnCstCr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CstClassCR.this,FifteenBatchCST.class);
                startActivity(intent);
            }
        });





    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}