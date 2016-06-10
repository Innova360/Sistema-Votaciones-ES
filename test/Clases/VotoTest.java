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
public class VotoTest {
    
    public VotoTest() {
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
     * Test of Voto method, of class Voto.
     */
    @Test
    public void testVoto_0args() {
        System.out.println("Voto");
        Voto instance = new Voto();
        instance.Voto();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Voto method, of class Voto.
     */
    @Test
    public void testVoto_4args() {
        System.out.println("Voto");
        String codigo = "";
        Integer numUrna = null;
        Integer numMunicipio = null;
        Integer numDepto = null;
        Voto instance = new Voto();
        instance.Voto(codigo, numUrna, numMunicipio, numDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCodigo method, of class Voto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Voto instance = new Voto();
        String expResult = null;
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCodigo method, of class Voto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Voto instance = new Voto();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumUrna method, of class Voto.
     */
    @Test
    public void testGetNumUrna() {
        System.out.println("getNumUrna");
        Voto instance = new Voto();
        Integer expResult = null;
        Integer result = instance.getNumUrna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumUrna method, of class Voto.
     */
    @Test
    public void testSetNumUrna() {
        System.out.println("setNumUrna");
        Integer numUrna = null;
        Voto instance = new Voto();
        instance.setNumUrna(numUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumMunicipio method, of class Voto.
     */
    @Test
    public void testGetNumMunicipio() {
        System.out.println("getNumMunicipio");
        Voto instance = new Voto();
        Integer expResult = null;
        Integer result = instance.getNumMunicipio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumMunicipio method, of class Voto.
     */
    @Test
    public void testSetNumMunicipio() {
        System.out.println("setNumMunicipio");
        Integer numMunicipio = null;
        Voto instance = new Voto();
        instance.setNumMunicipio(numMunicipio);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumDepto method, of class Voto.
     */
    @Test
    public void testGetNumDepto() {
        System.out.println("getNumDepto");
        Voto instance = new Voto();
        Integer expResult = null;
        Integer result = instance.getNumDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumDepto method, of class Voto.
     */
    @Test
    public void testSetNumDepto() {
        System.out.println("setNumDepto");
        Integer numDepto = null;
        Voto instance = new Voto();
        instance.setNumDepto(numDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contarVotos method, of class Voto.
     */
    @Test
    public void testContarVotos() {
        System.out.println("contarVotos");
        Voto instance = new Voto();
        Integer expResult = null;
        Integer result = instance.contarVotos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
