package com.sheba.textwatcherexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etOne, etTwo;
    Button textWatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    etOne = findViewById(R.id.etOne);
    etTwo = findViewById(R.id.etTwo);
    textWatch = findViewById(R.id.textWatch);

    etOne.addTextChangedListener(loginTextWatcher);
    etTwo.addTextChangedListener(loginTextWatcher);
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String userName = etOne.getText().toString().trim();
            String password = etTwo.getText().toString().trim();

            // Condition to disable button
            textWatch.setEnabled(!userName.isEmpty() && !password.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
