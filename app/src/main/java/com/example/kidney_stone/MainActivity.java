package com.example.kidney_stone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    Button btn;
    TextView text2;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth= FirebaseAuth.getInstance();
        btn=findViewById(R.id.btn);
        text2=findViewById(R.id.text2);
        user=auth.getCurrentUser();
        if(user==null){
            Intent intent=new Intent(getApplicationContext(),login.class);
            startActivity(intent);
            finish();
        }
        else{
            text2.setText(user.getEmail());

        }
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent=new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}