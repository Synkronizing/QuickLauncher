package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.slope_calculator");
                if(startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
    // Attempt to launch an activity outside our app
    Button googleBtn = (Button)findViewById(R.id.googleBtn);
    googleBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String google = "https://www.westada.tech/b2/joshs";
            Uri webaddress = Uri.parse(google);

            Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,webaddress);
            if(gotoGoogle.resolveActivity(getPackageManager())!= null){
                startActivity(gotoGoogle);
            }
        }
    });

    Button calcBtn = (Button) findViewById(R.id.calcBtn);
    calcBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.joshscalculator");
            if(startIntent != null) {
                startActivity(startIntent);
            }
        }
    });
        Button createBtn = (Button) findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.swimmingapp");
                if(startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button peachBtn = (Button) findViewById(R.id.peachBtn);
        peachBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.listapp");
                if(startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
        Button quadBtn = (Button) findViewById(R.id.quadBtn);
        quadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("com.example.quadraticapp");
                if(startIntent != null) {
                    startActivity(startIntent);
                }
            }
        });
    }

}

