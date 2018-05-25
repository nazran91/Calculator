package com.aiub.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView inputTV, resultTV;
    private Button oneBT, twoBT, threeBT, fourBT, fiveBT, sixBT,
            sevenBT, eightBT, nineBT, zeroBT, plusBT, minusBT, multiplyBT, divideBT,
            dotBT, ansBT, clearBT, equalBT, backspaceBT;
    private String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
    }

    private void initialization() {
        inputTV = findViewById(R.id.inputTV);
        resultTV = findViewById(R.id.resultTV);
        oneBT = findViewById(R.id.oneBT);
        twoBT = findViewById(R.id.twoBT);
        threeBT = findViewById(R.id.threeBT);
        fourBT = findViewById(R.id.fourBT);
        fiveBT = findViewById(R.id.fiveBT);
        sixBT = findViewById(R.id.sixBT);
        sevenBT = findViewById(R.id.sevenBT);
        eightBT = findViewById(R.id.eightBT);
        nineBT = findViewById(R.id.nineBT);
        zeroBT = findViewById(R.id.zeroBT);
        dotBT = findViewById(R.id.dotBT);
        equalBT = findViewById(R.id.equalBT);
        ansBT = findViewById(R.id.ansBT);
        plusBT = findViewById(R.id.plusBT);
        multiplyBT = findViewById(R.id.multiplyBT);
        divideBT = findViewById(R.id.divideBT);
        minusBT = findViewById(R.id.minusBT);
        clearBT = findViewById(R.id.clearBT);
        backspaceBT = findViewById(R.id.backspaceBT);

        oneBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.oneBT){

            input=input+"1";
            inputTV.setText(input);

            Log.e(TAG, "One Pressed");
            Toast.makeText(getApplicationContext(), "One Pressed", Toast.LENGTH_LONG).show();
        }
    }
}
