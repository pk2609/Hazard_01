package com.appexample.hazard_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class report extends AppCompatActivity {

    Button simpleButton1,simpleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        simpleButton1 = (Button) findViewById(R.id.simpleButton1);//get id of button 1
        simpleButton2 = (Button) findViewById(R.id.simpleButton2);//get id of button 2

        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form =new Intent(report.this, form.class);
                report.this.startActivity(form);
            }
        });
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pers =new Intent(report.this,personal.class);
                report.this.startActivity(pers);
            }
        });

    }
}
