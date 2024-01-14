package com.example.kidney_stone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Signup extends AppCompatActivity {
TextInputEditText editTextEmail,editTextPassword;
Button buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);
        buttonReg=findViewById(R.id.btn_signup);

       buttonReg.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String email,password;
               email=String.valueOf(editTextEmail.getText());
               password=String.valueOf(editTextPassword.getText());

               if(TextUtils.isEmpty(email)){
                   Toast.makeText(Signup.this, "enter email", Toast.LENGTH_SHORT).show();
                   return;
               }
               if(TextUtils.isEmpty(password)){
                   Toast.makeText(Signup.this, "enter password", Toast.LENGTH_SHORT).show();
                   return;
               }


           }
       });
    }
}