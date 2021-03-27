package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGprComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGprComida = findViewById(R.id.rdGprComida);
        //Asignar el listener
        rdGprComida.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                //TOAST indicando cual RadioButton fue seleccionado
                RadioButton rdBtnSel;
                rdBtnSel = findViewById(i);
                Toast.makeText(getApplicationContext(), rdBtnSel.getText(),Toast.LENGTH_SHORT).show();
                }

        });
    }
}