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
public class ReporteTest {
    
    public ReporteTest() {
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
     * Test of Reporte method, of class Reporte.
     */
    @Test
    public void testReporte_0args() {
        System.out.println("Reporte");
        Reporte instance = new Reporte();
        instance.Reporte();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Reporte method, of class Reporte.
     */
    @Test
    public void testReporte_Integer_String() {
        System.out.println("Reporte");
        Integer idReporte = null;
        String hora = "";
        Reporte instance = new Reporte();
        instance.Reporte(idReporte, hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imprimir method, of class Reporte.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Reporte instance = new Reporte();
        Reporte expResult = null;
        Reporte result = instance.imprimir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdReporte method, of class Reporte.
     */
    @Test
    public void testGetIdReporte() {
        System.out.println("getIdReporte");
        Reporte instance = new Reporte();
        Integer expResult = null;
        Integer result = instance.getIdReporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdReporte method, of class Reporte.
     */
    @Test
    public void testSetIdReporte() {
        System.out.println("setIdReporte");
        Integer idReporte = null;
        Reporte instance = new Reporte();
        instance.setIdReporte(idReporte);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHora method, of class Reporte.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Reporte instance = new Reporte();
        String expResult = null;
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setHora method, of class Reporte.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Reporte instance = new Reporte();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Reporte.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idReporte = null;
        String hora = "";
        Reporte instance = new Reporte();
        instance.agregar(idReporte, hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Reporte.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idReporte = null;
        String hora = "";
        Reporte instance = new Reporte();
        instance.modificar(idReporte, hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Reporte.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idReporte = null;
        Reporte instance = new Reporte();
        instance.eliminar(idReporte);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
