package com.tecmm.tequila.styletextcheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    CheckBox chkNegrita, chkCursiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.txtInter);
        chkNegrita = (CheckBox) findViewById(R.id.chkNegrita);
        chkCursiva = (CheckBox) findViewById(R.id.chkCursiva);

        chkCursiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!chkCursiva.isChecked()){
                    if (chkNegrita.isChecked()){
                        texto.setTypeface(null, Typeface.BOLD);
                    }
                    else{
                        texto.setTypeface(null, Typeface.NORMAL);
                    }
                }
                else if(chkNegrita.isChecked()){
                    texto.setTypeface(null,Typeface.BOLD_ITALIC);
                }
                else if (chkCursiva.isChecked()){
                    texto.setTypeface(null, Typeface.ITALIC);
                }

            }
        });

        chkNegrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!chkNegrita.isChecked()){
                    if (chkCursiva.isChecked()){
                        texto.setTypeface(null, Typeface.ITALIC);
                    }
                    else{
                        texto.setTypeface(null, Typeface.NORMAL);
                    }
                }
                else if(chkCursiva.isChecked()){
                    texto.setTypeface(null,Typeface.BOLD_ITALIC);
                }
                else if (chkNegrita.isChecked()){
                    texto.setTypeface(null, Typeface.BOLD);
                }
            }
        });
    }
}
