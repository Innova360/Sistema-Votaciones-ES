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
public class DiputadoTest {
    
    public DiputadoTest() {
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
     * Test of Diputado method, of class Diputado.
     */
    @Test
    public void testDiputado_0args() {
        System.out.println("Diputado");
        Diputado instance = new Diputado();
        instance.Diputado();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Diputado method, of class Diputado.
     */
    @Test
    public void testDiputado_4args() {
        System.out.println("Diputado");
        Integer idDiputado = null;
        String nombreDiputado = "";
        String partido = "";
        String fotografia = "";
        Diputado instance = new Diputado();
        instance.Diputado(idDiputado, nombreDiputado, partido, fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdDiputado method, of class Diputado.
     */
    @Test
    public void testGetIdDiputado() {
        System.out.println("getIdDiputado");
        Diputado instance = new Diputado();
        Integer expResult = null;
        Integer result = instance.getIdDiputado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdDiputado method, of class Diputado.
     */
    @Test
    public void testSetIdDiputado() {
        System.out.println("setIdDiputado");
        Integer idDiputado = null;
        Diputado instance = new Diputado();
        instance.setIdDiputado(idDiputado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombreDiputado method, of class Diputado.
     */
    @Test
    public void testGetNombreDiputado() {
        System.out.println("getNombreDiputado");
        Diputado instance = new Diputado();
        String expResult = null;
        String result = instance.getNombreDiputado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreDiputado method, of class Diputado.
     */
    @Test
    public void testSetNombreDiputado() {
        System.out.println("setNombreDiputado");
        String nombreDiputado = "";
        Diputado instance = new Diputado();
        instance.setNombreDiputado(nombreDiputado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPartido method, of class Diputado.
     */
    @Test
    public void testGetPartido() {
        System.out.println("getPartido");
        Diputado instance = new Diputado();
        String expResult = null;
        String result = instance.getPartido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPartido method, of class Diputado.
     */
    @Test
    public void testSetPartido() {
        System.out.println("setPartido");
        String partido = "";
        Diputado instance = new Diputado();
        instance.setPartido(partido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFotografia method, of class Diputado.
     */
    @Test
    public void testGetFotografia() {
        System.out.println("getFotografia");
        Diputado instance = new Diputado();
        instance.getFotografia();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFotografia method, of class Diputado.
     */
    @Test
    public void testSetFotografia() {
        System.out.println("setFotografia");
        String fotografia = "";
        Diputado instance = new Diputado();
        instance.setFotografia(fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Diputado.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idDiputado = null;
        String nombre = "";
        Partido partido = null;
        String fotografia = "";
        Diputado instance = new Diputado();
        instance.modificar(idDiputado, nombre, partido, fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Diputado.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idDiputado = null;
        String nombre = "";
        Partido partido = null;
        String fotografia = "";
        Diputado instance = new Diputado();
        instance.agregar(idDiputado, nombre, partido, fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Diputado.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idDiputado = null;
        Diputado instance = new Diputado();
        instance.eliminar(idDiputado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class Diputado.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Diputado instance = new Diputado();
        Diputado expResult = null;
        Diputado result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
