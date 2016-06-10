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
public class VotanteTest {
    
    public VotanteTest() {
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
     * Test of Votante method, of class Votante.
     */
    @Test
    public void testVotante_0args() {
        System.out.println("Votante");
        Votante instance = new Votante();
        instance.Votante();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Votante method, of class Votante.
     */
    @Test
    public void testVotante_4args() {
        System.out.println("Votante");
        String dui = "";
        String nit = "";
        String direccion = "";
        Integer codigo = null;
        Votante instance = new Votante();
        instance.Votante(dui, nit, direccion, codigo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDui method, of class Votante.
     */
    @Test
    public void testGetDui() {
        System.out.println("getDui");
        Votante instance = new Votante();
        String expResult = null;
        String result = instance.getDui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDui method, of class Votante.
     */
    @Test
    public void testSetDui() {
        System.out.println("setDui");
        String dui = "";
        Votante instance = new Votante();
        instance.setDui(dui);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNit method, of class Votante.
     */
    @Test
    public void testGetNit() {
        System.out.println("getNit");
        Votante instance = new Votante();
        String expResult = null;
        String result = instance.getNit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNit method, of class Votante.
     */
    @Test
    public void testSetNit() {
        System.out.println("setNit");
        String nit = "";
        Votante instance = new Votante();
        instance.setNit(nit);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDireccion method, of class Votante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Votante instance = new Votante();
        String expResult = null;
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDireccion method, of class Votante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Votante instance = new Votante();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCodigo method, of class Votante.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Votante instance = new Votante();
        Integer expResult = null;
        Integer result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCodigo method, of class Votante.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = null;
        Votante instance = new Votante();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of votar method, of class Votante.
     */
    @Test
    public void testVotar() {
        System.out.println("votar");
        Integer nVoto = null;
        Integer idCandidato = null;
        Integer idUrna = null;
        Integer idDepto = null;
        Votante instance = new Votante();
        Partido expResult = null;
        Partido result = instance.votar(nVoto, idCandidato, idUrna, idDepto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of leerIndicaciones method, of class Votante.
     */
    @Test
    public void testLeerIndicaciones() {
        System.out.println("leerIndicaciones");
        String Indicaciones = "";
        Votante instance = new Votante();
        instance.leerIndicaciones(Indicaciones);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of anularVoto method, of class Votante.
     */
    @Test
    public void testAnularVoto() {
        System.out.println("anularVoto");
        Integer idVoto = null;
        Votante instance = new Votante();
        VotoNulo expResult = null;
        VotoNulo result = instance.anularVoto(idVoto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
