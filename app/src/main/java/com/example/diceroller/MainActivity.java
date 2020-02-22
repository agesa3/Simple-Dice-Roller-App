package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageDice;
    private Random rand = new Random();
    private TextView diceText;
    private Button clickBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageDice = findViewById(R.id.image_dice);
        diceText = findViewById(R.id.dice_number);
        clickBtn = findViewById(R.id.rollDice);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    public void rollDice() {
        int randomNumber = rand.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDice.setImageResource(R.drawable.dice1);
                diceText.setText(R.string.dice_one);
                break;
            case 2:
                imageDice.setImageResource(R.drawable.dice2);
                diceText.setText(R.string.dice_two);
                break;
            case 3:
                imageDice.setImageResource(R.drawable.dice3);
                diceText.setText(R.string.dice_three);
                break;
            case 4:
                imageDice.setImageResource(R.drawable.dice4);
                diceText.setText(R.string.dice_four);
                break;
            case 5:
                imageDice.setImageResource(R.drawable.dice5);
                diceText.setText(R.string.dice_five);
                break;
            case 6:
                imageDice.setImageResource(R.drawable.dice6);
                diceText.setText(R.string.dice_six);
                break;

        }
    }

}
