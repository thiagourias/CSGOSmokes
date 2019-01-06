package com.thiagourias.csgosmokes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class doacoes extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doacoes_app);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToPaypal (View view) {
        goToUrl ( "https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=YY99FWNJVPNMW");
    }

    public void goToPagseguro (View view) {
        goToUrl ( "https://pag.ae/bcgnXyf");
    }
}
