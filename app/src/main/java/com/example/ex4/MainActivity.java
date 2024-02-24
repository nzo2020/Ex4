package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    Button button4;

    TextView textView;

    TextView textView6;

    TextView textView2;

    TextView textView3;

    TextView textView4;

    TextView textView5;

    ImageView imageView;

    ImageView imageView2;

    ImageView imageView3;

    EditText editTextNumber;

    EditText editTextNumber2;

    EditText editTextNumber3;

    int num1,num2,num3,num4,sum1,sum2,sum3;
    int answer1, answer2,answer3;

    int counter = 0;
    public static Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView)  findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3 = (EditText) findViewById(R.id.editTextNumber3);
        startGame();
    }
    public void startGame() {

        num1 = rnd.nextInt(89) + 10;
        num2 = rnd.nextInt(89) + 10;

        textView4.setText(String.valueOf(num1));
        textView.setText(String.valueOf(num2));

        textView.setVisibility(View.VISIBLE);
        textView4.setVisibility(View.VISIBLE);
        editTextNumber.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
    }
    public void clicked2(View view) {

        String st = editTextNumber.getText().toString();
        answer1 = Integer.parseInt(st);

        sum1 = num1 + num2;

        imageView.setVisibility(View.VISIBLE);

        if (answer1==sum1){
            counter++;
            imageView.setImageResource(R.drawable.vi);
        } else {
            imageView.setImageResource(R.drawable.xi);
        }

        textView5.setText(String.valueOf(sum1));
        num3 = rnd.nextInt(89) + 10;
        textView2.setText(String.valueOf(num3));

        textView5.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);

        editTextNumber2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
    }

    public void clicked3(View view) {
        sum2 = sum1 + num3;

        String st1 = editTextNumber2.getText().toString();
        answer2 = Integer.parseInt(st1);

        imageView2.setVisibility(View.VISIBLE);

        if (answer2==sum2) {
            counter++;
            imageView2.setImageResource(R.drawable.vi);
        } else {
            imageView2.setImageResource(R.drawable.xi);
        }

        textView6.setText(String.valueOf(sum2));
        num4 = rnd.nextInt(89) + 10;
        textView3.setText(String.valueOf(num4));

        textView6.setVisibility(View.VISIBLE);
        textView3.setVisibility(View.VISIBLE);

        editTextNumber3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
    }

    public void clicked4(View view) {

        sum3 = sum2 + num4;
        String st2 = editTextNumber3.getText().toString();
        answer3 = Integer.parseInt(st2);

        imageView3.setVisibility(View.VISIBLE);

        if (answer3==sum3) {
            counter++;
            imageView3.setImageResource(R.drawable.vi);
        } else {
            imageView3.setImageResource(R.drawable.xi);
        }

        switch(counter){
            case 0: button.setText("your score: 0%, 0/3");
                break;
            case 1: button.setText("your score: 33%, 1/3");
                break;
            case 2: button.setText("your score: 66%, 2/3");
                break;
            case 3: button.setText("your score: 100%, 3/3");
                break;
        }

        button.setVisibility(View.VISIBLE);

    }

    public void clicked(View view) {
        counter=0;
        textView.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);

        editTextNumber.setVisibility(View.INVISIBLE);
        editTextNumber2.setVisibility(View.INVISIBLE);
        editTextNumber3.setVisibility(View.INVISIBLE);

        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);


        editTextNumber.setText("");
        editTextNumber2.setText("");
        editTextNumber3.setText("");

        button.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);

        startGame();
    }


    }