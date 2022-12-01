package com.example.halloweengame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView image;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    Button start;
    TextView lives;
    TextView points;

    int finalPoints = 0;
    int finalLives = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        start = findViewById(R.id.start);
        lives = findViewById(R.id.lives);
        points = findViewById(R.id.points);

        image.setText("???");
        button1.setText("???");
        button2.setText("???");
        button3.setText("???");
        button4.setText("???");

        start.setOnClickListener(v ->{
            start.setVisibility(start.INVISIBLE);
            createOptions();
        });
    }

    void createOptions(){
        String[] images = {"🎃", "🐼", "🦊", "🐭", "🐶", "🐰", "🦁", "🐮"};
        String[] options = {"Pumpkin", "Panda", "Fox", "Mice", "Dog", "Rabbit", "Lion", "Cow"};

        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random();
        Random img = new Random();

        String one = options[rand1.nextInt(options.length)];
        String two = options[rand2.nextInt(options.length)];
        String three = options[rand3.nextInt(options.length)];
        String four = options[rand4.nextInt(options.length)];
        String picture = images[img.nextInt(images.length)];

        button1.setText(one);
        button2.setText(two);
        button3.setText(three);
        button4.setText(four);
        image.setText(picture);

        lives.setText("Lives: " + finalLives);
        points.setText("Points: " + finalPoints);


        button1.setOnClickListener( v -> {
            //if(button1.getText().toString() == image)
        });

    }
}