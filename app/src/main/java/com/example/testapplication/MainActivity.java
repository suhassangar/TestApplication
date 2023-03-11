package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyMethod(View view) {

        TextView txt = (TextView) findViewById(R.id.hello);
        String str = (String) txt.getText();
        if(str != null && !str.trim().isEmpty())
        {
            //Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            Log.v("Check here------>",str);
        }

    }
}