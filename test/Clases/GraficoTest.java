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
public class GraficoTest {
    
    public GraficoTest() {
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
     * Test of Grafico method, of class Grafico.
     */
    @Test
    public void testGrafico_0args() {
        System.out.println("Grafico");
        Grafico instance = new Grafico();
        instance.Grafico();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Grafico method, of class Grafico.
     */
    @Test
    public void testGrafico_3args() {
        System.out.println("Grafico");
        Integer idGrafico = null;
        String descripcion = "";
        String hora = "";
        Grafico instance = new Grafico();
        instance.Grafico(idGrafico, descripcion, hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdGrafico method, of class Grafico.
     */
    @Test
    public void testGetIdGrafico() {
        System.out.println("getIdGrafico");
        Grafico instance = new Grafico();
        Integer expResult = null;
        Integer result = instance.getIdGrafico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdGrafico method, of class Grafico.
     */
    @Test
    public void testSetIdGrafico() {
        System.out.println("setIdGrafico");
        Integer idGrafico = null;
        Grafico instance = new Grafico();
        instance.setIdGrafico(idGrafico);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDescripcion method, of class Grafico.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Grafico instance = new Grafico();
        String expResult = null;
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDescripcion method, of class Grafico.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Grafico instance = new Grafico();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHora method, of class Grafico.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Grafico instance = new Grafico();
        String expResult = null;
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setHora method, of class Grafico.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Grafico instance = new Grafico();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crear method, of class Grafico.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Integer idGrafico = null;
        String descripcion = "";
        Grafico instance = new Grafico();
        instance.crear(idGrafico, descripcion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Grafico.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Grafico instance = new Grafico();
        instance.modificar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class Grafico.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Grafico instance = new Grafico();
        Grafico expResult = null;
        Grafico result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
