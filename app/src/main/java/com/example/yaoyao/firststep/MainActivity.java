package com.example.yaoyao.firststep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertText(View view) {
        EditText editText = (EditText)findViewById(R.id.inputText);

        String upperStr = editText.getText().toString().toUpperCase();
        TextView upperTextView = (TextView)findViewById(R.id.upperView);
        upperTextView.setTextSize(25);
        upperTextView.setText(upperStr);

        String lowerStr = editText.getText().toString().toLowerCase();
        TextView lowerTextView = (TextView)findViewById(R.id.lowerView);
        lowerTextView.setTextSize(25);
        lowerTextView.setText(lowerStr);
    }
}
