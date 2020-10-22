package com.example.foxmidfirst;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserString;
    private EditText editTextUserSymbolExclude;
    private TextView textViewAnswer;
    private Button btnStart;
    private Rotator rotator = new Rotator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userStringSentence;
                String userSymboIgnore;
                userSymboIgnore = editTextUserSymbolExclude.getText().toString();
                userStringSentence = editTextUserString.getText().toString();
                textViewAnswer.setText(rotator.rotateWord(userStringSentence,userSymboIgnore));
            }
        });

    }

    private void init() {
        editTextUserString = findViewById(R.id.edText1);
        editTextUserSymbolExclude = findViewById(R.id.edText2);
        textViewAnswer = findViewById(R.id.textView4);
        btnStart = findViewById(R.id.button1);
    }
}