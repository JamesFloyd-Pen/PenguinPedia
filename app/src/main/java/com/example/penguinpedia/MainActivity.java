package com.example.penguinpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Emperor penguin building prototype
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =  (Button)findViewById(R.id.EPbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent emperorPenguinIntent = new Intent(MainActivity.this, Example_EmperorPenguin.class);
                startActivity(emperorPenguinIntent);
            }


        });
    }


    /*
    TODO
    1. Main code with 3 rows per penguin
    2. Make sure there is a holder for round buttons for 18 penguins
    3. For Test Button, make sure to
     */
}