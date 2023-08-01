package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    private String myvariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button mybutton = new Button(this);
        mybutton.setText("WELCOME TO TUM RENTAL APP! PRESS THE BUTTON");
        TextView mytextview = new TextView(this);
        mytextview.setText("WHAT IS YOUR NAME?");
        EditText myedittext = new EditText(this);
        LinearLayout mylayout = new LinearLayout(this);
        mylayout.setOrientation(LinearLayout.VERTICAL);
        mylayout.addView(mytextview);
        mylayout.addView(myedittext);
        mylayout.addView(mybutton);
        setContentView(mylayout);
        myvariable = getIntent().getStringExtra("MYDATA");
        Toast.makeText(this,myvariable, Toast.LENGTH_SHORT).show();

        Button backButton = new Button(this);
        backButton.setText("BACK TO MAIN ACTIVITY");
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
        mylayout.addView(backButton);
    }
}