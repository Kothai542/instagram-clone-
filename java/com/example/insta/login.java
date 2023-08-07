package com.example.insta;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       Button login=findViewById(R.id.b1);
        EditText name=findViewById(R.id.n1);
        EditText password=findViewById(R.id.n2);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String username1="kothai";
               String pass1="ammaappa";
               String username2="padmavathi";
               String pass2="padu@123";
               String username3="rashmi";
               String pass3="rash@123";
               String username4="meenakshi";
               String pass4="meena@123";

               if((name.getText().toString().toLowerCase().matches(username1) && password.getText().toString().matches(pass1)||
                       (name.getText().toString().toLowerCase().matches(username2) && password.getText().toString().matches(pass2))||
                       (name.getText().toString().toLowerCase().matches(username3) && password.getText().toString().matches(pass3))||
                       (name.getText().toString().toLowerCase().matches(username4) && password.getText().toString().matches(pass4))))
               {
                   Intent i = new Intent(login.this, home.class);
                   startActivity(i);
               }
               else{
                   Toast.makeText(login.this, "Invalid username and password", Toast.LENGTH_SHORT).show();
               }
           }
       });
        TextView textView=findViewById(R.id.l1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(login.this,help.class);
                startActivity(a);
            }
        });

    }
}