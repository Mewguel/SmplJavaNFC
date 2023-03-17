package com.example.smpljavanfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        // Placeholder credentials
        String adminUserName = "admin";
        String adminPassword = "password";
        //
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button button_signIn = (Button) findViewById(R.id.button_signin);

        button_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals(adminUserName)
                    && password.getText().toString().equals(adminPassword)){
                    // insert sign in action
                    Toast.makeText(SignInActivity.this, "Signed in successfully", Toast.LENGTH_SHORT).show();
                    Intent switchActivityIntent = new Intent(SignInActivity.this, MainActivity.class);
                    startActivity(switchActivityIntent);
                }
                else{
                    Toast.makeText(SignInActivity.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
