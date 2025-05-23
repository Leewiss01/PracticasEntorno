package com.practicasentorno;

public class concesionario {
    private int precio;
    private int iva;
    private String modelo;

    public concesionario(int precio, int iva, String modelo) {
        this.modelo = modelo;
        this.iva = iva;
        this.precio = precio;
    }
    public int getPrecioIva() {
        iva = (int) (precio * 1.21);
        return iva;
    }
    public void mostrarInformacion(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + iva);  
        System.out.println("Precio con IVA: " + getPrecioIva());
    }
    public void StockBase(){
        System.out.println();
    }
}
