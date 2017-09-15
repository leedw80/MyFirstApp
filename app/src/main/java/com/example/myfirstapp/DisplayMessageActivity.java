package com.example.myfirstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String count = intent.getStringExtra(MainActivity.EXTRA_COUNT);

        ImageView imageView = (ImageView) findViewById(R.id.img_display);


        if (Integer.parseInt(count) >=  10 ) {
            imageView.setImageResource(R.mipmap.stampgo100);
        }else if(Integer.parseInt(count) >= 8 && Integer.parseInt(count) < 10 ) {
            imageView.setImageResource(R.mipmap.stampgo80);
        }else if(Integer.parseInt(count) >= 5 && Integer.parseInt(count) < 8 ) {
            imageView.setImageResource(R.mipmap.stampgo50);
        }else {
            imageView.setImageResource(R.mipmap.stampgo20);
        }

        TextView textView1 = (TextView) findViewById(R.id.activity_display_message);
        textView1.setText(message);

        Button button = (Button) findViewById(R.id.btn_count);
        button.setText(count);

        if (Integer.parseInt(count) > 10) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
