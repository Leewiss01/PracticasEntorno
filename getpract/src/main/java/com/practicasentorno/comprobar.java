package com.practicasentorno;

import java.util.ArrayList;
import java.util.Scanner;

public class comprobar {
    public static void main(String[] args) {
        boolean exit = false;
        // Crear un objeto de la clase Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Pedir al usuario que ingrese un número
        System.out.print("Opciones: \n1. Añadir coche \n2. Ver lista de coches \nIngrese un número: ");
        // Leer el número ingresado por el usuario
        
        switch (sc.nextInt()) {
            // Usar el número ingresado como caso en el switch
            case 1:
                // añadir coche por teclado y alamacenarlo en un array, para mostrarlo
                // posteriormente en mostrar
                ArrayList<concesionario> coches = new ArrayList<>();
                System.out.println("Introduce el modelo del coche:");
                sc.nextLine(); // Consumir el salto de línea pendiente
                String modelo = sc.nextLine();

                System.out.println("Introduce el precio del coche:");
                int precio = sc.nextInt();

                System.out.println("Introduce el IVA del coche:");
                int iva = sc.nextInt();

                concesionario coche = new concesionario(precio, iva, modelo);
                coches.add(coche);

                System.out.println("Coche añadido correctamente.");
                break;

            case 2:
                System.out.println("Coches en stock:");
                concesionario auto = new concesionario(20000, 21, "Audi");

                // Mostrar la información del coche
                auto.mostrarInformacion();
                break;

            case 3:
            System.out.println("Saliendo del programa...");
             exit=true;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}

/*
 * // Crear un objeto de la clase concesionario
 * concesionario coche = new concesionario(20000, 21, "Audi");
 * 
 * // Mostrar la información del coche
 * coche.mostrarInformacion();
 */