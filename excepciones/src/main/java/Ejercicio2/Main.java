package Ejercicio2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Vendedor> vendedores = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Ingrese el código del vendedor : ");
                    int codigo = Integer.parseInt(scanner.nextLine());

                    
                    if (existeCodigo(vendedores, codigo)) {
                        throw new ElementoDuplicadoException();
                    }

                        
                    vendedores.add(new Vendedor(codigo));
                    System.out.println("Vendedor añadido .");
                  

                } catch (NumberFormatException e) {
                    System.out.println("Error: solo se pueden ingresar numeros como codigo." + "Intente de nuevo");
                } catch (ElementoDuplicadoException e) {
                    System.out.println("Error: no se puede añadir vendedores duplicados.");
                }
                
            }
        }
    }

    
    private static boolean existeCodigo(List<Vendedor> vendedores, int codigo) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
       
    
    }

}




