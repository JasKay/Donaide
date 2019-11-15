package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signuppage extends AppCompatActivity {
    private Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        signupbutton = (Button) findViewById(R.id.signupbutton);
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhomepage();
            }
        });
    }

    public void openhomepage(){
        Intent signup_homepage_Intent = new Intent(this, homepage.class);
        startActivity(signup_homepage_Intent);
    }
}