package com.example.babascala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result_txt;
    ImageButton back;
    double first , second;
    String f ,s ,op ,temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = findViewById(R.id.btn_back);
        result_txt = findViewById(R.id.result_txt);
    }

    public void defaultC(View view) {
        result_txt.setText("");
    }

    public void op(View view) {
        f = result_txt.getText().toString();
        if (f.length()<=0){
            Toast.makeText(getApplicationContext(),"دخل رقم الاول ياعم",Toast.LENGTH_SHORT).show();
        }else{
            first = Double.parseDouble(f);
            result_txt.setText("");
            op = ((Button)view).getText().toString();
        }
    }

    public void back(View view) {
    }

    public void equal(View view) {
        s = result_txt.getText().toString();
        if (s.length()<=0){
            Toast.makeText(MainActivity.this,"Enter a number : ",Toast.LENGTH_SHORT).show();
        }else{
            second = Double.parseDouble(s);
            switch (op){

                case "+":
                    result_txt.setText(first+second+"");
                    break;
                case "-":
                    result_txt.setText(first-second+"");
                    break;
                case "*":
                    result_txt.setText(first*second+"");
                    break;
                case "/":
                    result_txt.setText(first/second+"");
                    break;
            }
        }

    }

    public void Button(View view) {
        result_txt.append(((Button)view).getText().toString());
    }
}
