package com.excepciones.java.potencia;

public class Potencia {

    public static void main(String[] args) {
        int n = -7;
        //crear un metodo para detectar si n es par o no

        try {
            par(n);
            negativo(n);
            int potencia = n * n;             
            System.out.println("La potencia es: " + potencia);

        }catch(ParException p){
            System.err.println(p.getMessage());
        }catch(NegativoException neg){
            System.out.println(neg.getMessage());

        }

    }



    private static void negativo(int n) throws NegativoException {
        if(n <= 0) {
            throw new NegativoException("numero invalido", " número Negativo");
        }
    }

    private static void par(int n) throws ParException{
        //controlar si el número ingresado como parametros es par o no

        if(n % 2 == 0){
            //Arroje la excepcion de Par
            throw new ParException("numero es par", "El número es par");

        }
       
        
    }
}
