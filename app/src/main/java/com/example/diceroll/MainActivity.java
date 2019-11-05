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
    public static final String EXTRA_MESSAGE2 = "com.example.diceroll.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.diceroll.MESSAGE3";
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

//    public String rightWrong(){
//
//        String message = "b";
//        String roll = "b";
//        String winLose;
//
//        if (message == roll){
//            winLose = "Win";
//        }else{
//            winLose ="Lose";
//        }
//
//        System.out.println(winLose);
//        return (winLose);
//    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message);

        String roll = Integer.toString(randomClass());
        //String roll = "3";
        intent.putExtra(EXTRA_MESSAGE, roll);

        String winLose;
        int guessIt = Integer.parseInt(message);
        int rollNo = Integer.parseInt(roll);

        if (guessIt == rollNo){
            winLose = "Congratulations!!";
        }else {
            winLose = "Try Again :(";
        }

        intent.putExtra(EXTRA_MESSAGE3, winLose);
        startActivity(intent);
    }


}
