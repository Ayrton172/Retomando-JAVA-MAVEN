package com.ejemplo.hola;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Bienvenidos a Java con Maven");
        System.out.println("-----------------------------------");
        //Declaración de variables
        String nombre = "Ayrton";
        int edad = 24;
        double altura = 1.73;
        boolean estudiante = true;
        char genero = 'H';
        //Salida por consola
        System.out.println("Hola " + nombre + ", tu edad es " + edad + " y tu altura es " + altura + " metros.");
        if (estudiante) {
            System.out.println("Eres estudiante");
        } else {
            System.out.println("No eres estudiante");
        }
        if (genero == 'M') {
            System.out.println("Eres mujer");
        } else {
            System.out.println("Eres hombre");
        }
        //Leer datos del usuario con Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edadUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tu usuario es " + nombreUsuario + " y tienes " + edadUsuario + " años.");
        // Cerrar el Scanner para evitar fuga de recursos
        scanner.close();
        // Crear y usar una Persona de ejemplo
        Persona persona1 = new Persona("Noah", 5, 1.50, false, 'H');
        persona1.saludar();
        System.out.println("el método to string es: ");
        System.out.println(persona1);
    }

}