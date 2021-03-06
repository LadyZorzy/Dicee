package com.tutorial.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.roll_button);

        final ImageView leftDice= (ImageView) findViewById(R.id.image_left_dice);
        final ImageView rightDice= (ImageView) findViewById(R.id.image_right_dice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
                R.drawable.dice2,

        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Nesto","Nesto se desava!!!");

                Random randomNumberGenerator = new Random();
               int number =  randomNumberGenerator.nextInt(6);
               Log.d("The Random number is" ,"number " +number);


          leftDice.setImageResource(diceArray [number]);

          number= randomNumberGenerator.nextInt(6);
          rightDice.setImageResource(diceArray[number]);

            }
        });
    }
}
