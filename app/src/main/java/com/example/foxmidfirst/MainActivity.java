package com.example.foxmidfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserString;
    private EditText editTextUserSymbolExclude;
    private TextView textViewAnswer;
    private Button btnStart;
    private String userString;
    private StringBuilder strBuilderUserString = new StringBuilder();
    private String userSymbolExclude ;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Log.d("MyLog", "tttttt="+textViewAnswer);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userString = editTextUserString.getText().toString();
                strBuilderUserString.append(userString);
                strBuilderUserString = strBuilderUserString.reverse();
                userSymbolExclude=editTextUserSymbolExclude.getText().toString();
                textViewAnswer.setText(algorithmFunc(strBuilderUserString,userSymbolExclude));
                Log.d("MyLog", "tttttt2222222="+textViewAnswer);
            }
        });

    }

    private void init(){
        editTextUserString = findViewById(R.id.edText1);
        editTextUserSymbolExclude = findViewById(R.id.edText2);
        textViewAnswer = findViewById(R.id.textView4);
        btnStart = findViewById(R.id.button1);
        userString = editTextUserString.getText().toString();
        strBuilderUserString.append(userString);
        strBuilderUserString = strBuilderUserString.reverse();
        userSymbolExclude=editTextUserSymbolExclude.getText().toString();
    }

    private String algorithmFunc(StringBuilder userString,String userSymbolExclude){

        StringBuilder sb = new StringBuilder(userString);

        sb.append(userSymbolExclude);
        /*for(int i = 0;i<userSymbolExclude.length();i++){
            for (int j = 0; j< userString.length();j++){
                if(userSymbolExclude.charAt(i)<userString.charAt(j)){
                    userString.deleteCharAt(i);
                }
            }
        }*/
        return userString.toString();




    }







}