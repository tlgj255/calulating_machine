package com.example.tlqkf.calculating_machine;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int maNum[] = new int[4], a = 0, nu = 0, b = 0, d = 0;
    double num[] = new double[4], c = 0;
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
            case R.id.switch_:
                nu = 1;
                num[a] = num[a] * -1;
                break;
            case R.id.plus:
                if (d == 1&&num[a]!=0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000) {
                            num[0] = num[0] + num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                        if (b == 2) {
                            if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                                num[0] = num[0] / num[1];
                                show_result.setText("=" + c);
                            } else {
                                show_result.setText("=표기 할 수 없는 값입니다.");
                            }
                        }
                        if (b == 3) {

                            if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                                num[0] = num[0] - num[1];
                            } else {
                                show_result.setText("=표기 할 수 없는 값입니다.");
                            }
                        }
                        if (b == 4) {
                            if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000) {
                                num[0] = num[0] * num[1];
                            } else {
                                show_result.setText("=표기 할 수 없는 값입니다.");
                            }
                        }
                    b=1;
                    s="+";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + (int)num[0] + s);
                    c = num[0];
                    a = 1;
                    show_result.setText("=" + (int)c);
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
                if (d == 1&&num[a]!=0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000) {
                            num[0] = num[0] + num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] / num[1];
                            show_result.setText("=" + c);
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] - num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000) {
                            num[0] = num[0] * num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + (int)num[0] + s);
                    c = num[0];
                    a = 1;
                    b=2;
                    s="÷";
                    show_result.setText("=" + (int)c);
                }
                if (num[a] > 0 && b == 0) {
                    nu = 0;
                    d++;
                    b = 2;
                    a = 1;
                    s = "%";
                }
                break;
            case R.id.subtrack:
                if (d == 1&&num[a]!=0) {
                    nu = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000) {
                            num[0] = num[0] + num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] / num[1];
                            show_result.setText("=" + c);
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] - num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000) {
                            num[0] = num[0] * num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    b=3;
                    s="-";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + (int)num[0] + s);
                    c = num[0];
                    a = 1;
                    show_result.setText("=" + (int)c);
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
                if (d == 1&&num[a]!=0) {
                    nu = 0;
                    d = 0;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000) {
                            num[0] = num[0] + num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] / num[1];
                            show_result.setText("=" + c);
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] - num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000) {
                            num[0] = num[0] * num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    b = 4;
                    s="X";
                    num[1] = 0;
                    maNum[1] = 0;
                    show_n.setText("" + (int)num[0] + s);
                    c = num[0];
                    a = 1;
                    show_result.setText("=" + (int)c);
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
                    if(nu == 0)
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
                    if(nu == 0)
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
                    if(nu == 0)
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
                    if(nu == 0)
                        num[a] = num[a] + 4;
                    else
                    num[a] = num[a] -4;
                    maNum[a]++;
                } else {
                    over.show();
                }
                break;
            case R.id.n5:
                if (maNum[a] < 9) {
                    num[a] = num[a] * 10;
                    if(nu == 0)
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
                    if(nu == 0)
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
                    if(nu == 0)
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
                    if(nu == 0)
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
                    if(nu == 0)
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
                break;
            case R.id.reset:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.go, R.anim.gone);
                break;
            case R.id.result:
                if (a == 1&&num[a]>0) {
                    nu = 0;
                    d = 0;
                    s = null;
                    if (b == 1) {
                        if (num[0] + num[1] < 100000000 && num[0] + num[1] > -100000000) {
                            num[0] = num[0] + num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 2) {
                        if (num[0] / num[1] < 100000000 && num[0] / num[1] > -100000000) {
                            num[0] = num[0] / num[1];
                            show_result.setText("=" + c);
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 3) {

                        if (num[0] - num[1] < 100000000 && num[0] - num[1] > -100000000) {
                            num[0] = num[0] - num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    if (b == 4) {
                        if (num[0] * num[1] < 100000000 && num[0] * num[1] > -1000000000) {
                            num[0] = num[0] * num[1];
                        } else {
                            show_result.setText("=표기 할 수 없는 값입니다.");
                        }
                    }
                    b = 0;
                    num[1] = 0;
                    maNum[1] = 0;
                    maNum[0] = 0;
                    c = num[0];
                    num[0] = 0;
                    a = 0;
                    show_result.setText("=" + (int)c);
                } else
                    Toast.makeText(MainActivity.this, "숫자를 마저 입력해 주세요", Toast.LENGTH_SHORT).show();
                break;
        }
        if (s == null)
            show_n.setText("" + (int) num[a]);
        else if (s != null)
            show_n.setText("" + (int) num[0] + s);
        if (s != null && num[1] != 0)
            show_n.setText("" + (int) num[0] + s + (int) num[1]);
        Log.i("c", "" + c);
        Log.i("num[" + a + "]값", "" + num[a]);
        Log.i("maNum[" + a + "]값", "" + maNum[a]);
        Log.i("현재값", "" + num[0] + s + num[1]);
    }
}
