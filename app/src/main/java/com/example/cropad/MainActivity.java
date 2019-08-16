package com.example.cropad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button registe;

    public void registerform(){
        Intent r = new Intent(this, registration_page.class);
        startActivity(r);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registe = (Button) findViewById(R.id.register_but);
        registe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                registerform();

            }
        });
    }


}
