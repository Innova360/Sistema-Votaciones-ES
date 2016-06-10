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
public class PartidoTest {
    
    public PartidoTest() {
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
     * Test of Partido method, of class Partido.
     */
    @Test
    public void testPartido_0args() {
        System.out.println("Partido");
        Partido instance = new Partido();
        instance.Partido();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Partido method, of class Partido.
     */
    @Test
    public void testPartido_3args() {
        System.out.println("Partido");
        Integer idPartido = null;
        String nombrePartido = "";
        String bandera = "";
        Partido instance = new Partido();
        instance.Partido(idPartido, nombrePartido, bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdPartido method, of class Partido.
     */
    @Test
    public void testGetIdPartido() {
        System.out.println("getIdPartido");
        Partido instance = new Partido();
        Integer expResult = null;
        Integer result = instance.getIdPartido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdPartido method, of class Partido.
     */
    @Test
    public void testSetIdPartido() {
        System.out.println("setIdPartido");
        Integer idPartido = null;
        Partido instance = new Partido();
        instance.setIdPartido(idPartido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombrePartido method, of class Partido.
     */
    @Test
    public void testGetNombrePartido() {
        System.out.println("getNombrePartido");
        Partido instance = new Partido();
        String expResult = null;
        String result = instance.getNombrePartido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombrePartido method, of class Partido.
     */
    @Test
    public void testSetNombrePartido() {
        System.out.println("setNombrePartido");
        String nombrePartido = "";
        Partido instance = new Partido();
        instance.setNombrePartido(nombrePartido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBandera method, of class Partido.
     */
    @Test
    public void testGetBandera() {
        System.out.println("getBandera");
        Partido instance = new Partido();
        instance.getBandera();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBandera method, of class Partido.
     */
    @Test
    public void testSetBandera() {
        System.out.println("setBandera");
        String bandera = "";
        Partido instance = new Partido();
        instance.setBandera(bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Partido.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idPartido = null;
        String nombre = "";
        String bandera = "";
        Partido instance = new Partido();
        instance.agregar(idPartido, nombre, bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Partido.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idPartido = null;
        String nombre = "";
        Integer bandera = null;
        Partido instance = new Partido();
        instance.modificar(idPartido, nombre, bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Partido.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idPartido = null;
        Partido instance = new Partido();
        instance.eliminar(idPartido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class Partido.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Partido instance = new Partido();
        Partido expResult = null;
        Partido result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
