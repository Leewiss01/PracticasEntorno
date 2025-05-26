package com.practicasentorno;

public class Concesionario {
    private int precio;
    private int iva;
    private String modelo;

    public Concesionario(int precio, int iva, String modelo) {
        this.modelo = modelo;
        this.iva = iva;
        this.precio = precio;
    }

    public int getPrecioIva() {
        iva = (int) (precio * 1.21);
        return iva;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + iva);
        System.out.println("Precio con IVA: " + getPrecioIva());
    }

    public static void stockBase() { // Convertido en método estático
        System.out.println("Modelo: Ferrari");
        System.out.println("Precio: 450000");
        System.out.println("IVA: 21%");
        System.out.println("Precio con IVA: " + (450000 * 1.21));
        System.out.println("--------------------------");
        System.out.println("Modelo: Lamborghini");
        System.out.println("Precio: 500000");
        System.out.println("IVA: 21%");
        System.out.println("Precio con IVA: " + (500000 * 1.21));
        System.out.println("--------------------------");
        System.out.println("Modelo: Bugatti");
        System.out.println("Precio: 1000000");
        System.out.println("IVA: 21%");
        System.out.println("Precio con IVA: " + (1000000 * 1.21));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Concesionario that = (Concesionario) obj;
        return modelo.equals(that.modelo);
    }
}
