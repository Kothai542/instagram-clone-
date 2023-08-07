package com.example.insta;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public class search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        EditText se1=findViewById(R.id.se1);
        ImageView in=findViewById(R.id.in);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=se1.getText().toString();
                Intent i=new Intent(search.this,display.class);
                i.putExtra("se1",user);
                startActivity(i);
            }
        });
    }
}