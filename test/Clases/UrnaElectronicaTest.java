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
public class UrnaElectronicaTest {
    
    public UrnaElectronicaTest() {
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
     * Test of UrnaElectronica method, of class UrnaElectronica.
     */
    @Test
    public void testUrnaElectronica_0args() {
        System.out.println("UrnaElectronica");
        UrnaElectronica instance = new UrnaElectronica();
        instance.UrnaElectronica();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of UrnaElectronica method, of class UrnaElectronica.
     */
    @Test
    public void testUrnaElectronica_3args() {
        System.out.println("UrnaElectronica");
        String idUrna = "";
        Integer idDepto = null;
        Integer idMuni = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.UrnaElectronica(idUrna, idDepto, idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdUrna method, of class UrnaElectronica.
     */
    @Test
    public void testGetIdUrna() {
        System.out.println("getIdUrna");
        UrnaElectronica instance = new UrnaElectronica();
        String expResult = null;
        String result = instance.getIdUrna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdUrna method, of class UrnaElectronica.
     */
    @Test
    public void testSetIdUrna() {
        System.out.println("setIdUrna");
        Integer idUrna = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.setIdUrna(idUrna);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdDepto method, of class UrnaElectronica.
     */
    @Test
    public void testGetIdDepto() {
        System.out.println("getIdDepto");
        UrnaElectronica instance = new UrnaElectronica();
        Integer expResult = null;
        Integer result = instance.getIdDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdDepto method, of class UrnaElectronica.
     */
    @Test
    public void testSetIdDepto() {
        System.out.println("setIdDepto");
        Integer idDepto = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.setIdDepto(idDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdMuni method, of class UrnaElectronica.
     */
    @Test
    public void testGetIdMuni() {
        System.out.println("getIdMuni");
        UrnaElectronica instance = new UrnaElectronica();
        Integer expResult = null;
        Integer result = instance.getIdMuni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdMuni method, of class UrnaElectronica.
     */
    @Test
    public void testSetIdMuni() {
        System.out.println("setIdMuni");
        Integer idMuni = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.setIdMuni(idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class UrnaElectronica.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idUrna = null;
        Integer idDepto = null;
        Integer idMuni = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.agregar(idUrna, idDepto, idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class UrnaElectronica.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idUrna = null;
        Integer idDepto = null;
        Integer idMuni = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.modificar(idUrna, idDepto, idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class UrnaElectronica.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idUrna = null;
        UrnaElectronica instance = new UrnaElectronica();
        instance.eliminar(idUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class UrnaElectronica.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Integer idUrna = null;
        UrnaElectronica instance = new UrnaElectronica();
        UrnaElectronica expResult = null;
        UrnaElectronica result = instance.mostrar(idUrna);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
