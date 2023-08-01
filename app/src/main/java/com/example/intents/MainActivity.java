package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String myname = "Henry";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = new Button(this);
        mybutton.setText("Display Activity 2! Press the Button");
        mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                DisplayActivity2();
            }
        });

    TextView mytextview =new TextView(this);
    mytextview.setText("Hello Students! Welcome to Intent Demonstration");

    LinearLayout mylayout = new LinearLayout(this);
    mylayout.setOrientation(LinearLayout.VERTICAL);
    mylayout.addView(mytextview);
    mylayout.addView(mybutton);
    setContentView(mylayout);
}
    public void DisplayActivity2(){
        Intent myIntent=new Intent(this, MainActivity2.class);
        myIntent.putExtra("MyDATA",myname);
        startActivity(myIntent);
    }
}