package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView username=findViewById(R.id.te);
        String se1=getIntent().getStringExtra("se1");
        username.setText(se1);
    }
}