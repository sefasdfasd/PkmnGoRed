package brb.com.pkmngored;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Döner on 13.08.2016.
 */
public class EmulatorActivity extends Activity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.google.com");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intentt = new Intent(this, MapsActivity.class);
        startActivity(intentt);

    }
}