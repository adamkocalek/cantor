package com.example.eadakoc.cantor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonExchangeRate, buttonAbout, buttonExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
        events();
    }
    public void init(){
        buttonExchangeRate = (Button)findViewById(R.id.buttonExchangeRate);
        buttonAbout = (Button)findViewById(R.id.buttonAbout);
        buttonExit = (Button)findViewById(R.id.buttonExit);
    }
    public void events(){

        buttonExchangeRate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ExchangeRateActivity.class));
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
