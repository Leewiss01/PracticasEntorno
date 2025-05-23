package com.practicasentorno;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    private ArrayList<concesionario> coches = new ArrayList<>();

    public static void main(String[] args) {
        new Catalogo().principal();
    }

    public int pideOpcion() {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "----------------------------\nOpciones: \n1. Añadir coche \n2. Ver lista de coches \n3. Salir \nSeleccione una opción: \n----------------------------\n");
        return (sc.nextInt());
    }

    public void añadirVehiculo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del coche: ");
        int precio = sc.nextInt();
        System.out.print("Introduce el IVA del coche: ");
        int iva = sc.nextInt();
        System.out.print("Introduce el modelo del coche: ");
        String modelo = sc.next();

        concesionario coche = new concesionario(precio, iva, modelo);

        coches.add(coche);
    }

    public void mostrarVehiculos() {
        System.out.println("Lista de coches:");
        for (concesionario coche : coches) {
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
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }

}