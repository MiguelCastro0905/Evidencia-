package Prueba;

public class ArithmeticExceptiontest {
    public static void main(String[] args) { 
        

        int divisor = 0;
        int dividendo = 8;
        int resultado = 15;

        try {
            //dividir por 0
            //flujo principal del caso de uso
            resultado = dividendo / divisor;   
            System.out.println(resultado);

        } catch (Exception e) {
            //flujo aterno
  
            // TODO: handle exception
            System.out.println( "division entre cero");
        } finally { 
           System.out.println("Gracias por utlizar el programa");
        }



        //imprimiremos resultado
        
    }
}
