/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manue_000
 */
public class ObservadorTest {
    
    public ObservadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Observador method, of class Observador.
     */
    @Test
    public void testObservador_0args() {
        System.out.println("Observador");
        Observador instance = new Observador();
        instance.Observador();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Observador method, of class Observador.
     */
    @Test
    public void testObservador_3args() {
        System.out.println("Observador");
        Integer idObservador = null;
        String tipoObser = "";
        String nacionalidad = "";
        Observador instance = new Observador();
        instance.Observador(idObservador, tipoObser, nacionalidad);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdObservador method, of class Observador.
     */
    @Test
    public void testGetIdObservador() {
        System.out.println("getIdObservador");
        Observador instance = new Observador();
        Integer expResult = null;
        Integer result = instance.getIdObservador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdObservador method, of class Observador.
     */
    @Test
    public void testSetIdObservador() {
        System.out.println("setIdObservador");
        Integer idObservador = null;
        Observador instance = new Observador();
        instance.setIdObservador(idObservador);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTipoObser method, of class Observador.
     */
    @Test
    public void testGetTipoObser() {
        System.out.println("getTipoObser");
        Observador instance = new Observador();
        String expResult = null;
        String result = instance.getTipoObser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTipoObser method, of class Observador.
     */
    @Test
    public void testSetTipoObser() {
        System.out.println("setTipoObser");
        String tipoObser = "";
        Observador instance = new Observador();
        instance.setTipoObser(tipoObser);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNacionalidad method, of class Observador.
     */
    @Test
    public void testGetNacionalidad() {
        System.out.println("getNacionalidad");
        Observador instance = new Observador();
        String expResult =null;
        String result = instance.getNacionalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNacionalidad method, of class Observador.
     */
    @Test
    public void testSetNacionalidad() {
        System.out.println("setNacionalidad");
        String nacionalidad = "";
        Observador instance = new Observador();
        instance.setNacionalidad(nacionalidad);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of reportarAnomalias method, of class Observador.
     */
    @Test
    public void testReportarAnomalias() {
        System.out.println("reportarAnomalias");
        Observador instance = new Observador();
        instance.reportarAnomalias();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticasNacionales method, of class Observador.
     */
    @Test
    public void testMostrarEstadisticasNacionales() {
        System.out.println("mostrarEstadisticasNacionales");
        Observador instance = new Observador();
        instance.mostrarEstadisticasNacionales();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
