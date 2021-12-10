package com.example.fenicomputerinstituteapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplasScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);

        getSupportActionBar().hide();

        progressBar=findViewById(R.id.prograsbar_id);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();

                startApps();
            }
        });

           thread.start();

    }
    public void doWork(){
        for (progress=20; progress<=100; progress= progress+20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void startApps(){
        Intent intent = new Intent(SplasScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}