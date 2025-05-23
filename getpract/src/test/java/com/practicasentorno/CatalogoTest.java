package com.practicasentorno;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatalogoTest {
    @Test
    public void testPideOpcion() {

        Catalogo catalogo = new Catalogo();
        int opcion = catalogo.pideOpcion();
 
        assertTrue(opcion >= 1 && opcion <= 3);
    }
}
