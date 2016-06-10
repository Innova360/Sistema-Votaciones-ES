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
public class AdministradorDepartamentalTest {
    
    public AdministradorDepartamentalTest() {
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
     * Test of AdministradorDepartamental method, of class AdministradorDepartamental.
     */
    @Test
    public void testAdministradorDepartamental_0args() {
        System.out.println("AdministradorDepartamental");
        AdministradorDepartamental instance = new AdministradorDepartamental();
        instance.AdministradorDepartamental();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of AdministradorDepartamental method, of class AdministradorDepartamental.
     */
    @Test
    public void testAdministradorDepartamental_Integer_String() {
        System.out.println("AdministradorDepartamental");
        Integer idAdminDepto = null;
        String nombreDepto = "";
        AdministradorDepartamental instance = new AdministradorDepartamental();
        instance.AdministradorDepartamental(idAdminDepto, nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getIdAdminDepto method, of class AdministradorDepartamental.
     */
    @Test
    public void testGetIdAdminDepto() {
        System.out.println("getIdAdminDepto");
        AdministradorDepartamental instance = new AdministradorDepartamental();
        Integer expResult = null;
        Integer result = instance.getIdAdminDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setIdAdminDepto method, of class AdministradorDepartamental.
     */
    @Test
    public void testSetIdAdminDepto() {
        System.out.println("setIdAdminDepto");
        Integer idAdminDepto = null;
        AdministradorDepartamental instance = new AdministradorDepartamental();
        instance.setIdAdminDepto(idAdminDepto);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getNombreDepto method, of class AdministradorDepartamental.
     */
    @Test
    public void testGetNombreDepto() {
        System.out.println("getNombreDepto");
        AdministradorDepartamental instance = new AdministradorDepartamental();
        String expResult = null;
        String result = instance.getNombreDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNombreDepto method, of class AdministradorDepartamental.
     */
    @Test
    public void testSetNombreDepto() {
        System.out.println("setNombreDepto");
        String nombreDepto = "";
        AdministradorDepartamental instance = new AdministradorDepartamental();
        instance.setNombreDepto(nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
