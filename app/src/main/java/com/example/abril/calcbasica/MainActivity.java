package com.example.abril.calcbasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    Button suma;
    Button resta;
    Button division;
    Button negacion;
    Button multiplicacion;
    Button igual;
    EditText resultado;
    EditText numero;
    TextView operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cero = (Button)findViewById(R.id.cero);
        uno = (Button)findViewById(R.id.uno);
        dos = (Button)findViewById(R.id.dos);
        tres = (Button)findViewById(R.id.tres);
        cuatro = (Button)findViewById(R.id.cuatro);
        cinco = (Button)findViewById(R.id.cinco);
        seis = (Button)findViewById(R.id.seis);
        siete = (Button)findViewById(R.id.siete);
        ocho = (Button)findViewById(R.id.ocho);
        nueve = (Button)findViewById(R.id.nueve);
        igual= (Button)findViewById(R.id.igual);
        negacion = (Button)findViewById(R.id.negar);
        operador = (TextView) findViewById(R.id.textView4);
        suma = (Button)findViewById(R.id.suma);
        resta = (Button)findViewById(R.id.resta);
        division = (Button)findViewById(R.id.division);
        multiplicacion = (Button)findViewById(R.id.multiplicacion);
        resultado = (EditText)findViewById(R.id.editText6);
        numero = (EditText)findViewById(R.id.editText7);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.setText(numero.getText().toString() + "9");
            }
        });

        negacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().toString().equals("")) {
                    numero.setText("0");
                    return;
                }
                numero.setText("" + (-1 * Double.parseDouble(numero.getText().toString())));
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador.setText("+");
                operacion();

                numero.setText("");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion();
                operador.setText("-");
                numero.setText("");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion();
                operador.setText("*");
                numero.setText("");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion();
                operador.setText("/");
                numero.setText("");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion();
                operador.setText("=");
                numero.setText("0");
            }
        });
    }
private void operacion(){
        if(numero.getText().toString().equals("")){
        numero.setText("0"); }
        if(operador.getText().toString().equals("+")){
        String a = resultado.getText().toString();
        String b = numero.getText().toString();
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        resultado.setText((c+d)+"");
        return;
        }
        if(operador.getText().toString().equals("=")){
        String b = numero.getText().toString();
        double c = 0;
        double d = Double.parseDouble(b);
        resultado.setText((c+d)+"");
        return;
        }
        if(operador.getText().toString().equals("-")){
        String a = resultado.getText().toString();
        String b = numero.getText().toString();
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        resultado.setText((c-d)+"");
        return;
        }
        if(operador.getText().toString().equals("*")){
        String a = resultado.getText().toString();
        String b = numero.getText().toString();
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        resultado.setText((c*d)+""); return;
        }
        if(operador.getText().toString().equals("/")){
        String a = resultado.getText().toString();
        String b = numero.getText().toString();
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        if(d==0){
        return;
        }
        resultado.setText((c/d)+"");
        return;
        }
}
}