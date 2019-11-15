package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {
    private Button logintosignupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        logintosignupbutton = (Button) findViewById(R.id.logintosignupbutton);
        logintosignupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignuppage();
            }
        });
    }

    public void opensignuppage(){
        Intent login_signup_Intent = new Intent(this, signuppage.class);
        startActivity(login_signup_Intent);
    }
}
