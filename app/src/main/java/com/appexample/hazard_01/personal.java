package com.appexample.hazard_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class personal extends AppCompatActivity {

    Button submit1;
    CheckBox check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        submit1 = (Button) findViewById(R.id.submit1);
        check2 = (CheckBox) findViewById(R.id.checkbox_meat1);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map =new Intent(personal.this, MapsActivity.class);
                personal.this.startActivity(map);
            }
        });
    }
}
