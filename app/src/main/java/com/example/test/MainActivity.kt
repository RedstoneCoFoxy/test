package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1=" ";
        var liczba2=" ";
        var stan=0;

        val buttonKey1: Button = findViewById(R.id.key1)
        val buttonKey2: Button = findViewById(R.id.key2)
        val buttonKey3: Button = findViewById(R.id.key3)
        val buttonKey4: Button = findViewById(R.id.key4)
        val buttonKey5: Button = findViewById(R.id.key5)
        val buttonKey6: Button = findViewById(R.id.key6)
        val buttonKey7: Button = findViewById(R.id.key7)
        val buttonKey8: Button = findViewById(R.id.key8)
        val buttonKey9: Button = findViewById(R.id.key9)
        val buttonKey0: Button = findViewById(R.id.key0)
        val Wyswietlam: TextView = findViewById(R.id.Wyswietlacz)

        buttonKey1.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"1"
            }
            if(stan==1){
                liczba2=liczba2+"1"
            }
            Wyswietlam.text=liczba1;
        };
    }
}