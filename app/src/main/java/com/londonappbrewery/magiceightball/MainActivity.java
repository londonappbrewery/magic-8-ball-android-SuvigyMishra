package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageMagicBall = (ImageView) findViewById(R.id.imageMagicBall);
        final Button buttonAsk = (Button) findViewById(R.id.buttonAsk);

        final int[] magicBallArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        final Random randomNum = new Random();

        buttonAsk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final int number = randomNum.nextInt(5);
                imageMagicBall.setImageResource(magicBallArray[number]);
            }
        });

    }
}
