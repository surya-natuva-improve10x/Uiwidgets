package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatepickerActivity extends AppCompatActivity {
    DatePicker dateDp;
    TextView currentDateTxt;
    Button changeTheDateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);
        dateDp = findViewById(R.id.date_dp);
        currentDateTxt = findViewById(R.id.currentdate_txt);
        changeTheDateBtn = findViewById(R.id.changethedate_btn);
        showCurrentDate();
        handleChangeDateBtn();
    }
    private void showCurrentDate() {
        String selectedDate = getSelectedDate();
        currentDateTxt.setText("Current Date : " + selectedDate);
    }

    public void handleChangeDateBtn() {
        changeTheDateBtn.setOnClickListener(v -> {
            String selectedDate = getSelectedDate();
            currentDateTxt.setText("Changed Date: " + selectedDate);
        });
    }

    public String getSelectedDate() {
        int day = dateDp.getDayOfMonth();
        int month = dateDp.getMonth() + 1;
        int year = dateDp.getYear();
        String selectedDate = createDate(day, month, year);
        return selectedDate;
    }

    public String createDate(int date, int month, int year) {
        return date + "/" + month + "/" + year;
    }
}




