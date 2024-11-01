package com.example.calculator1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    private EditText ed2;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnclr;
    private EditText ed3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnclr=(Button)findViewById(R.id.btnclr);
        ed3=(EditText)findViewById(R.id.ed3);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ed1.getText().length()>0)&&(ed2.getText().length()>0)){
                    double op1=Double.parseDouble(ed1.getText().toString());
                    double op2=Double.parseDouble(ed2.getText().toString());
                    double result=op1+op2;
                    ed3.setText(Double.toString(result));
                }
                else {
                    Toast toast=Toast.makeText(MainActivity.this,"Enter the Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ed1.getText().length()>0)&&(ed2.getText().length()>0)){
                    double op1=Double.parseDouble(ed1.getText().toString());
                    double op2=Double.parseDouble(ed2.getText().toString());
                    double result=op1-op2;
                    ed3.setText(Double.toString(result));
                }
                else {
                    Toast toast=Toast.makeText(MainActivity.this,"Enter the Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ed1.getText().length()>0)&&(ed2.getText().length()>0)){
                    double op1=Double.parseDouble(ed1.getText().toString());
                    double op2=Double.parseDouble(ed2.getText().toString());
                    double result=op1*op2;
                    ed3.setText(Double.toString(result));
                }
                else {
                    Toast toast=Toast.makeText(MainActivity.this,"Enter the Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ed1.getText().length()>0)&&(ed2.getText().length()>0)){
                    double op1=Double.parseDouble(ed1.getText().toString());
                    double op2=Double.parseDouble(ed2.getText().toString());
                    double result=op1/op2;
                    ed3.setText(Double.toString(result));
                }
                else {
                    Toast toast=Toast.makeText(MainActivity.this,"Enter the Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("0.00");
                ed1.requestFocus();
                }

        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
