package com.edsusantoo.bismillah.inputformater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtInputYourText;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInputYourText = findViewById(R.id.edt_input_your_text);
        tvResult  = findViewById(R.id.tv_result);

        edtInputYourText.addTextChangedListener(new StrTextWatcher(edtInputYourText));
    }

}
