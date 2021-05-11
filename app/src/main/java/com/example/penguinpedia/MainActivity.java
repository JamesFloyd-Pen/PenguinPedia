package com.example.penguinpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Emperor penguin building prototype
    Button btn;
    int[] imageArray = {R.drawable.mainpenguinactivityimage};
    //New btn array prototype
    private List<Button> btns;
    private static final int[] btn_id = {
            R.id.EPbtn, //Button One: Emperor Penguin
            R.id.KPbtn, //Button Two: King Penguin
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.EPbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emperorPenguinIntent = new Intent(MainActivity.this, Example_EmperorPenguin.class);
                startActivity(emperorPenguinIntent);
            }
        });
    }

    private void animationViewSlideShow(){
        //Hands slide show
        Handler handler = new Handler();
        //Run me
        //https://stackoverflow.com/questions/21625255/automatically-changing-images-in-imageview
    }

    /*
    TODO
    1. Main code with 3 rows per penguin
    2. Make sure there is a holder for round buttons for 18 penguins
    3. For Test Button, make sure each btn passes a unique value to generate to that penguin info
     */
}