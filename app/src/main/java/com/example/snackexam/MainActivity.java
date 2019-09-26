package com.example.snackexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.b1);
        textView=findViewById(R.id.t1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String mess="this is snackbar";
               int duration= Snackbar.LENGTH_SHORT;
               showSnackbar(textView,mess,duration);
            }

            private void showSnackbar(TextView textView, String mess, int duration) {
                Snackbar.make(textView,mess,duration).show();
            }
        });
    }
}
