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
public class DepartamentoTest {
    
    public DepartamentoTest() {
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
     * Test of Departamento method, of class Departamento.
     */
    @Test
    public void testDepartamento_0args() {
        System.out.println("Departamento");
        Departamento instance = new Departamento();
        instance.Departamento();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Departamento method, of class Departamento.
     */
    @Test
    public void testDepartamento_Integer_String() {
        System.out.println("Departamento");
        Integer idDepto = null;
        String nombreDepto = "";
        Departamento instance = new Departamento();
        instance.Departamento(idDepto, nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdDepto method, of class Departamento.
     */
    @Test
    public void testGetIdDepto() {
        System.out.println("getIdDepto");
        Departamento instance = new Departamento();
        Integer expResult = null;
        Integer result = instance.getIdDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdDepto method, of class Departamento.
     */
    @Test
    public void testSetIdDepto() {
        System.out.println("setIdDepto");
        Integer idDepto = null;
        Departamento instance = new Departamento();
        instance.setIdDepto(idDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombreDepto method, of class Departamento.
     */
    @Test
    public void testGetNombreDepto() {
        System.out.println("getNombreDepto");
        Departamento instance = new Departamento();
        String expResult = null;
        String result = instance.getNombreDepto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreDepto method, of class Departamento.
     */
    @Test
    public void testSetNombreDepto() {
        System.out.println("setNombreDepto");
        String nombreDepto = "";
        Departamento instance = new Departamento();
        instance.setNombreDepto(nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Departamento.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idDepto = null;
        String nombreDepto = "";
        Departamento instance = new Departamento();
        instance.agregar(idDepto, nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Departamento.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idDepto = null;
        String nombreDepto = "";
        Departamento instance = new Departamento();
        instance.modificar(idDepto, nombreDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Departamento.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idDepto = null;
        Departamento instance = new Departamento();
        instance.eliminar(idDepto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class Departamento.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Integer idDepto = null;
        Departamento instance = new Departamento();
        Departamento expResult = null;
        Departamento result = instance.mostrar(idDepto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
