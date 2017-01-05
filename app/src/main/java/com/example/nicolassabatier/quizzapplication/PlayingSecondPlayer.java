package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class PlayingSecondPlayer extends AppCompatActivity implements android.view.View.OnClickListener{


    int index = 0, score = 0;
    ImageView mImageView;
    Button buttonA, buttonB, buttonC, buttonD,nextbutton,cheatbutton;
    Intent intent = getIntent();


    public List<Question> questionPlay(){
        //Intent intent = getIntent();
        // List questionsPLay =(List) intent.getSerializableExtra("questionplay");
        Bundle mybundle=this.getIntent().getExtras();
        List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");

        return questionsPlay;


    }
    public Player newPlayer(){
        //Intent intent = getIntent();
        // List questionsPLay =(List) intent.getSerializableExtra("questionplay");
        Bundle mybundle=this.getIntent().getExtras();
        Player newPlayer = (Player) mybundle.getSerializable("newPlayer");

        return newPlayer;


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        //Intent intent = getIntent();
        //ArrayList<Question> questionsPLay =(ArrayList<Question>) intent.getSerializableExtra("questionplay");


        //DBhandler db;


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
        cheatbutton.setOnClickListener(this);;
    }

    @Override
    protected void onResume() {
        super.onResume();
        questionPlay();
        showQuestion(index);
        //  index++;

    }


    public void showQuestion(int index) {


        /*
        Intent intent = getIntent();
        Player  newPlayer =(Player) intent.getSerializableExtra("aplayer");
        */
        Player newPlayer=newPlayer();
        List<Question> questionsPlay=questionPlay();
        if (index < (questionsPlay.size())) {
            //thisquestion++;
            int ImageId = this.getResources().getIdentifier(questionsPlay.get(index).getImage().toLowerCase(), "drawable", getPackageName());
            mImageView.setBackgroundResource(ImageId);
            buttonA.setText(questionsPlay.get(index).getAnswerA());
            buttonB.setText(questionsPlay.get(index).getAnswerB());
            buttonC.setText(questionsPlay.get(index).getAnswerC());
            buttonD.setText(questionsPlay.get(index).getAnswerD());

        } else {
            newPlayer.setScore(score);
            Intent intention = new Intent(PlayingSecondPlayer.this, ScoreActivity.class);
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

        List<Question> questionsPlay=questionPlay();

        if (index < questionsPlay.size()) {
            Button PlayerAnswer = (Button) view;
            if (PlayerAnswer.getText().equals(questionsPlay.get(index).getCorrectAnswer())) {
                //showQuestion(++index);
                score++;

            }
            if (PlayerAnswer.getText().equals("Cheat")) {

                Toast.makeText(PlayingSecondPlayer.this, "The answer was " +questionsPlay.get(index).getCorrectAnswer(), LENGTH_SHORT).show();
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