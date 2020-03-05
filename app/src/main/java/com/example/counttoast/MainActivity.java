package com.example.counttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        count++;
        if(countView != null){
           countView.setText(Integer.toString(count));
        }
    }

    public void showToast(View view) {
        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();

    }
}
