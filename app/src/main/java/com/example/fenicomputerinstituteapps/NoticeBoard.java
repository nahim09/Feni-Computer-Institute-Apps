package com.example.fenicomputerinstituteapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NoticeBoard extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_board);

        getSupportActionBar().hide();

        getSupportActionBar().hide();

        webView=findViewById(R.id.noticBoard_btn);

     

        webView.loadUrl("http://www.fci.gov.bd");
    }
}