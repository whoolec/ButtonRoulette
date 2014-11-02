package com.example.whoolec.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MyActivity extends Activity {

    private static final String EXTRA_MESSAGE = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/



    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        double x = Math.random();
        if(x > 0.75) {
            Lose(view);
        }
        else startActivity(intent);
    }

    public void Lose(View view) {
        Intent intent1 = new Intent(this, LooseScreen.class);

        startActivity(intent1);
    }
}
