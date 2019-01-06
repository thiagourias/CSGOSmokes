package com.thiagourias.csgosmokes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class creditos extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos_app);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToInstagram (View view) {
        goToUrl ( "https://www.instagram.com/thiagourias/");
    }

    public void goToSteam (View view) {
        goToUrl ( "https://steamcommunity.com/id/thiagourias/");
    }
}
