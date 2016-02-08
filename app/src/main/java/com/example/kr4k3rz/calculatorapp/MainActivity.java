package com.example.kr4k3rz.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView enter, output;
    Button btn_equal, btn_openbracket, btn_closebracket, btn_point, btn_0, btn_add,
            btn_3, btn_2, btn_1, btn_sub, btn_6,
            btn_5, btn_4, btn_mul, btn_9, btn_8,
            btn_7, btn_erase, btn_div, btn_ac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = (TextView) findViewById(R.id.editText);
        output = (TextView) findViewById(R.id.textView);

        btn_point = (Button) findViewById(R.id.btn_point);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        btn_openbracket = (Button) findViewById(R.id.btn_openbracket);
        btn_closebracket = (Button) findViewById(R.id.btn_closebracket);
        btn_ac = (Button) findViewById(R.id.btn_ac);
        btn_erase = (Button) findViewById(R.id.btn_erase);


        btn_point.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_openbracket.setOnClickListener(this);
        btn_closebracket.setOnClickListener(this);
        btn_ac.setOnClickListener(this);
        btn_erase.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_point:
                enter.setText(enter.getText() + ".");
                break;
            case R.id.btn_0:
                enter.setText(enter.getText() + "0");
                break;
            case R.id.btn_1:
                enter.setText(enter.getText() + "1");
                break;
            case R.id.btn_2:
                enter.setText(enter.getText() + "2");
                break;
            case R.id.btn_3:
                enter.setText(enter.getText() + "3");
                break;
            case R.id.btn_4:
                enter.setText(enter.getText() + "4");
                break;
            case R.id.btn_5:
                enter.setText(enter.getText() + "5");
                break;
            case R.id.btn_6:
                enter.setText(enter.getText() + "6");
                break;
            case R.id.btn_7:
                enter.setText(enter.getText() + "7");
                break;
            case R.id.btn_8:
                enter.setText(enter.getText() + "8");
                break;
            case R.id.btn_9:
                enter.setText(enter.getText() + "9");
                break;
            case R.id.btn_add:
                enter.setText(enter.getText() + "+");
                break;
            case R.id.btn_sub:
                enter.setText(enter.getText() + "-");
                break;
            case R.id.btn_mul:
                enter.setText(enter.getText() + "*");
                break;
            case R.id.btn_div:
                enter.setText(enter.getText() + "/");
                break;
            case R.id.btn_openbracket:
                enter.setText(enter.getText() + "(");
                break;
            case R.id.btn_closebracket:
                enter.setText(enter.getText() + ")");
                break;
            case R.id.btn_equal:
                try {
                    String exp = enter.getText().toString();
                    output.setText(("=" + (int) Expression.eval(exp)));  //evaluates the expression using Expression class
                } catch (RuntimeException e) {
                    Toast.makeText(MainActivity.this, "Wrong Expression", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_ac:
                enter.setText("");   //sets empty when AC is clicked
                break;
            case R.id.btn_erase:
                if (output.length() != 0)   //erase first the  output value and the expression in enter textview
                    output.setText("");
                try {
                    String exp = enter.getText().toString();
                    String after_erase = exp.substring(0, exp.length() - 1);
                    enter.setText(after_erase);
                } catch (Exception e) {
                    e.printStackTrace();
                    enter.setText("");
                }
                break;

        }
    }


}
