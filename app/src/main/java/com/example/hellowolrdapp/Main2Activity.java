package com.example.hellowolrdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView greeting = (TextView) findViewById(R.id.greetingView);
        String text = getIntent().getExtras().getString("addInformation");
        greeting.setText(text);

        Button gobackToFirstPage = (Button)findViewById(R.id.backBtn);
        gobackToFirstPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(goBackIntent);
            }
        });
    }
}
