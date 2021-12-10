package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DepartmentHead extends AppCompatActivity {

    Button buttoncst1,buttoncst2,buttoncst3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_head);

        getSupportActionBar().setTitle("Department Head");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        buttoncst1=findViewById(R.id.DHbtn1);
        buttoncst2=findViewById(R.id.DHbtn2);
        buttoncst3=findViewById(R.id.DHbtn3);

        buttoncst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentHead.this,CstHead.class);
                startActivity(intent);
            }
        });

        buttoncst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentHead.this,DntHead.class);
                startActivity(intent);
            }
        });

        buttoncst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentHead.this,TctHead.class);
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