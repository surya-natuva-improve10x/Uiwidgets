package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekbarActivity<handleShowSelected> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        handleShowSelected();
    }
   private void handleShowSelected(){
       SeekBar seekBar = findViewById(R.id.seekBar_bar);
       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               Toast.makeText(SeekbarActivity.this, "seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
               Toast.makeText(SeekbarActivity.this, "seekbar touch started!", Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
               Toast.makeText(SeekbarActivity.this, "seekbar touch stopped!", Toast.LENGTH_SHORT).show();

           }
       });
   }
}