package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class first extends AppCompatActivity {
    public void onBackPressed() {
        Intent i=new Intent(Intent.ACTION_MAIN);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addCategory(Intent.CATEGORY_HOME);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView textview=findViewById(R.id.f1);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(first.this,login.class);
                startActivity(i);
            }
        });
        Button view=findViewById(R.id.f3);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(first.this,create.class);
                startActivity(i);
            }
        });
        ImageView he=findViewById(R.id.h1);
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(first.this, "HI WELCOME TO INSTAGRAM", Toast.LENGTH_SHORT).show();
            }
        });

    }
}