package com.example.lenovo.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText etLogin, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bRegister = (Button) findViewById(R.id.b_register);
        etLogin = (EditText) findViewById(R.id.et_login);
        etPassword = (EditText) findViewById(R.id.et_password);

       bRegister.setOnClickListener(this);

        @Override
         public void onClick(View view){
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("login", etLogin.getText().toString());
            intent.putExtra("password", etPassword.getText().toString());
            startActivity(intent);
        }





    }
}
