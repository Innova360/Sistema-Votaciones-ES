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
public class BDRNPNTest {
    
    public BDRNPNTest() {
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
     * Test of conectar method, of class BDRNPN.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        String us = "";
        String contra = "";
        String servidor = "";
        String nameBD = "";
        BDRNPN instance = new BDRNPN();
        instance.conectar(us, contra, servidor, nameBD);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of desconectar method, of class BDRNPN.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        BDRNPN instance = new BDRNPN();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultar method, of class BDRNPN.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        String consulta = "";
        BDRNPN instance = new BDRNPN();
        String expResult = null;
        String result = instance.consultar(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ejecutar method, of class BDRNPN.
     */
    @Test
    public void testEjecutar() {
        System.out.println("ejecutar");
        String consulta = "";
        BDRNPN instance = new BDRNPN();
        instance.ejecutar(consulta);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
