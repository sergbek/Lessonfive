package com.example.sergbek.lessonfive;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CompoundButton;


public class MainActivity extends ActionBarActivity implements CompoundButton.OnCheckedChangeListener  {


//    private  ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
//        toggleButton.setOnCheckedChangeListener(this);


    }

    private float pxFromDp(float dp) {
        return dp * getApplicationContext().getResources().getDisplayMetrics().density;

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        if(isChecked)
//            toggleButton.setPadding((int) pxFromDp(70),0,0,0);
//        else
//            toggleButton.setPadding(0,0, (int) pxFromDp(70),0);

    }


}
