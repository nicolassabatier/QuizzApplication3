package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DisplayQuestionActivity extends AppCompatActivity {

    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15;
    Button startbutton;
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_question);


        Intent intent = getIntent();
        Bundle mybundle=this.getIntent().getExtras(); // passing data from Playing Activity
        final List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");

        button1 = (ImageButton) findViewById(R.id.imageButton1);
        button2 = (ImageButton) findViewById(R.id.imageButton2);
        button3 = (ImageButton) findViewById(R.id.imageButton3);
        button4 = (ImageButton) findViewById(R.id.imageButton4);
        button5 = (ImageButton) findViewById(R.id.imageButton5);
        button6 = (ImageButton) findViewById(R.id.imageButton6);
        button7 = (ImageButton) findViewById(R.id.imageButton7);
        button8 = (ImageButton) findViewById(R.id.imageButton8);
        button9 = (ImageButton) findViewById(R.id.imageButton9);
        button10 = (ImageButton) findViewById(R.id.imageButton10);
        button11 = (ImageButton) findViewById(R.id.imageButton11);
        button12 = (ImageButton) findViewById(R.id.imageButton12);
        button13 = (ImageButton) findViewById(R.id.imageButton13);
        button14 = (ImageButton) findViewById(R.id.imageButton14);
        button15 = (ImageButton) findViewById(R.id.imageButton15);
        startbutton=(Button) findViewById(R.id.button);


        button1.setImageResource(questionsPlay.get(0).getID());
        button2.setImageResource(questionsPlay.get(1).getID());
        button3.setImageResource(questionsPlay.get(2).getID());
        button4.setImageResource(questionsPlay.get(3).getID());
        button5.setImageResource(questionsPlay.get(4).getID());
        button6.setImageResource(questionsPlay.get(5).getID());
        button7.setImageResource(questionsPlay.get(6).getID());
        button8.setImageResource(questionsPlay.get(7).getID());
        button9.setImageResource(questionsPlay.get(8).getID());
        button10.setImageResource(questionsPlay.get(9).getID());
        button11.setImageResource(questionsPlay.get(10).getID());
        button12.setImageResource(questionsPlay.get(11).getID());
        button13.setImageResource(questionsPlay.get(12).getID());
        button14.setImageResource(questionsPlay.get(13).getID());
        button15.setImageResource(questionsPlay.get(14).getID());



        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                index++;
                button1.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,1);
                index++;
                button2.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,2);
                index++;
                button3.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,3);
                index++;
                button4.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,4);
                index++;
                button5.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,5);
                index++;

                button6.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,6);
                index++;

                button7.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,7);
                index++;

                button8.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,8);
                index++;

                button9.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,9);
                index++;

                button10.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,10);
                index++;

                button11.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,11);
                index++;

                button12.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,12);
                index++;

                button13.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,13);
                index++;

                button14.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Collections.swap(questionsPlay, index,14);
                index++;

                button15.setBackgroundColor(0);
                if (index==15) {
                    Intent intent = getIntent();
                    Player aplayer = (Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                    Intent intention = new Intent(DisplayQuestionActivity.this, Playing.class);
                    intention.putExtra("aplayer", aplayer); // passing data to Playing Activity
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                    bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                    intention.putExtras(bundle);
                    startActivity(intention); // Starts the Playing Activity
                }
            }
        });

        startbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                Player  aplayer =(Player) intent.getSerializableExtra("aplayer"); // new player is created every time with the same name
                Intent intention = new Intent(DisplayQuestionActivity.this,Playing.class);
                intention.putExtra("aplayer",aplayer); // passing data to Playing Activity
                Bundle bundle = new Bundle();
                bundle.putSerializable("questionsPlay", (Serializable) questionsPlay); //added
                bundle.putSerializable("aplayer", (Serializable) aplayer); //added
                intention.putExtras(bundle);
                startActivity(intention); // Starts the Playing Activity
            }
        });

    }



}
