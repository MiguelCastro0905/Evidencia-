package Prueba;
import java.util.List;
import java.util.ArrayList;

public class IndexOutOfBoundException {
    
    
    public static void main(String[] args) {

        //toda variable o inicializacion de objeto 
        //debe ir antes del try
        List<String> listaNombres = List.of(
            "andrea",
            "juan",
            "Angel"

        );

        try{
            System.out.println(listaNombres.get(10));
        } catch (IndexOutOfBoundsException e){

            //no es solo la presentacion
            //adecuada del mensaje
            System.out.println("Que te pasa guey" + "a una posicion inexistente, pero te" + "ofrezco dato por defecto");
            System.out.println(listaNombres.get(0));

        }
        finally{
            System.out.println("Programa finalizado");
        }
        //crear lista de nombres


        //imprimir un elemento de la lista
       System.out.println(listaNombres.get(4)); 

    }
}
