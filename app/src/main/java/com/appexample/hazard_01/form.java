package com.appexample.hazard_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class form extends AppCompatActivity {

    Button submit;
    CheckBox check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        submit = (Button) findViewById(R.id.submit);
        check1 = (CheckBox) findViewById(R.id.checkbox_meat);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map =new Intent(form.this,MapsActivity.class);
                form.this.startActivity(map);
            }
        });
    }
}
