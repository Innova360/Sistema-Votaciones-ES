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
public class AdministradorTest {
    
    public AdministradorTest() {
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
     * Test of Administrador method, of class Administrador.
     */
    @Test
    public void testAdministrador_0args() {
        System.out.println("Administrador");
        Administrador instance = new Administrador();
        instance.Administrador();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Administrador method, of class Administrador.
     */
    @Test
    public void testAdministrador_Integer_String() {
        System.out.println("Administrador");
        Integer idAdmin = null;
        String tipoAdmin = "";
        Administrador instance = new Administrador();
        instance.Administrador(idAdmin, tipoAdmin);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getIdAdmin method, of class Administrador.
     */
    @Test
    public void testGetIdAdmin() {
        System.out.println("getIdAdmin");
        Administrador instance = new Administrador();
        Integer expResult = null;
        Integer result = instance.getIdAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setIdAdmin method, of class Administrador.
     */
    @Test
    public void testSetIdAdmin() {
        System.out.println("setIdAdmin");
        Integer idAdmin = null;
        Administrador instance = new Administrador();
        instance.setIdAdmin(idAdmin);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTipoAdmin method, of class Administrador.
     */
    @Test
    public void testGetTipoAdmin() {
        System.out.println("getTipoAdmin");
        Administrador instance = new Administrador();
        String expResult =null;
        String result = instance.getTipoAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTipoAdmin method, of class Administrador.
     */
    @Test
    public void testSetTipoAdmin() {
        System.out.println("setTipoAdmin");
        String tipoAdmin = "";
        Administrador instance = new Administrador();
        instance.setTipoAdmin(tipoAdmin);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of reportarAnomalias method, of class Administrador.
     */
    @Test
    public void testReportarAnomalias() {
        System.out.println("reportarAnomalias");
        Administrador instance = new Administrador();
        instance.reportarAnomalias();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mostrarEstadisticaDepartamental method, of class Administrador.
     */
    @Test
    public void testMostrarEstadisticaDepartamental() {
        System.out.println("mostrarEstadisticaDepartamental");
        Integer idDepartamento = null;
        Administrador instance = new Administrador();
        instance.mostrarEstadisticaDepartamental(idDepartamento);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mostrarEstadisticaMunicipal method, of class Administrador.
     */
    @Test
    public void testMostrarEstadisticaMunicipal() {
        System.out.println("mostrarEstadisticaMunicipal");
        Integer idMunicipio = null;
        Administrador instance = new Administrador();
        instance.mostrarEstadisticaMunicipal(idMunicipio);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of mostrarEstadisticaCentroVotacion method, of class Administrador.
     */
    @Test
    public void testMostrarEstadisticaCentroVotacion() {
        System.out.println("mostrarEstadisticaCentroVotacion");
        Integer idCentroVotacion = null;
        Administrador instance = new Administrador();
        instance.mostrarEstadisticaCentroVotacion(idCentroVotacion);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of imprimirEstadisticaCentroVotacion method, of class Administrador.
     */
    @Test
    public void testImprimirEstadisticaCentroVotacion() {
        System.out.println("imprimirEstadisticaCentroVotacion");
        Integer idCentroVotacion = null;
        Administrador instance = new Administrador();
        instance.imprimirEstadisticaCentroVotacion(idCentroVotacion);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of imprimirEstadisticaMunicipal method, of class Administrador.
     */
    @Test
    public void testImprimirEstadisticaMunicipal() {
        System.out.println("imprimirEstadisticaMunicipal");
        Integer idMunicipio = null;
        Administrador instance = new Administrador();
        instance.imprimirEstadisticaMunicipal(idMunicipio);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of imprimirEstadisticaDepartamental method, of class Administrador.
     */
    @Test
    public void testImprimirEstadisticaDepartamental() {
        System.out.println("imprimirEstadisticaDepartamental");
        Integer idDepartamento = null;
        Administrador instance = new Administrador();
        instance.imprimirEstadisticaDepartamental(idDepartamento);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
