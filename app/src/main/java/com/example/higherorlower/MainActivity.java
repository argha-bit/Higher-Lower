package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rand_int1;
    int guessNum;
    public void randomGen(View view)
    {
        EditText editText = (EditText) findViewById(R.id.numGuess);
        String s = editText.getText().toString();

        guessNum = Integer.parseInt(s);



                if(guessNum<rand_int1)
                    Toast.makeText(this,"Value is Higher",Toast.LENGTH_LONG).show();
                else if(guessNum>rand_int1)
                    Toast.makeText(this,"Value is Lower",Toast.LENGTH_LONG).show();
                else
                {
                    Toast.makeText(this,"You're Correct, Guess the next number",Toast.LENGTH_LONG).show();
                    generate();
                }
        Log.i("Guess","guessed num is "+guessNum);
        Log.i("Generated","generated num is "+rand_int1);
    }
    public void generate()
    {
        Random rand = new Random();

        // Generate random integers in range 0 to 50
        rand_int1 = rand.nextInt(50);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate();
    }
}
