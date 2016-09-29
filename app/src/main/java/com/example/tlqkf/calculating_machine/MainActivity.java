package com.example.tlqkf.calculating_machine;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int maNum/*margin number*/[] = new int[2], a = 0, nu = 0, b = 0, d = 0, num[] = new int[2], c = 0, ran, e;
    String s;
    Button result, reset, division, plus, multiply, subtrack, back, switch_, ggyu;
    TextView show_result, show_n;
    private MediaPlayer[] g = new MediaPlayer[8];
    private Button[] n = new Button[11];//button set array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ggyu = (Button) findViewById(R.id.ggyu);
        n[1] = (Button) findViewById(R.id.n1);
        n[2] = (Button) findViewById(R.id.n2);
        n[3] = (Button) findViewById(R.id.n3);
        n[4] = (Button) findViewById(R.id.n4);
        n[5] = (Button) findViewById(R.id.n5);
        n[6] = (Button) findViewById(R.id.n6);
        n[7] = (Button) findViewById(R.id.n7);
        n[8] = (Button) findViewById(R.id.n8);
        n[9] = (Button) findViewById(R.id.n9);
        n[0] = (Button) findViewById(R.id.n0);
        result = (Button) findViewById(R.id.result);
        reset = (Button) findViewById(R.id.reset);
        division = (Button) findViewById(R.id.division);
        plus = (Button) findViewById(R.id.plus);
        multiply = (Button) findViewById(R.id.multiply);
        subtrack = (Button) findViewById(R.id.subtrack);
        back = (Button) findViewById(R.id.back);
        n[10] = (Button) findViewById(R.id.n00);
        switch_ = (Button) findViewById(R.id.switch_);
        show_result = (TextView) findViewById(R.id.show_result);
        show_n = (TextView) findViewById(R.id.show_n);
        n[1].setOnClickListener(this);
        n[2].setOnClickListener(this);
        n[3].setOnClickListener(this);
        n[4].setOnClickListener(this);
        n[5].setOnClickListener(this);
        n[6].setOnClickListener(this);
        n[7].setOnClickListener(this);
        n[8].setOnClickListener(this);
        n[9].setOnClickListener(this);
        n[0].setOnClickListener(this);
        n[10].setOnClickListener(this);
        result.setOnClickListener(this);
        reset.setOnClickListener(this);
        division.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        subtrack.setOnClickListener(this);
        back.setOnClickListener(this);
        switch_.setOnClickListener(this);
        show_n.setOnClickListener(this);
        ggyu.setOnClickListener(this);
        g[0] = MediaPlayer.create(this, R.raw.finish006);//8 funny sound
        g[1] = MediaPlayer.create(this, R.raw.finish007);
        g[2] = MediaPlayer.create(this, R.raw.finish008);
        g[3] = MediaPlayer.create(this, R.raw.finish009);
        g[4] = MediaPlayer.create(this, R.raw.finish010);
        g[5] = MediaPlayer.create(this, R.raw.finish011);
        g[6] = MediaPlayer.create(this, R.raw.finish012);
        g[7] = MediaPlayer.create(this, R.raw.finish013);
    }

    @Override
    public void onClick(View v) {
        Toast over = Toast.makeText(MainActivity.this, "입력 가능한 9자를 초과했습니다.", Toast.LENGTH_SHORT);
        switch (v.getId()) {
            case R.id.ggyu:
                ran = (int) (Math.random() * 7);
                //start random funny sound
                g[ran].start();
                break;
            case R.id.switch_:
                if (nu == 0) {
                    nu = 1;
                    num[a] = num[a] * -1;
                } else if (nu == 1) {
                    nu = 0;
                    num[a] = num[a] * -1;
                }
                break;
            case R.id.plus:
                if (d == 1 && num[a] != 0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    b = 1;
                    s = "+";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + num[0] + s);
                    a = 1;

                }
                if (num[a] > 0 && b == 0) {
                    nu = 0;
                    d++;
                    b = 1;
                    a = 1;
                    s = "+";
                }
                break;
            case R.id.division:
                if (d == 1 && num[a] != 0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + num[0] + s);
                    a = 1;
                    b = 2;
                    s = "÷";
                }
                if (num[a] > 0 && b == 0) {
                    nu = 0;
                    d++;
                    b = 2;
                    a = 1;
                    s = "÷";
                }
                break;
            case R.id.subtrack:
                if (d == 1 && num[a] != 0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    b = 3;
                    s = "-";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + num[0] + s);
                    a = 1;
                }
                if (num[a] > 0 && b == 0) {
                    nu = 0;
                    d++;
                    b = 3;
                    a = 1;
                    s = "-";
                }
                break;
            case R.id.multiply:
                if (d == 1 && num[a] != 0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    b = 4;
                    s = "X";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + num[0] + s);
                    a = 1;
                }
                if (num[a] > 0 && b == 0) {
                    nu = 0;
                    d++;
                    b = 4;
                    a = 1;
                    s = "X";
                }
        }
        switch (v.getId()) {
            case R.id.n1:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a]++;
                    else
                        num[a]--;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n2:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 2;
                    else
                        num[a] = num[a] - 2;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n3:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 3;
                    else
                        num[a] = num[a] - 3;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n4:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 4;
                    else
                        num[a] = num[a] - 4;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n5:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 5;
                    else
                        num[a] = num[a] - 5;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n6:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 6;
                    else
                        num[a] = num[a] - 6;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n7:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 7;
                    else
                        num[a] = num[a] - 7;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n8:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 8;
                    else
                        num[a] = num[a] - 8;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n9:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if (nu == 0)
                        num[a] = num[a] + 9;
                    else
                        num[a] = num[a] - 9;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n0:
                if (maNum[a] < 9 && num[a] > 0) {
                    num[a] = num[a] * 10;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n00:
                if (maNum[a] < 9 && num[a] > 0) {
                    num[a] = num[a] * 10;
                    maNum[a]++;
                    if (maNum[a] < 8 && num[a] > 0) {
                        num[a] = num[a] * 10;
                        maNum[a]++;
                    }
                } else {
                    over.show();
                }
                break;
            case R.id.back:
                if (s != null && num[a] == 0) {
                    s = null;
                    a--;
                    b = 0;
                    d = 0;
                } else if (num[a] > 0) {
                    e = num[a] / 10 * 10;
                    Log.i("e값", "" + num[a] / 10 * 10);
                    Log.i("ㅇ", "" + (num[a] - e));
                    e = num[a] - e;
                    num[a] = (num[a] - e) / 10;
                    maNum[a]--;
                } else if (num[a] < 0) {
                    num[a] *= -1;
                    e = num[a] / 10 * 10;
                    e = num[a] - e;
                    num[a] = (num[a] - e) / 10;
                    maNum[a]--;
                    num[a] *= -1;
                }
                if(maNum[a] <0)
                    maNum[a] = 0;
                break;
            case R.id.reset:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.go, R.anim.gone);
                break;
            case R.id.result:
                if (a == 1 && num[a] > 0) {
                    nu = 0;
                    d = 0;
                    s = null;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000){
                            num[0] = num[0] * num[1];
                            c = num[0];
                            show_result.setText("=" + c);
                        }
                        else
                            show_result.setText("=표기 할 수 없는 값입니다.");
                    }
                    b = 0;
                    for(int ie =0; ie< 2; ie++){
                        num[ie] = 0;
                        maNum[ie] = 0;
                    }
                    a = 0;
                } else {
                    c = num[a];
                    show_result.setText("=" + c);
                }
                break;
        }
        if (num[0] == 0) {
            nu = 0;
            show_n.setText("");
        } else {
            if (s == null)
                show_n.setText("" + num[a]);
            if (s != null)
                show_n.setText("" + num[0] + s);
            if (s != null && num[1] != 0)
                show_n.setText("" + num[0] + s + num[1]);
        }
        Log.i("c", "" + c);
        Log.i("num[" + a + "]값", "" + num[a]);
        Log.i("maNum[" + a + "]값", "" + maNum[a]);
        Log.i("현재값", "" + num[0] + s + num[1]);
    }
}
