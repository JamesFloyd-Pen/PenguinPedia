package com.example.penguinpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int[] imageArray = {R.drawable.mainpenguinactivityimage};
    //New btn array prototype
    private List<Button> penguin_buttons;
    private static final int[] btn_id = {
            R.id.EPbtn, //Button One: Emperor Penguin
            R.id.KPbtn, //Button Two: King Penguin
            //R.id.ADbtn,
            //R.id.Cbtn,
            //
    // https://stackoverflow.com/questions/15642104/array-of-buttons-in-android
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penguin_buttons = new ArrayList<Button>();
        for (int id : btn_id) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
            penguin_buttons.add(button);
        }
    }

    private void animationViewSlideShow(){
        //Hands slide show
        Handler handler = new Handler();
        //Run me
        //https://stackoverflow.com/questions/21625255/automatically-changing-images-in-imageview
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.EPbtn:
                Intent emperorPenguinIntent = new Intent(MainActivity.this, Example_EmperorPenguin.class);
                startActivity(emperorPenguinIntent);
                break;

            case R.id.KPbtn:
                Intent generatePenguinIntent = new Intent(MainActivity.this, AutoPenguinGenerateActivity.class);
                startActivity(generatePenguinIntent);
                break;
        }
    }

    /*
    TODO
    1. Main code with 3 rows per penguin
    2. Make sure there is a holder for round buttons for 18 penguins
    3. For Test Button, make sure each btn passes a unique value to generate to that penguin info
     */
}