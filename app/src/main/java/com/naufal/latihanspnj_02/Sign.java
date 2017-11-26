package com.naufal.latihanspnj_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign extends AppCompatActivity {

    Button SignIn,SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        onClick();
    }


    public void onClick()
    {
        SignIn = findViewById(R.id.btn_sigin);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign.this,SignIn.class);
                startActivity(i);
            }
        });

        SignUp = findViewById(R.id.btn_SignUp);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Sign.this,SignUp.class);
                startActivity(b);
            }
        });
    }
}
