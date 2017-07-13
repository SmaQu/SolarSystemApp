package com.example.smaqu.solarsystemapp.ui;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.smaqu.solarsystemapp.R;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_PLANET_WIKI = "WEB_WIKI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        final Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        webView= new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.requestFocus(View.FOCUS_DOWN);
        final Activity activity = this;
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Toast.makeText(activity, description,Toast.LENGTH_LONG).show();
            }
        });
        webView.loadUrl(extras.getString(EXTRA_PLANET_WIKI));
        setContentView(webView);
    }
}
