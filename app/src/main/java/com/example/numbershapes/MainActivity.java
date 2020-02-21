package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class Number {
        int num;

        Number(int n) {
            num = n;
        }

        public boolean istrian() {
            int c = 1;
            int sum = 1;
            while (sum < num) {
                c++;
                sum += c;
            }
            if (sum == num)
                return true;
            else
                return false;
        }

        public boolean issquare() {
            int i = 1;
            int sq = 1;
            while (sq < num) {
                sq = i * i;
                i++;
            }
            if (sq == num)
                return true;
            else
                return false;

        }
    }
    public void checker(View view){
        EditText e=findViewById(R.id.editText);
        String str=e.getText().toString();
        int x=Integer.parseInt((str));
        Number n=new Number(x);
        if(n.istrian() && n.issquare()){
             Toast.makeText(this,"Both triangular and square",Toast.LENGTH_SHORT).show();
        }
        else if (n.issquare()){
            Toast.makeText(this,"it is Sqaure number",Toast.LENGTH_SHORT).show();
        }
        else if(n.istrian()){
            Toast.makeText(this,"it is triangular",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"it is not anything",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
