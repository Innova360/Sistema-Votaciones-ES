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
public class MunicipioTest {
    
    public MunicipioTest() {
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
     * Test of Municipio method, of class Municipio.
     */
    @Test
    public void testMunicipio_0args() {
        System.out.println("Municipio");
        Municipio instance = new Municipio();
        instance.Municipio();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Municipio method, of class Municipio.
     */
    @Test
    public void testMunicipio_3args() {
        System.out.println("Municipio");
        Integer idMuni = null;
        String nombreMuni = "";
        String nombreDepto = "";
        Municipio instance = new Municipio();
        instance.Municipio(idMuni, nombreMuni, nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdMuni method, of class Municipio.
     */
    @Test
    public void testGetIdMuni() {
        System.out.println("getIdMuni");
        Municipio instance = new Municipio();
        Integer expResult = null;
        Integer result = instance.getIdMuni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombreMuni method, of class Municipio.
     */
    @Test
    public void testGetNombreMuni() {
        System.out.println("getNombreMuni");
        Municipio instance = new Municipio();
        String expResult = null;
        String result = instance.getNombreMuni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreMuni method, of class Municipio.
     */
    @Test
    public void testSetNombreMuni() {
        System.out.println("setNombreMuni");
        String nombreMuni = "";
        Municipio instance = new Municipio();
        instance.setNombreMuni(nombreMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombreDepto method, of class Municipio.
     */
    @Test
    public void testGetNombreDepto() {
        System.out.println("getNombreDepto");
        Municipio instance = new Municipio();
        String expResult = null;
        String result = instance.getNombreDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreDepto method, of class Municipio.
     */
    @Test
    public void testSetNombreDepto() {
        System.out.println("setNombreDepto");
        String nombreDepto = "";
        Municipio instance = new Municipio();
        instance.setNombreDepto(nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdMuni method, of class Municipio.
     */
    @Test
    public void testSetIdMuni() {
        System.out.println("setIdMuni");
        Integer idMuni = null;
        Municipio instance = new Municipio();
        instance.setIdMuni(idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
