package com.example.andrewclark.ButtonCounter_Project_Clark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    int currVal = 0;
    TextView countDisplay;
    TextView changeChar;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("savedNum", currVal);

        savedInstanceState.putString("savedChar", String.valueOf(changeChar.getText()));
        savedInstanceState.putInt("savedColor", changeChar.getCurrentTextColor());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        currVal = savedInstanceState.getInt("savedNum");
        int currColor = savedInstanceState.getInt("savedColor");
        String currChar = savedInstanceState.getString("savedChar");

        countDisplay.setText(Integer.toString(currVal));
        changeChar.setText(currChar);
        changeChar.setTextColor(currColor );
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDisplay = (TextView) findViewById(R.id.countVal);
        changeChar = (TextView) findViewById(R.id.changeChar);
    }

    public void resCount (android.view.View view) {
        currVal = 0;
        countDisplay.setText(Integer.toString(currVal));
        changeChar.setText("↕");
        int color = Integer.parseInt("bdc3c7", 16)+0xFF000000;
        changeChar.setTextColor(color);
    }

    public void incCount (android.view.View view) {
        currVal++;
        countDisplay.setText(Integer.toString(currVal));
        changeChar.setText("▲");
        int color = Integer.parseInt("2ecc71", 16)+0xFF000000;
        changeChar.setTextColor(color);
    }

    public void decCount (android.view.View view) {
        currVal--;
        countDisplay.setText(Integer.toString(currVal));
        changeChar.setText("▼");
        int color = Integer.parseInt("e74c3c", 16)+0xFF000000;
        changeChar.setTextColor(color);
    }


}
