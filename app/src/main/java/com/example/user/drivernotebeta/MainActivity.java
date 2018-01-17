package com.example.user.drivernotebeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonrefueling;
Button buttonrepairs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonrefueling = findViewById(R.id.buttonreFueling);
        buttonrepairs = findViewById(R.id.buttonRepairs);
        buttonrefueling.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, RefuelingActivity.class);
                 startActivity(intent);
             }
         });
        buttonrepairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RepairsActivity.class);
                startActivity(intent);
            }
        });
                      }


}
