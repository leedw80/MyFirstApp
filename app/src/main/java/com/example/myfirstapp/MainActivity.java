package com.example.myfirstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public final static String EXTRA_COUNT = "com.example.myfirstapp.COUNT";

    StringBuilder stringBuilder;

    DBHelper dbHelper;
    TextView result;
    String fDate;

    String message = "";
    String count = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this, DisplayMessageActivity.class);

        Button send = (Button) findViewById(R.id.btn_send);
        send.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("dwlee", "onClick:");
                    if (stringBuilder.length() == 13) {
                        TextView textView = (TextView) findViewById(R.id.edit_message);
                        message = textView.getText().toString();
                        count = dbHelper.getResult(message);
                        if (Integer.parseInt(count) < 10) {
                            dbHelper.insert(fDate, message, 123);
                            count = dbHelper.getResult(message);

                            result.setText(count);

                            intent.putExtra(EXTRA_MESSAGE, message);
                            intent.putExtra(EXTRA_COUNT, count);
                            startActivity(intent);
                        }else{
                            result.setText(count);

                            intent.putExtra(EXTRA_MESSAGE, message);
                            intent.putExtra(EXTRA_COUNT, count);
                            startActivity(intent);
                        }
                    } else {
                        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();     //닫기
                            }
                        });
                        alert.setMessage("Please again.");
                        alert.show();
                    }
                }
        });

        Button search = (Button) findViewById(R.id.btn_search);
        search.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringBuilder.length() == 13) {
                    TextView textView = (TextView) findViewById(R.id.edit_message);
                    message = textView.getText().toString();
                    count = dbHelper.getResult(message);

                    result.setText(count);

                    intent.putExtra(EXTRA_MESSAGE, message);
                    intent.putExtra(EXTRA_COUNT, count);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();     //닫기
                        }
                    });
                    alert.setMessage("Please again.");
                    alert.show();
                }
            }
        });

        dbHelper = new DBHelper(getApplicationContext(), "stampgo.db", null, 1);

        // 테이블에 있는 모든 데이터 출력
        result = (TextView) findViewById(R.id.txt_result);
        result.setMovementMethod((ScrollingMovementMethod.getInstance()));
        // 날짜는 현재 날짜로 고정
        // 현재 시간 구하기
        long now = System.currentTimeMillis();
        Date date = new Date(now);

        // 출력될 포맷 설정
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fDate = simpleDateFormat.format(date);

        stringBuilder = new StringBuilder();

        TextView textView = (TextView) findViewById(R.id.edit_message);
        textView.setText(stringBuilder.append("010-").toString());
    }

    public void num7(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        //Log.e("dwlee", "stringBuilder.length():" + stringBuilder.length());
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("7-").toString());
        } else {
            textView.setText(stringBuilder.append("7").toString());
        }

    }

    public void num8(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("8-").toString());
        } else {
            textView.setText(stringBuilder.append("8").toString());
        }
    }

    public void num9(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("9-").toString());
        } else {
            textView.setText(stringBuilder.append("9").toString());
        }
    }

    public void num4(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("4-").toString());
        } else {
            textView.setText(stringBuilder.append("4").toString());
        }
    }

    public void num5(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("5-").toString());
        } else {
            textView.setText(stringBuilder.append("5").toString());
        }
    }

    public void num6(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("6-").toString());
        } else {
            textView.setText(stringBuilder.append("6").toString());
        }
    }

    public void num1(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("1-").toString());
        } else {
            textView.setText(stringBuilder.append("1").toString());
        }
    }

    public void num2(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("2-").toString());
        } else {
            textView.setText(stringBuilder.append("2").toString());
        }
    }

    public void num3(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("3-").toString());
        } else {
            textView.setText(stringBuilder.append("3").toString());
        }
    }

    public void num0(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        if (stringBuilder.length() == 7) {
            textView.setText(stringBuilder.append("0-").toString());
        } else {
            textView.setText(stringBuilder.append("0").toString());
        }
    }

    public void Delete(View view) {
        stringBuilder = new StringBuilder();

        TextView textView = (TextView) findViewById(R.id.edit_message);
        textView.setText(stringBuilder.append("010-").toString());
    }

}
