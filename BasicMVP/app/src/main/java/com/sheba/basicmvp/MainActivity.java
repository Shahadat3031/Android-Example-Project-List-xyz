package com.sheba.basicmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = "MainActivity";
    TextView textView, countNumberTV;
    Button countBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainContract.Presenter mainPresenter = new MainPresenter();
        print(mainPresenter.getMessage());
        countBtn = findViewById(R.id.btn_counter);

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = mainPresenter.getCounter();
                showCountNumber(a);
            }
        });
    }

    @Override
    public void print(String message) {
        textView = findViewById(R.id.textHello);
        textView.setText(message);
    }

    @Override
    public void showCountNumber(int countNum) {
        countNumberTV = findViewById(R.id.countNumber);
        countNumberTV.setText(String.valueOf(countNum));

        //Log.i(TAG, "showCountNumber: " + countNum);
        //Toast.makeText(this, "Clicked - " + countNum, Toast.LENGTH_SHORT).show();
    }


}
