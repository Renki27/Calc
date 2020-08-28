package com.dam.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.itis.libs.parserng.android.expressParser.MathExpression;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String DOT = ".";
    // private boolean dotAdded = false;
    TextView result;
    TextView operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textView2);
        operation = findViewById(R.id.textView);
        result.setText(R.string.zero);
        operation.setText(R.string.zero);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_0:
                if (!isZero()) {

                    operation.setText(operation.getText() + "0");
                }
                break;
            case R.id.bt_1:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {

                    operation.setText(operation.getText() + "1");
                } else {

                    operation.setText("1");
                }
                break;

            case R.id.bt_2:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "2");
                } else {
                    operation.setText("2");
                }
                break;

            case R.id.bt_3:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {

                    operation.setText(operation.getText() + "3");
                } else {
                    operation.setText("3");
                }
                break;

            case R.id.bt_4:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "4");
                } else {
                    operation.setText("4");
                }
                break;

            case R.id.bt_5:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "5");
                } else {
                    operation.setText("5");
                }
                break;

            case R.id.bt_6:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "6");
                } else {
                    operation.setText("6");
                }
                break;

            case R.id.bt_7:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "7");
                } else {
                    operation.setText("7");
                }
                break;

            case R.id.bt_8:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "8");
                } else {
                    operation.setText("8");
                }
                break;

            case R.id.bt_9:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    operation.setText(operation.getText() + "9");
                } else {
                    operation.setText("1");
                }
                break;

            case R.id.bt_Plus:


                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {


             /*       if (!addition) {
                        addition = true;
                        value1 = Float.parseFloat(result.getText() + "");
                        result.setText(null);
                    } else {
                        value2 = Float.parseFloat(result.getText() + "");
                        float res = value1 + value2;
                        if (hasDecimals(res)) {
                            res = Math.round(res);
                        }
                        result.setText(res + "");
                        addition = false;
                    }*/
                    operation.setText(operation.getText() + ADDITION);

                }


                break;

            case R.id.bt_Subtract:
                if (!isZero()) {
                    operation.setText(operation.getText() + SUBTRACTION);
                }
                break;

            case R.id.bt_Multiply:
                if (!isZero()) {
                    operation.setText(operation.getText() + MULTIPLICATION);
                }
                break;

            case R.id.bt_Divide:
                if (!isZero()) {
                    operation.setText(operation.getText() + DIVISION);
                }
                break;


            case R.id.bt_equals:
                MathExpression expr = new MathExpression(operation.getText().toString());
                result.setText(expr.solve());
                // Toast.makeText(MainActivity.this,res, Toast.LENGTH_SHORT).show();
                break;

            case R.id.bt_Clear:
                result.setText("0");
                operation.setText("0");
                //   dotAdded = false;
                break;

            case R.id.bt_delete:
                if (!isZero()) {
                    if (operation.getText().length() > 1) {
                        operation.setText(operation.getText().toString().substring(0, (operation.getText().length() - 1)));
                        //    checkDotAdded();

                    } else {
                        operation.setText("0");
                        //      dotAdded = false;
                    }
                }

                break;

            case R.id.bt_Dot:
                //Toast.makeText(MainActivity.this,"1 pressed", Toast.LENGTH_SHORT).show();
                if (!isZero()) {
                    /*
                    checkDotAdded();
                    if (dotAdded == false) {
                        operation.setText(operation.getText() + DOT);
                        dotAdded = true;
                    }

                     */
                    operation.setText(operation.getText() + DOT);
                }
                break;

            default:
                break;
        }

    }

    private boolean isZero() {
        String temp = operation.getText().toString();
        return temp.startsWith("0");
    }
/*
    private void checkDotAdded() {
        String temp = result.getText().toString();
        this.dotAdded = temp.contains(".");
    }
*/
    private boolean hasDecimals(float number) {
        return number % 1 == 0;
    }


}