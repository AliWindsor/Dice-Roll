package com.example.diceroll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.diceroll.MESSAGE";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get view from layout ting
        setContentView(R.layout.activity_main);

    }

    public static int randomClass(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6) + 1;
        return randomInt;
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, DisplayMessageActivity.class);

       // EditText editText = (EditText) findViewById(R.id.editText);
       // String message = editText.getText().toString();

        String roll = Integer.toString(randomClass());


        intent.putExtra(EXTRA_MESSAGE, roll);
        startActivity(intent);
    }
}
