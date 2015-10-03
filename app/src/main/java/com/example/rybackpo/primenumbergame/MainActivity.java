package com.example.rybackpo.primenumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;
    private int score = 0;
    private TextView scorecount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayNumber();
    }

    private void displayNumber(){
        Random rand = new Random();
        number = 2 + rand.nextInt(1000);
        TextView viewrandnum = (TextView) findViewById(R.id.numbertext);
        viewrandnum.setText("" + number);
        scorecount = (TextView) findViewById(R.id.textscore);
        scorecount.setText("Score: " + score);
    }

    private boolean isComposite(){
        int i, ctr = 0;
        for(i = 2; i < number - 1; i++){
            if(number % i == 0){
                ctr++;
                return true;
            }
        }
        return false;
    }

    public void ClickonPrime(View view){
        if(isComposite()){
            score-=5;
            Toast.makeText(this, "It is Incorrect!", Toast.LENGTH_SHORT).show();
        }
        else{
            score++;
            Toast.makeText(this, "Great Job! It is Correct!", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Previous number: "+ number,Toast.LENGTH_SHORT).show();
        displayNumber();
    }
    public void ClickonComposite(View view){
        if(isComposite()){
            score++;
            Toast.makeText(this, "Great Job! It is Correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            score-=5;
            Toast.makeText(this, "It is Incorrect!", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Previous number: "+ number,Toast.LENGTH_SHORT).show();
        displayNumber();
    }

    public void answertoast(){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
