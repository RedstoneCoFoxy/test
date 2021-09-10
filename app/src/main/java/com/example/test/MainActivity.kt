package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Integer.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1="";
        var liczba2="";
        var stan=0;
        var wynik=0;

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
        val buttonAdding: Button = findViewById(R.id.buttonADD)
        val buttonRetracting: Button = findViewById(R.id.buttonRETRACT)
        val buttonFinished: Button = findViewById(R.id.buttonFinish)
        val Wyswietlam: TextView = findViewById(R.id.Wyswietlacz)

        buttonKey1.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"1"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"1"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey2.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"2"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"2"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey3.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"3"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"3"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey4.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"4"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"4"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey5.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"5"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"5"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey6.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"6"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"6"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey7.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"7"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"7"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey8.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"8"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"8"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey9.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"9"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"9"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonKey0.setOnClickListener {
            if(stan==0){
                liczba1=liczba1+"0"
                Wyswietlam.text=liczba1
            }
            if(stan!=0){
                liczba2=liczba2+"0"
                Wyswietlam.text=liczba2
            }
        };//Koniec Click
        buttonAdding.setOnClickListener {
            stan=1;
            Wyswietlam.text="+"
        }
        buttonRetracting.setOnClickListener {
            stan=2;
            Wyswietlam.text="-"
        }
        buttonFinished.setOnClickListener {
            val wyn1 = parseInt(liczba1,10)
            val wyn2 = parseInt(liczba2,10)
            if(stan==1){wynik=wyn1+wyn2;};
            if(stan==2){wynik=wyn1-wyn2;};
            Wyswietlam.text= wynik.toString()
        }

    }//////////sdbhu
}