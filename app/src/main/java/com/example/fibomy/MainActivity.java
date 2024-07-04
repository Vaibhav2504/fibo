package com.example.fibomy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button submit;
    TextView view;
    TextView enp;
    TextView name;
    EditText nvalue;
    String fib = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        view = findViewById(R.id.view);
        enp = findViewById(R.id.enp);
        name = findViewById(R.id.name);
        nvalue = findViewById(R.id.nvalue);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fib = "";
                String n = nvalue.getText().toString();
                int num = Integer.parseInt(n);
                loop(num);
            }
        });
    }
    void loop(int n){
        for(int i = 0; i <= n; i++){
            long b = fibo(i);
            fib = fib + b + " ";
        }
        view.setText(fib);
    }
    public long fibo (int n){
        if (n <= 1)
            return n;
        long a = 0, b = 1;
        long sum = 0;
        for(int i = 2; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}