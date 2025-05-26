package com.practicasentorno;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    private ArrayList<Concesionario> coches = new ArrayList<>();
    private Scanner sc = new Scanner(System.in); // Instancia única de Scanner

    public static void main(String[] args) {
        new Catalogo().principal();
    }

    public int pideOpcion() {
        System.out.print(
                "----------------------------\nOpciones: \n1. Añadir coche \n2. Ver lista de coches\n3. Coches VIP \n4. Salir \nSeleccione una opción: \n----------------------------\n");
        return sc.nextInt(); // Usar la instancia única
    }

    public void añadirVehiculo() {
        System.out.print("Introduce el precio del coche: ");
        int precio = sc.nextInt();
        System.out.print("Introduce el IVA del coche: ");
        int iva = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Introduce el modelo del coche: ");
        String modelo = sc.nextLine(); // Cambiar a nextLine para leer cadenas completas
        System.out.println("Vehículo añadido correctamente.");

        Concesionario coche = new Concesionario(precio, iva, modelo);

        coches.add(coche);
    }

    public void mostrarVehiculos() {
        System.out.println("Lista de coches:");
        for (Concesionario coche : coches) {
            coche.mostrarInformacion();
        }

    }

    public void principal() {
        boolean exit = false;

        while (!exit) {

            switch (pideOpcion()) {
                case 1:
                    añadirVehiculo();
                    break;
                case 2:
                    mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("Mostrando coches VIP:");
                    Concesionario.stockBase(); // Llamada directa al método estático
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }

}