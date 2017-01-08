package com.example.nicolassabatier.quizzapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.nicolassabatier.quizzapplication.R.styleable.View;

public class   Playing extends AppCompatActivity implements  android.view.View.OnClickListener {


    int index = 0, score = 0; // index gives the number of questions answered, score gives the final score for the player
    ImageView mImageView; // shows the flag
    Button buttonA, buttonB, buttonC, buttonD,nextbutton,cheatbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);


        mImageView = (ImageView) findViewById(R.id.flag_question);
        buttonA = (Button) findViewById(R.id.Answer_A_Button);
        buttonB = (Button) findViewById(R.id.Answer_B_Button);
        buttonC = (Button) findViewById(R.id.Answer_C_Button);
        buttonD = (Button) findViewById(R.id.Answer_D_Button);
        nextbutton = (Button) findViewById(R.id.Next_Button);
        cheatbutton= (Button) findViewById(R.id.Cheat_Button);


        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        nextbutton.setOnClickListener(this);
        cheatbutton.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        showQuestion(index); // runs the method that will display the flag, the different choices for the answer

    }


    private void showQuestion(int index) {

        Intent intent = getIntent();
        Player  newPlayer =(Player) intent.getSerializableExtra("aplayer"); // new player is created everytime with the same name
        Bundle mybundle = this.getIntent().getExtras(); // passing data from Playing Activity

       List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");


        if (index < (questionsPlay.size())) {

            //thisquestion++;
            int ImageId = this.getResources().getIdentifier(questionsPlay.get(index).getImage().toLowerCase(), "drawable", getPackageName());
//          in order to get the corresponding flag from the resource: R.drawable.country_name
            mImageView.setBackgroundResource(ImageId);
            buttonA.setText(questionsPlay.get(index).getAnswerA());
            buttonB.setText(questionsPlay.get(index).getAnswerB());
            buttonC.setText(questionsPlay.get(index).getAnswerC());
            buttonD.setText(questionsPlay.get(index).getAnswerD());

        } else { // opens ScoreActivity and transfer player data when all the questions are answered
            newPlayer.setScore(score);
            Intent intention = new Intent(Playing.this, ScoreActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("newPlayer",newPlayer);
            bundle.putSerializable("questionsPlay", (Serializable) questionsPlay);
            //intention.putExtra("newPlayer",newPlayer);
            intention.putExtras(bundle);
            startActivity(intention);
            finish();

        }
    }


    @Override
    public void onClick(View view) {


        Intent intent = getIntent();
        Bundle mybundle = this.getIntent().getExtras(); // passing data from Playing Activity
        List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");

        if (index < questionsPlay.size()) { // How is index incremented when it is the correct answer?
            Button PlayerAnswer = (Button) view;
            if (PlayerAnswer.getText().equals(questionsPlay.get(index).getCorrectAnswer())) { // click on the correct answer

                score++;

            }
            if (PlayerAnswer.getText().equals("Cheat")) { // click on the cheat button

                Toast.makeText(Playing.this, "The answer was " + questionsPlay.get(index).getCorrectAnswer(), LENGTH_SHORT).show();
                showQuestion(++index);
            } else {showQuestion(++index);
            }


        }
        else
        {
            showQuestion(++index);

        }

    }
}