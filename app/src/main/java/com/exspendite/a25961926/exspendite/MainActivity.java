package com.exspendite.a25961926.exspendite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void defineButtons()
    {
        findViewById(R.id.btnJan).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnFeb).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnMar).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnApr).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnMay).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnJune).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnJuly).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnAug).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnSept).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnOct).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnNov).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnDec).setOnClickListener(buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.btnJan:
                    Intent January = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(January);
                    break;
                case R.id.btnFeb:
                    Intent February = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(February);
                    break;
                case R.id.btnMar:
                    Intent March = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(March);
                    break;
                case R.id.btnApr:
                    Intent April = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(April);
                    break;
                case R.id.btnMay:
                    Intent May = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(May);
                    break;
                case R.id.btnJune:
                    Intent June = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(June);
                    break;
                case R.id.btnJuly:
                    Intent July = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(July);
                    break;
                case R.id.btnAug:
                    Intent August = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(August);
                    break;
                case R.id.btnSept:
                    Intent September = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(September);
                    break;
                case R.id.btnOct:
                    Intent October = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(October);
                    break;
                case R.id.btnNov:
                    Intent November = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(November);
                    break;
                case R.id.btnDec:
                    Intent December = new Intent(MainActivity.this, ViewReceipts.class);
                    startActivity(December);
                    break;
            }
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}