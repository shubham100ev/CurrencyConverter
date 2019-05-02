package com.example.currencyconverter;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value;
    Button btn;
    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = findViewById(R.id.dollar_value);
        btn = findViewById(R.id.convert_btn);
        img = findViewById(R.id.currency_image);
        txt = findViewById(R.id.text_display);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double dollarValue = Double.parseDouble(value.getText().toString());
                double inrValue = dollarValue * 6937;
                inrValue=Math.round(inrValue)/100.0;
                txt.setText("Rs." + inrValue);
                img.setImageResource(R.drawable.rupees);
            }
        });

    }
}
