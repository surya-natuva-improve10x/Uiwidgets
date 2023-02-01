package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);
        handleButton();
    }
    private void handleButton(){
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            EditText number1Txt = findViewById(R.id.number1_txt);
            EditText number2Txt = findViewById(R.id.number2_txt);
            String num1 = number1Txt.getText().toString();
            String num2 = number2Txt.getText().toString();
            String result = add(num1,num2);
            Toast.makeText(this,result , Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1+number2;
        return String.valueOf(sum);
    }


}

/* EditText editoneTxt = findViewById(R.id.editone_txt);
        EditText edittwoTxt = findViewById(R.id.edittwo_txt);
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
        String editone = editoneTxt.getText().toString();
        String edittwo = edittwoTxt.getText().toString();
        int num1 = Integer.parseInt(editone);
        int num2 = Integer.parseInt(edittwo);
        int sum = num1 + num2;
        Toast.makeText(this, "Sum" + sum, Toast.LENGTH_SHORT).show();
        });*/