package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
    TimePicker timeTp;
    TextView currentTxt;
    Button changeBTn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timeTp = findViewById(R.id.time_tp);
        currentTxt = findViewById(R.id.current_txt);
        changeBTn = findViewById(R.id.change_btn);
        displayCurrentTime();
        handleChangeTimeButton();
    }

    private void handleChangeTimeButton() {
        changeBTn.setOnClickListener(v -> {
            String selectedTime = getSelectedTime();
            currentTxt.setText("changedTime:" + selectedTime);
        });
    }

    private void displayCurrentTime() {
        String selectedTime = getSelectedTime();
        currentTxt.setText("currentTime : " + selectedTime);
    }
    public String getSelectedTime(){
        int minute = timeTp.getCurrentMinute();
        int hour = timeTp.getCurrentHour();
        String selectedTime = createTime(minute,hour);
        return selectedTime;
    }

    private String createTime(int minute, int hour) {
        return hour + ":" + minute;
    }
}