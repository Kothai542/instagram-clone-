package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class create extends AppCompatActivity {
    private AwesomeValidation a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        TextView textview = findViewById(R.id.f2);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(create.this, login.class);
                startActivity(i);
            }
        });

        EditText num=findViewById(R.id.num);
        Button butt=findViewById(R.id.buu);
        a=new AwesomeValidation(ValidationStyle.BASIC);
        a.addValidation(create.this,R.id.num, RegexTemplate.TELEPHONE,R.string.numerror);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.validate()) {
                    Intent i = new Intent(create.this, otp.class);
                    startActivity(i);
                }


            }
        });
        EditText mail=findViewById(R.id.mail);
        Button ma=findViewById(R.id.ma);
        a=new AwesomeValidation(ValidationStyle.BASIC);
        a.addValidation(create.this,R.id.mail, RegexTemplate.TELEPHONE,R.string.numerror);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.validate()) {
                    Intent i = new Intent(create.this, otp.class);
                    startActivity(i);
                }


            }
        });



    }
}