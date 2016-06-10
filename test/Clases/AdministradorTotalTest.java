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


/**
 *
 * @author manue_000
 */
public class AdministradorTotalTest {
    
    public AdministradorTotalTest() {
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
     * Test of AdministradorTotal method, of class AdministradorTotal.
     */
    @Test
    public void testAdministradorTotal() {
        System.out.println("AdministradorTotal");
        AdministradorTotal instance = new AdministradorTotal();
        instance.AdministradorTotal();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of leerIndicaciones method, of class AdministradorTotal.
     */
    @Test
    public void testLeerIndicaciones() {
        System.out.println("leerIndicaciones");
        AdministradorTotal instance = new AdministradorTotal();
        instance.leerIndicaciones();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of habilitarVotaciones method, of class AdministradorTotal.
     */
    @Test
    public void testHabilitarVotaciones() {
        System.out.println("habilitarVotaciones");
        String pwd = "";
        String user = "";
        AdministradorTotal instance = new AdministradorTotal();
        instance.habilitarVotaciones(pwd, user);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of deshabilitarVotaciones method, of class AdministradorTotal.
     */
    @Test
    public void testDeshabilitarVotaciones() {
        System.out.println("deshabilitarVotaciones");
        String pwd = "";
        String user = "";
        AdministradorTotal instance = new AdministradorTotal();
        instance.deshabilitarVotaciones(pwd, user);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of registrarAnomalias method, of class AdministradorTotal.
     */
    @Test
    public void testRegistrarAnomalias() {
        System.out.println("registrarAnomalias");
        AdministradorTotal instance = new AdministradorTotal();
        instance.registrarAnomalias();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticaDepartamental method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarEstadisticaDepartamental() {
        System.out.println("mostrarEstadisticaDepartamental");
        Integer idDepto = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarEstadisticaDepartamental(idDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticaMunicipal method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarEstadisticaMunicipal() {
        System.out.println("mostrarEstadisticaMunicipal");
        Integer idMunicipio = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarEstadisticaMunicipal(idMunicipio);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticaCentroVotacion method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarEstadisticaCentroVotacion() {
        System.out.println("mostrarEstadisticaCentroVotacion");
        Integer idCentroV = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarEstadisticaCentroVotacion(idCentroV);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarEstadisticaNacional method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarEstadisticaNacional() {
        System.out.println("mostrarEstadisticaNacional");
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarEstadisticaNacional();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imprimirEstadisticaDepartamental method, of class AdministradorTotal.
     */
    @Test
    public void testImprimirEstadisticaDepartamental() {
        System.out.println("imprimirEstadisticaDepartamental");
        Integer idDepto = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.imprimirEstadisticaDepartamental(idDepto);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of imprimirEstadisticaCentroVotacion method, of class AdministradorTotal.
     */
    @Test
    public void testImprimirEstadisticaCentroVotacion() {
        System.out.println("imprimirEstadisticaCentroVotacion");
        Integer idCVotacion = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.imprimirEstadisticaCentroVotacion(idCVotacion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imprimirEstadisticaNacional method, of class AdministradorTotal.
     */
    @Test
    public void testImprimirEstadisticaNacional() {
        System.out.println("imprimirEstadisticaNacional");
        AdministradorTotal instance = new AdministradorTotal();
        instance.imprimirEstadisticaNacional();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscarVotante method, of class AdministradorTotal.
     */
    @Test
    public void testBuscarVotante() {
        System.out.println("buscarVotante");
        Integer idVotante = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.buscarVotante(idVotante);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarDiputado method, of class AdministradorTotal.
     */
    @Test
    public void testAgregarDiputado() {
        System.out.println("agregarDiputado");
        Integer idDiputado = null;
        String nombre = "";
        Partido partido = null;
        String fotografia = "";
        AdministradorTotal instance = new AdministradorTotal();
        instance.agregarDiputado(idDiputado, nombre, partido, fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarDiputado method, of class AdministradorTotal.
     */
    @Test
    public void testModificarDiputado() {
        System.out.println("modificarDiputado");
        Integer idDiputado = null;
        String nombre = "";
        Partido partido = null;
        String fotografia = "";
        AdministradorTotal instance = new AdministradorTotal();
        instance.modificarDiputado(idDiputado, nombre, partido, fotografia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarDiputado method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarDiputado() {
        System.out.println("mostrarDiputado");
        Integer idDiputado = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarDiputado(idDiputado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarDiputado method, of class AdministradorTotal.
     */
    @Test
    public void testEliminarDiputado() {
        System.out.println("eliminarDiputado");
        Integer idDiputado = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.eliminarDiputado(idDiputado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarPartido method, of class AdministradorTotal.
     */
    @Test
    public void testAgregarPartido() {
        System.out.println("agregarPartido");
        Integer idPartido = null;
        String nombre = "";
        Integer bandera = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.agregarPartido(idPartido, nombre, bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarPartido method, of class AdministradorTotal.
     */
    @Test
    public void testModificarPartido() {
        System.out.println("modificarPartido");
        Integer idPartido = null;
        String nombre = "";
        Integer bandera = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.modificarPartido(idPartido, nombre, bandera);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarPartido method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarPartido() {
        System.out.println("mostrarPartido");
        Integer idPartido = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarPartido(idPartido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarPartido method, of class AdministradorTotal.
     */
    @Test
    public void testEliminarPartido() {
        System.out.println("eliminarPartido");
        Integer idPartido = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.eliminarPartido(idPartido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarAdminUrna method, of class AdministradorTotal.
     */
    @Test
    public void testAgregarAdminUrna() {
        System.out.println("agregarAdminUrna");
        Integer codigoUrna = null;
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.agregarAdminUrna(codigoUrna, idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarAdminUrna method, of class AdministradorTotal.
     */
    @Test
    public void testModificarAdminUrna() {
        System.out.println("modificarAdminUrna");
        Integer codigoAminUrna = null;
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.modificarAdminUrna(codigoAminUrna, idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarAdminUrna method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarAdminUrna() {
        System.out.println("mostrarAdminUrna");
        Integer codigoUrna = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarAdminUrna(codigoUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarAdminUrna method, of class AdministradorTotal.
     */
    @Test
    public void testEliminarAdminUrna() {
        System.out.println("eliminarAdminUrna");
        Integer codigoUrna = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.eliminarAdminUrna(codigoUrna);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarAdminDepartamento method, of class AdministradorTotal.
     */
    @Test
    public void testAgregarAdminDepartamento() {
        System.out.println("agregarAdminDepartamento");
        Integer codigoDepto = null;
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.agregarAdminDepartamento(codigoDepto, idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarAdminDepartamento method, of class AdministradorTotal.
     */
    @Test
    public void testModificarAdminDepartamento() {
        System.out.println("modificarAdminDepartamento");
        Integer codigoDepto = null;
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.modificarAdminDepartamento(codigoDepto, idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarAdminDepartamento method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarAdminDepartamento() {
        System.out.println("mostrarAdminDepartamento");
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarAdminDepartamento(idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarAdminDepartamento method, of class AdministradorTotal.
     */
    @Test
    public void testEliminarAdminDepartamento() {
        System.out.println("eliminarAdminDepartamento");
        Integer idAdmin = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.eliminarAdminDepartamento(idAdmin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarUrna method, of class AdministradorTotal.
     */
    @Test
    public void testAgregarUrna() {
        System.out.println("agregarUrna");
        Integer idUrna = null;
        Integer idDepto = null;
        Integer idMuni = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.agregarUrna(idUrna, idDepto, idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificarUrna method, of class AdministradorTotal.
     */
    @Test
    public void testModificarUrna() {
        System.out.println("modificarUrna");
        Integer idUrna = null;
        Integer idDepto = null;
        Integer idMuni = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.modificarUrna(idUrna, idDepto, idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrarUrna method, of class AdministradorTotal.
     */
    @Test
    public void testMostrarUrna() {
        System.out.println("mostrarUrna");
        Integer idMuni = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.mostrarUrna(idMuni);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarUrna method, of class AdministradorTotal.
     */
    @Test
    public void testEliminarUrna() {
        System.out.println("eliminarUrna");
        Integer idUrna = null;
        AdministradorTotal instance = new AdministradorTotal();
        instance.eliminarUrna(idUrna);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
