package com.example.hellowolrdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameInput = (EditText)findViewById(R.id.nameInput);

        Button sayHiActivityBtn = (Button)findViewById(R.id.sayHiBtn);
        sayHiActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Main2Activity.class);
                String name = "Hello World! " + nameInput.getText().toString();
                startIntent.putExtra("addInformation",name);
                startActivity(startIntent);
            }
        });
    }
}
