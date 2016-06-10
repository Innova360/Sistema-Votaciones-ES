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
public class AdministradorUrnaElectronicaTest {
    
    public AdministradorUrnaElectronicaTest() {
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
     * Test of AdministradorUrnaElectronica method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testAdministradorUrnaElectronica_0args() {
        System.out.println("AdministradorUrnaElectronica");
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.AdministradorUrnaElectronica();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AdministradorUrnaElectronica method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testAdministradorUrnaElectronica_Integer() {
        System.out.println("AdministradorUrnaElectronica");
        Integer codigoUrna = null;
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.AdministradorUrnaElectronica(codigoUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCodigoUrna method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testGetCodigoUrna() {
        System.out.println("getCodigoUrna");
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        Integer expResult = null;
        Integer result = instance.getCodigoUrna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCodigoUrna method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testSetCodigoUrna() {
        System.out.println("setCodigoUrna");
        Integer codigoUrna = null;
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.setCodigoUrna(codigoUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscarVotante method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testBuscarVotante() {
        System.out.println("buscarVotante");
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.buscarVotante();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticaUrna method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testMostrarEstadisticaUrna() {
        System.out.println("mostrarEstadisticaUrna");
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.mostrarEstadisticaUrna();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imprimirEstadisticaUrna method, of class AdministradorUrnaElectronica.
     */
    @Test
    public void testImprimirEstadisticaUrna() {
        System.out.println("imprimirEstadisticaUrna");
        AdministradorUrnaElectronica instance = new AdministradorUrnaElectronica();
        instance.imprimirEstadisticaUrna();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
