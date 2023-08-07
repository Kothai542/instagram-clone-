package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class and extends AppCompatActivity {
private AwesomeValidation a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);
        EditText n5 = findViewById(R.id.n5);
        Button b1 = findViewById(R.id.b1);
       EditText p1=findViewById(R.id.p1);

        a=new AwesomeValidation(ValidationStyle.BASIC);

        String regexPassword = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{8,}";
        a.addValidation(and.this,R.id.n5,"[a-zA-Z\\\\s]+",R.string.nameerror);
        a.addValidation(and.this,R.id.p1,regexPassword ,R.string.passerror);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.validate())
                {
                    String aa=n5.getText().toString();
                    String bb=p1.getText().toString();
                    Intent i =new Intent(and.this,home.class);
                    startActivity(i);
                }
            }
        });
        TextView by=findViewById(R.id.g1);
        by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i =new Intent(and.this,home.class);
                    startActivity(i);

            }
        });
    }
}