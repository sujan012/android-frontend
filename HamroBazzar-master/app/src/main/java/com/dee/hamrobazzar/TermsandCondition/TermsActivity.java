package com.dee.hamrobazzar.TermsandCondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.dee.hamrobazzar.R;

public class TermsActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);


        webView = findViewById(R.id.webView);

        webView.loadUrl("https://hamrobazaar.com/terms.html");

    }
}
