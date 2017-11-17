package com.exspendite.a25961926.exspendite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    //set names for year drop down menu
    Calendar now = Calendar.getInstance();   // Gets the current date and time
    int year = now.get(Calendar.YEAR); // The current year
    int yearm1 = year - 1;
    int yearm2 = year - 2;
    String sYear = Integer.toString(year), sYearm1 = Integer.toString(yearm1), sYearm2 = Integer.toString(yearm2);
    String[] bankNames={sYear,sYearm1, sYearm2};
    //set names for month drop down menu
    String[] months={"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(this);

        Spinner spin2 = (Spinner) findViewById(R.id.monthSpinner);
        ArrayAdapter<String> bb = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, months);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(bb);
        spin2.setOnItemSelectedListener(this);

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> parent, View arg1, int position,long id) {
        //Setting the ArrayAdapter data on the Spinner
        Spinner spin = (Spinner)parent;
        Spinner spin2 = (Spinner)parent;

        if(spin.getId() == R.id.simpleSpinner) {
            Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
        }
        if(spin2.getId() == R.id.monthSpinner)
        {
            Toast.makeText(getApplicationContext(), months[position], Toast.LENGTH_LONG).show();
        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}