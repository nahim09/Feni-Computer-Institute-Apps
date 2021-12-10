package com.example.fenicomputerinstituteapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Teachers extends AppCompatActivity {

    private Button Teacher;
    private Button Teacher1;
    private Button Teacher2;
    private Button Teacher3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        getSupportActionBar().setTitle("Teacher");

        //back button use jnno
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Teacher =findViewById(R.id.btn1);
        Teacher1 =findViewById(R.id.btn2);
        Teacher2 =findViewById(R.id.btn3);
        Teacher3 =findViewById(R.id.btn4);

        Teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,CstTeacher.class);
                startActivity(intent);
            }
        });

        Teacher1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,Dnt_Teacher.class);
                startActivity(intent);
            }
        });

        Teacher2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,Tct_Teacher.class);
                startActivity(intent);
            }
        });

        Teacher3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,Rs_Teacher.class);
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