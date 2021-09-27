package com.example.eect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DataActivity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("https://indonesiabergerak.com/detail");
        web.setWebViewClient(new WebViewClient());

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getUseWideViewPort();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event){
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.web.canGoBack()){
            this.web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
