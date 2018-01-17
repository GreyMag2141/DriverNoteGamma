package com.example.user.drivernotebeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RefuelingActivity extends AppCompatActivity {
    EditText editTextL;
    EditText editTextR;
    TextView textViewRub;
    Button buttonSave;

    float num1 = 0;
    float num2 = 0;
    float result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_refueling );

        editTextL = findViewById( R.id.editTextL );
        editTextR = findViewById( R.id.editTextR );
        textViewRub = findViewById( R.id.textViewRub );
        buttonSave = findViewById( R.id.buttonSave );
        buttonSave.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // читаем EditText и заполняем переменные числами
                num1 = Float.parseFloat( editTextL.getText().toString() );
                num2 = Float.parseFloat( editTextR.getText().toString() );
                result = num1 * num2;
                textViewRub.setText(   result + " руб. " );
            }

        } );

    }
}











