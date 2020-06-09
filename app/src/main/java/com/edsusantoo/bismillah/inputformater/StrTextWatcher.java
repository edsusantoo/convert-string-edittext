package com.edsusantoo.bismillah.inputformater;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

//Pattern : 11.111.111.1-111.111
public class StrTextWatcher implements TextWatcher {
    private EditText editText;

    public StrTextWatcher(EditText edt) {
        this.editText = edt;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        StringBuilder result = new StringBuilder();
        String text = s.toString();
        result.append(text);

        if(result.length()==3){
            result.insert(2,".");
            if(start==3){
                result.delete(2,3);
            }
        }

        if(result.length()==7){
            result.insert(6,".");
            if(start==7){
                result.delete(6,7);
            }
        }
        if(result.length()==11){
            result.insert(10,".");
            if(start==11){
                result.delete(10,11);
            }
        }

        if(result.length()==13){
            result.insert(12,"-");
            if(start==13){
                result.delete(12,13);
            }
        }

        if(result.length()==17){
            result.insert(16,".");
            if(start==17){
                result.delete(16,17);
            }
        }

        Log.d("HALLLO","START"+start);
        Log.d("HALLLO","BEFORE"+before);

        editText.removeTextChangedListener(this);
        editText.setText(result.toString());
        editText.setSelection(editText.getText().toString().length());
        editText.addTextChangedListener(this);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
