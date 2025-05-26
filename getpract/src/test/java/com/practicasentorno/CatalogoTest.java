package com.practicasentorno;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class CatalogoTest {
    @Test
    public void testPideOpcion() {
        String input= "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); 
        Catalogo catalogo = new Catalogo();
        int opcion = catalogo.pideOpcion();
 
        assertTrue(opcion >= 1 && opcion <= 3);
    }
    @Test
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Concesionario that = (Concesionario) obj;
        return modelo.equals(that.modelo);
    }
}
