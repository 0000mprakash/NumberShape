package com.example.numbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    public static boolean triangula(int a){
        int num=0;
        for(int i=1;i<a;i++){
            num=num+i;
            if (num==a){
                return true;
            }
        }
        return false;
    }
    static boolean square(int a){
        double squareroot =sqrt(a);
        int t= (int) squareroot;
        if (squareroot==t){
            return true;
        }
        return false;
    }
    public void Checkif(View view){

        EditText value = (EditText) findViewById(R.id.editTextNumber);
        if (value.getText().toString().isEmpty()){
            Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            int a = Integer.parseInt(value.getText().toString());
            if (triangula(a) && square(a)) {
                Toast.makeText(this, "given number is both triangular and square", Toast.LENGTH_SHORT).show();
            } else if (triangula(a)) {
                Toast.makeText(this, "given number is only triangular", Toast.LENGTH_SHORT).show();

            } else if (square(a)) {
                Toast.makeText(this, "square", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "the entered number is nither square and triangle", Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}