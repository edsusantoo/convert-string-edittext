package com.edsusantoo.bismillah.inputformater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtInputYourText = findViewById(R.id.edt_input_your_text);
        edtInputYourText.addTextChangedListener(new StrTextWatcher(edtInputYourText));
    }

}
