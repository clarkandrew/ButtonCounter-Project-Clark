package com.example.andrewclark.button_counter_clark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    int currVal = 0;
    TextView countDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDisplay = (TextView) findViewById(R.id.countVal);
    }

    public void resCount (android.view.View view) {
        currVal = 0;
        countDisplay.setText(Integer.toString(currVal));
    }

    public void incCount (android.view.View view) {
        currVal++;
        countDisplay.setText(Integer.toString(currVal));
    }

    public void decCount (android.view.View view) {
        currVal--;
        countDisplay.setText(Integer.toString(currVal));
    }


}
