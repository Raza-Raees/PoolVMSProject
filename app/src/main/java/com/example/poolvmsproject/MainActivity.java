package com.example.poolvmsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText email;
    private EditText pass;



    String username,e;
    String password,p;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.login_emailid);
        pass = (EditText) findViewById(R.id.login_password);

        username = getString(R.string.Admin_Name);
        password= getString(R.string.Admin_Pass);



    }

    public void Login(View view) {
        e=email.getText().toString();
        p=pass.getText().toString();



        if(e.equals(username)&& p.equals(password))
        {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(MainActivity.this ,AdminPanel.class);
            email.setText("");
            pass.setText("");
            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_LONG).show();
        }



    }


}