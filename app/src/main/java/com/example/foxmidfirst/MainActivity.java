package com.example.foxmidfirst;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserString;
    private EditText editTextUserSymbolExclude;
    private TextView textViewAnswer;
    private Button btnStart;
    private String userString;
    private String[] myUserArrString;
    //private StringBuilder strBuilderUserString = new StringBuilder();
    private String userSymbolExclude ;
    String[] myUserString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                userSymbolExclude=editTextUserSymbolExclude.getText().toString();//stringa iz edit text
                userString = editTextUserString.getText().toString();



                textViewAnswer.setText(rotateFun(userString));

            }
        });

    }

    private void init(){
        editTextUserString = findViewById(R.id.edText1);
        editTextUserSymbolExclude = findViewById(R.id.edText2);
        textViewAnswer = findViewById(R.id.textView4);
        btnStart = findViewById(R.id.button1);

        userSymbolExclude=editTextUserSymbolExclude.getText().toString();//stringa iz edit text
        userString = editTextUserString.getText().toString();
       /* strBuilderUserString.append(userString);
        strBuilderUserString = strBuilderUserString.reverse();
        userSymbolExclude=editTextUserSymbolExclude.getText().toString();*/
        Log.d("MyLog", "tttttt2222222="+textViewAnswer);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private String rotateFun(String userString){


        myUserArrString=userString.split(" ");
        StringBuilder reversed = new StringBuilder();
                for(String word : myUserArrString) {
                    reversed.append(new StringBuilder(word).reverse())
                            .append(" ");
                }
                return reversed.toString();



        //myUserString = userString.toArray(String[]::new);

    }

    private void fun(String userString, String userSymbolExclude) {
        for(int i = 0;i<userSymbolExclude.length();i++){
            for (int j = 0; j< userString.length();j++){
                if(userSymbolExclude.charAt(i) == userString.charAt(j)){


                }
            }
        }

    }



    private String algorithmFunc(StringBuilder userString,String userSymbolExclude){
        StringBuilder sb = new StringBuilder(userSymbolExclude);
        //Character[] ww = userSymbolExclude.toCharArray();
        //char[] ch= userSymbolExclude.toCharArray();
        sb.append(userSymbolExclude);
        for(int i = 0;i<sb.length();i++){
            for (int j = 0; j< userString.length();j++){
                if(sb.charAt(i) == userString.charAt(j)){

                }
            }
        }
        return userString.toString();

    }







}