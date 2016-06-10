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
public class FormularioTest {
    
    public FormularioTest() {
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
     * Test of mostrar method, of class Formulario.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Formulario instance = new Formulario();
        AdministradorUrnaElectronica expResult = null;
        AdministradorUrnaElectronica result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Formulario.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Formulario instance = new Formulario();
        instance.modificar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Formulario.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Formulario instance = new Formulario();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Formulario.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Formulario instance = new Formulario();
        instance.agregar();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
