package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Variable that keeps track of correct answers
     * */
    int correct;
    {
        correct = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * If method that adds to correct variable if question 1 answer is true
     */

    public void questionOne() {
        RadioButton rb = findViewById(R.id.radio1);

        if (rb.isChecked()) {
            correct ++;
        }

    }

    /**
     * If method that adds to correct variable if question 2 answer is true
     */

    public void questionTwo() {
        EditText et = findViewById(R.id.year);
        String answer = et.getText().toString();

        if (answer.equalsIgnoreCase("1992")) {
            correct++;
        }
    }

    /**
     * If method that adds to correct variable if question 3 answer is true
     */

    public void questionThree() {
        RadioButton rb = findViewById(R.id.radio4);

        if (rb.isChecked()) {
            correct++;
        }
    }

    /**
     * If method that adds to correct variable if question 4 answer is true
     */

    public void questionFour() {
        EditText et = findViewById(R.id.team);
        String answer = et.getText().toString();

        if (answer.equalsIgnoreCase("Washington Wizards")) {
            correct++;
        }
    }


    /**
     * If method that adds to correct variable if question 5 answer is true
     */

    public void questionFive() {
        EditText et = findViewById(R.id.company);
        String answer = et.getText().toString();

        if (answer.equalsIgnoreCase("Adidas")) {
            correct++;
        }
    }

    /**
     * If method that adds to correct variable if question 6 answer is true
     */

    public void questionSix() {
        EditText et = findViewById(R.id.Sport);
        String answer = et.getText().toString();

        if (answer.equalsIgnoreCase("Baseball")) {
            correct++;
        }
    }

    private void calculateResult() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
    }

    /**
     * When the submit button is click, this method lets the player know how many
     * questions they got right
     */
    public void submit (View view) {
        calculateResult();
        String submit = "You got " + correct + "/6 correct!";
        Toast.makeText(this, submit, Toast.LENGTH_LONG).show();
    }



}

