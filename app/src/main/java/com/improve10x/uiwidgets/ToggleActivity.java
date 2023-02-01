package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        handleStatus();
    }

    private void handleStatus() {
        ToggleButton toggleoneBtn = findViewById(R.id.toogleone_btn);
        ToggleButton toggletwoBtn = findViewById(R.id.toogletwo_btn);
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            String toggle1Status = toggleoneBtn.getText().toString();
            String toggle2Status = toggletwoBtn.getText().toString();
            String result = getStatus(toggle1Status,toggle2Status);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    public String getStatus(String toggle1Status, String toggle2Status){
        StringBuilder result = new StringBuilder();
        result.append("ToggleButton1 : ");
        result.append(toggle1Status);
        result.append("\nToggleButton2 : ").append(toggle2Status);
        return String.valueOf(result);
    }
}