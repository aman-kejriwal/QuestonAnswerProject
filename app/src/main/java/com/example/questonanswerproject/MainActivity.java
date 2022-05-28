package com.example.questonanswerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button yes,no;
TextView question;
//int index=0;
    int score=0;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.question);
        no=findViewById(R.id.no);
        yes=findViewById(R.id.yes);
//        question=findViewById(R.id.question);
        String questions[]={"is java a language ?","is java is Introduced by aman ?"," is java Support interfaces ?","is java is OOPs language ?","is java introduced by aman ?"};
        boolean answer[]={true,false,true,true,false};
//        int score =0;
        question.setText(questions[index]);

        no.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(index<=questions.length-1){
                if(!answer[index++]){
                    score++;
                }
                if(index==questions.length){
                    Toast.makeText(MainActivity.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                }
               else question.setText(questions[index]);
            }
            else {
                    Toast.makeText(MainActivity.this, "restart the app play again", Toast.LENGTH_SHORT).show();}
            }
        });
//        if(index==questions.length){
//            Toast.makeText(this, "Your score is "+score , Toast.LENGTH_SHORT).show();
//        }
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                if(answer[index++]){
                    score++;
                }
                if(index==questions.length){
                    Toast.makeText(MainActivity.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                }
               else  question.setText(questions[index]);
            }
                else {
                    Toast.makeText(MainActivity.this, "restart the app play again ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}