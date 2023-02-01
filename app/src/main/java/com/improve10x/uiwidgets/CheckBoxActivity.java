package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        handleOrder();
    }
    private void handleOrder(){
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
            CheckBox checkboxBTn = findViewById(R.id.checkbox_btn);
            CheckBox checkboxtwoBtn = findViewById(R.id.checkboxtwo_btn);
            CheckBox checkboxthreeBtn = findViewById(R.id.checkboxthree_btn);
            boolean isPizzaChecked = checkboxBTn.isChecked();
            boolean isCoffeChecked = checkboxtwoBtn.isChecked();
            boolean isBurgerChecked = checkboxthreeBtn.isChecked();
            String orderDetails = placeorder(isBurgerChecked,isCoffeChecked,isPizzaChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String placeorder(boolean isBurgerChecked, boolean isCoffeChecked, boolean isPizzaChecked) {
        int billamount = 0;
        String result = "Selected Items";
        if (isPizzaChecked) {
            billamount += 100;
            result += "\npizza Rs.100";
        }
        if (isCoffeChecked) {
            billamount += 50;
            result += "\ncoffe Rs.50";
        }
        if (isBurgerChecked) {
            billamount += 120;
            result += "\nburger Rs.120";
        }
        result += "\nTotal : " + billamount;
        return result;
    }
}
/*



        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
        int totalamount=0;
        StringBuilder result=new StringBuilder();
        result.append("Selected Items:");
        if(checkboxBTn.isChecked()){
        result.append("\tPizza 250Rs");
        totalamount+=100;
        }
        if(checkboxtwoBtn.isChecked()){
        result.append("\tCoffe 50Rs");
        totalamount+=50;
        }
        if(checkboxthreeBtn.isChecked()){
        result.append("\tBurger 180Rs");
        totalamount+=120;
        }

        result.append("\nTotal: "+totalamount+"Rs");
        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
        });*/