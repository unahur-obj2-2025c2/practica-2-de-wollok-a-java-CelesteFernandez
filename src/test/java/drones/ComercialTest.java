package drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import misiones.Transporte;

public class ComercialTest {


    Dron dronC1 = new Comercial(60, 100,  Transporte.getInstance());
   
    @Test
    void testEficienciaOperativa() {
        assertEquals(60*10+15+100, dronC1.eficienciaOperativa());
    }

    @Test
    void testEsAvanzadoSegunTipo() {
        assertFalse(dronC1.esAvanzadoSegunTipo());
    }
}
