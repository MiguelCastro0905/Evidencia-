package com.excepciones.java.potencia;

public class NegativoException extends Exception {


    String mensaje;

    public NegativoException(String menssage , String mensaje) {
        super(menssage);
        this.mensaje = mensaje;
    }


    

}
