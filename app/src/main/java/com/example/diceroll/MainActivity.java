package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView die;
    TextView score;
    TextView winLoseTxt;
    Button rollButton;
    EditText editText;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static int randomClass() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6) + 1;
        return randomInt;
    }

//    @SuppressLint("ResourceType")
//    public String winOrLose() {
//
//        score = findViewById(R.id.score);
//
//        editText = findViewById(R.id.editText);
//        String guess = editText.getText().toString();
//
//        String roll = Integer.toString(randomClass());
//        die = findViewById(R.id.die);
//        die.setText(roll);
//
//        String winLose;
//
//        int guessIt = Integer.parseInt(guess);
//        int rollNo = Integer.parseInt(roll);
//
//        if (guessIt == rollNo) {
//            winLoseTxt.setTextColor(getResources().getColor(android.R.color.holo_green_light));
//            winLose = "Congratulations!!";
//            //a1();
//            counter++;
//            score.setText(Integer.toString(counter));
//
//        } else {
//            winLoseTxt.setTextColor(getResources().getColor(android.R.color.holo_red_light));
//            winLose = "Try Again :(";
//        }
//
//        return winLose;
//    }

    public void sendMessage(View view) {

//
//        score = findViewById(R.id.score);
//
//        editText = findViewById(R.id.editText);
//        String guess = editText.getText().toString();

        String roll = Integer.toString(randomClass());
        die = findViewById(R.id.die);
        die.setText(roll);

//        winLoseTxt = findViewById(R.id.winLoseTxt);
//        winLoseTxt.setText(winOrLose());

    }
}

