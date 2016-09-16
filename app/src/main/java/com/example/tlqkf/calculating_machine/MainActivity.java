package com.example.tlqkf.calculating_machine;

import android.content.pm.ActivityInfo;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int num1 = 0, maNum = 0;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, result, reset, division, plus, multiply, subtrack, bracket, back, point, switch_;
    TextView save_result, show_result, show_n;


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
        point = (Button) findViewById(R.id.point);
        switch_ = (Button) findViewById(R.id.switch_);
        save_result = (TextView) findViewById(R.id.save_result);
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
        point.setOnClickListener(this);
        switch_.setOnClickListener(this);
        show_n.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        show_n.setText("" + num1);
        Log.i("num1값", "" + num1);
        Log.i("maNum값", "" + maNum);
        Toast over = Toast.makeText(MainActivity.this,"입력 가능한 9자를 초과했습니다.",Toast.LENGTH_SHORT);
        switch (v.getId()) {
            case R.id.n1:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1++;

                }else{
                    over.show();
                }
                break;
            case R.id.n2:
                maNum++;
                if (maNum < 10) {
                    num1 = num1 * 10;
                    num1 = num1 + 2;
                }else{
                    over.show();
                }
                break;
            case R.id.n3:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 3;
                }else{
                    over.show();
                }
                break;
            case R.id.n4:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 4;
                }else{
                    over.show();
                }
                break;
            case R.id.n5:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 5;
                }else{
                    over.show();
                }
                break;
            case R.id.n6:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 6;
                }else{
                    over.show();
                }
                break;
            case R.id.n7:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 7;
                }else{
                    over.show();
                }
                break;
            case R.id.n8:
                maNum++;
                if (maNum < 10) {
                    num1 = num1 * 10;
                    num1 = num1 + 8;
                }else{
                    over.show();
                }
                break;
            case R.id.n9:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                    num1 = num1 + 9;
                }else{
                    over.show();
                }
                break;
            case R.id.n0:
                if (maNum < 10) {
                    maNum++;
                    num1 = num1 * 10;
                }else{
                    over.show();
                }
                break;
            case R.id.back:
                if (maNum < 10) {
                    maNum--;
                }
                break;
        }

    }
}
