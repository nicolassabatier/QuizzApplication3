package com.example.nicolassabatier.quizzapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.example.nicolassabatier.quizzapplication.R.id.add;
import static com.example.nicolassabatier.quizzapplication.R.id.player_name_list;

public class SecondPlayerActivity extends AppCompatActivity
{




    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        Bundle mybundle=this.getIntent().getExtras();
        final List<Question> questionsPlay = (List<Question>) mybundle.getSerializable("questionsPlay");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_player);
        Button mStartButton = (Button) findViewById(R.id.Start_Button2);
        mStartButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Player aplayer = new Player();
                EditText nameField = (EditText) findViewById(R.id.registration_name2);
                String name = nameField.getText().toString();
                aplayer.setName(name);

                //playername = aplayer.getName();
                Intent intention = new Intent(SecondPlayerActivity.this, PlayingSecondPlayer.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("newPlayer",aplayer);
                bundle.putSerializable("questionsPlay", (Serializable) questionsPlay);
                intention.putExtras(bundle);
                startActivity(intention);

            }
        });
    }
}
