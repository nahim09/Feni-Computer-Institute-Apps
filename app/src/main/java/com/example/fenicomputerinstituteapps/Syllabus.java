package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Syllabus extends AppCompatActivity {

private Button cstSyllabus,dntSyllabus,tctSyllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        getSupportActionBar().setTitle("Syllabus");


        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cstSyllabus=findViewById(R.id.C_S_T_sylabus_btn);
        dntSyllabus=findViewById(R.id.D_N_T_sylabus_btn);
        tctSyllabus=findViewById(R.id.T_C_T_sylabus_btn);

        cstSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Syllabus.this,Cst_sylabus.class);
                startActivity(intent);
            }
        });

        dntSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Syllabus.this,Dnt_Sylabus.class);
                startActivity(intent);
            }
        });
        tctSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Syllabus.this,Tct_Sylabus.class);
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