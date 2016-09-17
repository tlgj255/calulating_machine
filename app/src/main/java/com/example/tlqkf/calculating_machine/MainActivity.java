package com.example.tlqkf.calculating_machine;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int num[] = new int[4], maNum[] = new int[4], a = 0, num2 = 0, b = 0;
    String s;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, result, reset, division, plus, multiply, subtrack, bracket, back, n00, switch_;
    TextView show_result, show_n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        n0 = (Button) findViewById(R.id.n0);
        result = (Button) findViewById(R.id.result);
        reset = (Button) findViewById(R.id.reset);
        division = (Button) findViewById(R.id.division);
        plus = (Button) findViewById(R.id.plus);
        multiply = (Button) findViewById(R.id.multiply);
        subtrack = (Button) findViewById(R.id.subtrack);
        bracket = (Button) findViewById(R.id.bracket);
        back = (Button) findViewById(R.id.back);
        n00 = (Button) findViewById(R.id.n00);
        switch_ = (Button) findViewById(R.id.switch_);
        show_result = (TextView) findViewById(R.id.show_result);
        show_n = (TextView) findViewById(R.id.show_n);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        n0.setOnClickListener(this);
        result.setOnClickListener(this);
        reset.setOnClickListener(this);
        division.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        subtrack.setOnClickListener(this);
        bracket.setOnClickListener(this);
        back.setOnClickListener(this);
        n00.setOnClickListener(this);
        switch_.setOnClickListener(this);
        show_n.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast over = Toast.makeText(MainActivity.this, "입력 가능한 9자를 초과했습니다.", Toast.LENGTH_SHORT);
        switch (v.getId()) {
            case R.id.plus:
                if (num[a] > 0 && b == 0) {
                    b = 1;
                    a++;
                    s = "+";
                }
                break;
            case R.id.division:
                if (num[a] > 0 && b == 0) {
                    b = 2;
                    a++;
                    s = "%";
                }
                break;
            case R.id.subtrack:
                if (num[a] > 0 && b == 0) {
                    b = 3;
                    a++;
                    s = "-";
                }
                break;
            case R.id.multiply:
                if (num[a] > 0 && b == 0) {
                    b = 4;
                    a++;
                    s = "X";
                }
        }
        switch (v.getId()) {
            case R.id.n1:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    num[a] = num[a] * 10;
                    num[a]++;
                    b = 0;
                } else {
                    over.show();
                }
                break;
            case R.id.n2:
                if (maNum[a] < 10) {
                    b = 0;
                    maNum[a]++;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 2;
                } else {
                    over.show();
                }
                break;
            case R.id.n3:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 3;
                } else {
                    over.show();
                }
                break;
            case R.id.n4:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 4;
                } else {
                    over.show();
                }
                break;
            case R.id.n5:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 5;
                } else {
                    over.show();
                }
                break;
            case R.id.n6:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 6;
                } else {
                    over.show();
                }
                break;
            case R.id.n7:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 7;
                } else {
                    over.show();
                }
                break;
            case R.id.n8:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 8;
                } else {
                    over.show();
                }
                break;
            case R.id.n9:
                if (maNum[a] < 10) {
                    maNum[a]++;
                    b = 0;
                    num[a] = num[a] * 10;
                    num[a] = num[a] + 9;
                } else {
                    over.show();
                }
                break;
            case R.id.n0:
                if (num[a] > 0) {
                    if (maNum[a] < 10) {
                        b = 0;
                        maNum[a]++;
                        num[a] = num[a] * 10;
                    } else {
                        over.show();
                    }
                }
                break;
            case R.id.n00:
                if (num[a] > 0) {
                    if (maNum[a] < 7) {
                        b = 0;
                        maNum[a] = maNum[a] + 2;
                        num[a] = num[a] * 100;
                    } else if (maNum[a] < 9) {
                        maNum[a]++;
                        num[a] = num[a] * 10;
                    } else
                        over.show();
                }
                break;
            case R.id.back:
                if (maNum[a] > 0) {
                    maNum[a]--;
                    num[a] = num[a] * 1 / 10;
                }
                break;
            case R.id.reset:
        }
        if (s == null)
            show_n.setText("" + num[0]);
        else if (s != null)
            show_n.setText("" + num[0] + s);
        if (s != null && num[1] > 0)
            show_n.setText("" + num[0] + s + num[1]);
        if (a == 2) {
            a = 1;
            if (b == 1) {
                num[0] = num[0]+num[1];
                show_n.setText("" + num[0]+s);
                b = num[0];
                show_result.setText(""+b);
            }
            if (b == 2) {
                num[0] = num[0]/num[1];
                show_n.setText("" + num[0]+s);
                b = num[0];
                show_result.setText(""+b);
            }
            if (b == 3) {
                num[0] = num[0]-num[1];
                show_n.setText("" + num[0]+s);
                b = num[0];
                show_result.setText(""+b);
            }
            if (b == 4) {
                num[0] = num[0]*num[1];
                show_n.setText("" + num[0]+s);
                b = num[0];
                show_result.setText(""+b);
            }
            num[1] = 0;
            maNum[1] = 0;
        }
        Log.i("num[" + a + "]값", "" + num[a]);
        Log.i("maNum[" + a + "]값", "" + maNum[a]);
    }
}
