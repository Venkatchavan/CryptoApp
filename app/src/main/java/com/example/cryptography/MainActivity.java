package com.example.cryptography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ceasercipher,binary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ceasercipher=findViewById(R.id.ceasercipher);
        binary = findViewById(R.id.binary);
        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
        ceasercipher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openceaser();
            }
        });
    }
    public void open()
    {
        Intent intent = new Intent(this, BinaryEncrypt.class);
        startActivity(intent);
    }
    public void openceaser()
    {
        Intent intent = new Intent(this, CeaserCipher.class);
        startActivity(intent);
    }
}