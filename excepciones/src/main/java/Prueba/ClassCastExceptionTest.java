package Prueba;
import lombok.ToString;

@ToString

class Animal{
    private String especie;

    public Animal(String especie){
        this.especie = especie;
    }
}
@ToString
class Perro extends Animal{

    String nombre;

    public Perro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    
}

public class ClassCastExceptionTest {
    public static void main(String[] args) {
        //crear dos objetos animal:
        Animal i = new Animal("Rinoceronte");
        try {
            Perro j = (Perro) i;
            System.out.println(j);
        }catch (ClassCastException e) {
            System.out.println("Error de tipos de dato: " + e.getMessage());
        }


        
    }
    
}



