package com.example.myapp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInRupeesDouble = amountInDollarsDouble * 180;

        String amountInRupeesString = String.format("%.2f", amountInRupeesDouble);

        Toast.makeText(this, "$" +amountInDollars +" is  RS." +amountInRupeesString , Toast.LENGTH_LONG).show();

        Log.i("Amount in Rupees", amountInRupeesString);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
