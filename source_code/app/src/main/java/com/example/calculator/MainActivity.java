package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView edit1;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd,
            buttonSub, buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        Remainder = (Button) findViewById(R.id.Remainder);

        edit1 = (TextView) findViewById(R.id.display);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "1");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText() + "9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    Subtraction = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    Division = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().length() != 0) {
                    input1 = Float.parseFloat(edit1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtraction || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edit1.getText() + "");
                }
                if (Addition) {
                    edit1.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtraction) {
                    edit1.setText(input1 - input2 + "");
                    Subtraction = false;
                }
                if (Multiplication) {
                    edit1.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    edit1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    edit1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (decimal) {
                    edit1.setText("ERROR");
                }
                else {
                    edit1.setText(edit1.getText() + ".");
                    decimal = true;
                }
            }
        });

    }

}
