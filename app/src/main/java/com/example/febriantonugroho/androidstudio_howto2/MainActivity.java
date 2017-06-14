package com.example.febriantonugroho.androidstudio_howto2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Todo: Setup Custom Font to txtHello2 */
        TextView txtHello2 = (TextView) findViewById(R.id.txtHello2);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/28_Days_Later.ttf");
        txtHello2.setTypeface(typeface, Typeface.NORMAL);
    }
}
