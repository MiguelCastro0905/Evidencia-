package Ejercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        ArrayList<Medico> listaMedicos = new ArrayList<>();
        listaMedicos.add(new Medico("Cristian Castro", "Odontologia"));
        listaMedicos.add(new Medico("Angel Garcia", "Optometria"));
        listaMedicos.add(new Medico("Felipe Romero", "Oncologia"));
        listaMedicos.add(new Medico("Daniel Higuera", "Urologia"));
        listaMedicos.add(new Medico("Monica Guitierrez", "Cardiologo"));
        listaMedicos.add(new Medico("Sara Pardo", "Ginecologia"));
        listaMedicos.add(new Medico("Alberto Rodriguez", "Pediatra"));
        listaMedicos.add(new Medico("Esteban Rodriguez", "Optometria"));

        Scanner scanner = new Scanner(System.in);

        while(true){
            try {
                System.out.print("Ingrese la posicion de la lista de medicos: ");
                int posicion = scanner.nextInt();
                if (posicion < 0 || posicion >= listaMedicos.size()) {
                    throw new IndexOutOfBoundsException("La posición ingresada está fuera de rango.");
                }

                Medico medico = listaMedicos.get(posicion);
                System.out.println("En la posición " + posicion + " se encuentra el médico:");
                System.out.println("Nombre: " + medico.getNombre());
                System.out.println("Especialidad: " + medico.getEspecialidad());

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); 
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: la posicion esta ufera de rango");
            }
        }

        scanner.close();
    }
}
