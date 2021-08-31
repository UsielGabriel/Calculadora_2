package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
//import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText operacion;
    private Button boton0;
    private Button boton1;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;
    private Button boton2;
    private Button botonsumar;
    private Button botonrestar;
    private Button botonmultiplicar;
    private Button botondividir;
    private Button botonigual;
    private Button botonborrar;
    private Button botonpunto;
    private Button botonC;

    private boolean clickSignoMas;
    private boolean clickSignoMenos;
    private boolean clickSignoMultiplicar;
    private boolean clickSignoDividir;
    private boolean clickPunto;


    private ExpresionRegular expresionRegular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expresionRegular=new ExpresionRegular();

        ConstraintLayout constraintLayout=findViewById(R.id.fondoanimado);
        AnimationDrawable animationDrawable =(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        operacion=findViewById(R.id.txtoperacion);
        operacion.setFocusable(true);
        operacion.setFocusableInTouchMode(true);
        operacion.setInputType(InputType.TYPE_NULL);

        boton0=findViewById(R.id.btn0);
        boton0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"0");
                accionesAdicionales(R.id.btn0);
            }
        });

        boton1=findViewById(R.id.btn1);
        boton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"1");
                accionesAdicionales(R.id.btn1);
            }
        });

        boton2=findViewById(R.id.btn2);
        boton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"2");
                accionesAdicionales(R.id.btn2);
            }
        });

        boton3=findViewById(R.id.btn3);
        boton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"3");
                accionesAdicionales(R.id.btn3);
            }
        });

        boton4=findViewById(R.id.btn4);
        boton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"4");
                accionesAdicionales(R.id.btn4);
            }
        });

        boton5=findViewById(R.id.btn5);
        boton5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"5");
                accionesAdicionales(R.id.btn5);
            }
        });

        boton6=findViewById(R.id.btn6);
        boton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"6");
                accionesAdicionales(R.id.btn6);
            }
        });

        boton7=findViewById(R.id.btn7);
        boton7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"7");
                accionesAdicionales(R.id.btn7);
            }
        });

        boton8=findViewById(R.id.btn8);
        boton8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"8");
                accionesAdicionales(R.id.btn8);
            }
        });

        boton9=findViewById(R.id.btn9);
        boton9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                operacion.setText(textoAnterior+"9");
                accionesAdicionales(R.id.btn9);
            }
        });

        botonsumar=findViewById(R.id.btnsum);
        botonsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAnterior = operacion.getText().toString();
                //este if es para que no pueda escribir como primera cosa aun signo en este cas el mas
                if(textoAnterior.trim().length()>0 && clickSignoMas == false){
                    if(textoAnterior.endsWith("*")||textoAnterior.endsWith("/")||textoAnterior.endsWith("-")){
                        textoAnterior=textoAnterior.substring(0,textoAnterior.length()-1);
                        operacion.setText(textoAnterior);
                    }
                    operacion.setText(textoAnterior+"+");
                    clickSignoMas=true;
                    accionesAdicionales(R.id.btnsum);
                }
            }
        });

        botonrestar=findViewById(R.id.btnmen);
        botonrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAnterior = operacion.getText().toString();
                //este if es para que no pueda escribir como primera cosa aun signo en este cas el menos
                if(clickSignoMenos == false){
                    if(textoAnterior.endsWith("*")||textoAnterior.endsWith("/")||textoAnterior.endsWith("+")){
                        textoAnterior=textoAnterior.substring(0,textoAnterior.length()-1);
                        operacion.setText(textoAnterior);
                    }
                    operacion.setText(textoAnterior+"-");
                    clickSignoMenos=true;
                    accionesAdicionales(R.id.btnmen);
                }
            }
        });

        botonmultiplicar = findViewById( R.id.btnmul );
        botonmultiplicar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = operacion.getText().toString();
                if( textAnterior.trim().length() > 0 && clickSignoMultiplicar == false){

                    if( textAnterior.endsWith("+") || textAnterior.endsWith("/") || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        operacion.setText( textAnterior );
                    }
                    operacion.setText(textAnterior + "*");
                    clickSignoMultiplicar = true;
                    accionesAdicionales( R.id.btnmul );
                }
            }
        });

        botondividir=findViewById(R.id.btndiv);
        botondividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAnterior = operacion.getText().toString();
                //este if es para que no pueda escribir como primera cosa aun signo en este cas el dividir
                if(textoAnterior.trim().length()>0 && clickSignoDividir == false){
                    if(textoAnterior.endsWith("*")||textoAnterior.endsWith("+")||textoAnterior.endsWith("-")){
                        textoAnterior=textoAnterior.substring(0,textoAnterior.length()-1);
                        operacion.setText(textoAnterior);
                    }
                    operacion.setText(textoAnterior+"/");
                    clickSignoDividir=true;
                    accionesAdicionales(R.id.btndiv);
                }
            }
        });

        botonborrar=findViewById(R.id.delete);
        botonborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAnterior = operacion.getText().toString();
                if(textoAnterior.length()>0){
                    //String nuevaOperacion(0,textoAnterior.length()-1);
                    String nuevaOperacion=textoAnterior.substring(0,textoAnterior.length()-1);
                    operacion.setText(nuevaOperacion);
                }

                accionesAdicionales(R.id.delete);

            }
        });

        botonC=findViewById(R.id.btnC);
        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion.setText("");
            }
        });

        botonpunto=findViewById(R.id.btnpunto);
        botonpunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String textoAnterior = operacion.getText().toString();
                if(clickPunto==false){
                    operacion.setText(textoAnterior+".");
                    clickPunto=true;
                    accionesAdicionales(R.id.btnpunto);
                }
            }
        });

        botonigual = findViewById( R.id.btnigual );
        botonigual.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = operacion.getText().toString();

                if( textAnterior.trim().length() > 0 ){
                    String resultado = expresionRegular.resolverFormula( textAnterior.trim() );
                    operacion.setText( resultado );
                }
            }
        });

    }
    private void accionesAdicionales(int idBotonActual){
        if(idBotonActual != R.id.btnsum){
            clickSignoMas=false;
        }
        if(idBotonActual != R.id.btnmen){
            clickSignoMenos=false;
        }
        if(idBotonActual != R.id.btnmul){
            clickSignoMultiplicar=false;
        }
        if(idBotonActual != R.id.btndiv){
            clickSignoDividir=false;
        }
        if(idBotonActual == R.id.btnsum
                || idBotonActual == R.id.btnmen
                || idBotonActual == R.id.btnmul
                || idBotonActual == R.id.btndiv){
            clickPunto=false;
        }
    }
}



































