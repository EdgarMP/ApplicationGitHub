package com.edgarmarcopolo.applicationgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nuevoMetodo(){
        String mensaje = "Este es un nuevo método";
    }

    public void metodoErrorEnProd(){
        String mensaje = "Se creo este método para simular un error en producción";
    }

    public boolean metodoBoolean(){
        boolean estaEsUnaVariableBoolean = true;
        return estaEsUnaVariableBoolean;
    }

    public void leContinuoMoviendoleAlFeature(){
        String mensaje = "Le sigo moviendo al feature";
    }
}
