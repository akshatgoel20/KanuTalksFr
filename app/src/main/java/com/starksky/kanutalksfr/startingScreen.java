package com.starksky.kanutalksfr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class startingScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(startingScreen.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 1500);


        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/allura.ttf");
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setTypeface(custom_font);
        textView.setText("Kanu");
        textView.setTextSize(30);

    }


}