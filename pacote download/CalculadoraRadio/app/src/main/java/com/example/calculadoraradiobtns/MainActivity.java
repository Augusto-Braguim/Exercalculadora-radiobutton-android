package com.example.calculadoraradiobtns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcValores(View v){
        int opcoes = ((RadioGroup) findViewById(R.id.rdgOpcoes)).getCheckedRadioButtonId();
        float valor1 = Float.parseFloat(((EditText) findViewById(R.id.txtValor1)).getText().toString());
        float valor2 = Float.parseFloat(((EditText) findViewById(R.id.txtValor2)).getText().toString());

        if(opcoes == (R.id.rdSomar)){
            Toast.makeText(this,"Resultado é: "+ (valor1 + valor2),Toast.LENGTH_LONG).show();
        }else if(opcoes == (R.id.rdSub)) {
            Toast.makeText(this, "Resultado é: " + (valor1 - valor2), Toast.LENGTH_LONG).show();
        }else if(opcoes == (R.id.rdMulti)) {
            Toast.makeText(this, "Resultado é: " + (valor1 * valor2), Toast.LENGTH_LONG).show();
        }else if(opcoes == (R.id.rdDiv)) {
            Toast.makeText(this, "Resultado é: " + (valor1 / valor2), Toast.LENGTH_LONG).show();
        }
    }
}