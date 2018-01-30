package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etNumber2;
    private Button btnplus;
    private Button btnminus;
    private Button btnmultiply;
    private Button btndivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber1 = findViewById(R.id.etnumber1);
        etNumber2 = findViewById(R.id.etnumber2);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivision = findViewById(R.id.btndivision);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etNumber1.getText().toString());
                int number2 = Integer.parseInt(etNumber2.getText().toString());
               Toast.makeText( MainActivity.this, String.valueOf(plus(number1, number2)),Toast.LENGTH_SHORT).show();


            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etNumber1.getText().toString());
                int number2 = Integer.parseInt(etNumber2.getText().toString());
                Toast.makeText( MainActivity.this, String.valueOf(minus(number1, number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etNumber1.getText().toString());
                int number2 = Integer.parseInt(etNumber2.getText().toString());
                Toast.makeText( MainActivity.this, String.valueOf(multiply(number1, number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etNumber1.getText().toString());
                int number2 = Integer.parseInt(etNumber2.getText().toString());
                Toast.makeText( MainActivity.this, String.valueOf(division(number1, number2)),Toast.LENGTH_SHORT).show();

            }
        });

    }

    private int plus(int number1, int number2) {
        return number1 + number2;
    }

    private int minus(int number1, int number2) {
        return number1 + number2;
    }

    private int multiply(int number1, int number2) {
        return number1 + number2;
    }

    private int division(int number1, int number2) {
        if(number2 == 0);
        {
            return 0;
        }
        else
        {
            return number1/number2;
        }
        return number1 + number2;
    }
}
