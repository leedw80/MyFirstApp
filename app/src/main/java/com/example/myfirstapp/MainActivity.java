package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringBuilder = new StringBuilder();

        TextView textView = (TextView) findViewById(R.id.edit_message);
        textView.setText(stringBuilder.append("010-").toString());
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.edit_message);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void num7(View view) {
        TextView textView = (TextView) findViewById(R.id.edit_message);
        Log.e("dwlee", "stringBuilder.length():" + stringBuilder.length());
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
