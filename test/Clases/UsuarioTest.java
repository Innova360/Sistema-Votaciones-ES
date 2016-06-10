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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of Usuario method, of class Usuario.
     */
    @Test
    public void testUsuario_0args() {
        System.out.println("Usuario");
        Usuario instance = new Usuario();
        instance.Usuario();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Usuario method, of class Usuario.
     */
    @Test
    public void testUsuario_8args() {
        System.out.println("Usuario");
        Integer idUsuario = null;
        String nombre = "";
        String apellido = "";
        String usuario = "";
        Integer edad = null;
        String genero = "";
        String contrasenia = "";
        String direccion = "";
        Usuario instance = new Usuario();
        instance.Usuario(idUsuario, nombre, apellido, usuario, edad, genero, contrasenia, direccion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdUsuario method, of class Usuario.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdUsuario method, of class Usuario.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        Integer idUsuario = null;
        Usuario instance = new Usuario();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getApellido method, of class Usuario.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setApellido method, of class Usuario.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Usuario instance = new Usuario();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Usuario instance = new Usuario();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEdad method, of class Usuario.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEdad method, of class Usuario.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        Integer edad = null;
        Usuario instance = new Usuario();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getGenero method, of class Usuario.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGenero method, of class Usuario.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Usuario instance = new Usuario();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getContrasenia method, of class Usuario.
     */
    @Test
    public void testGetContrasenia() {
        System.out.println("getContrasenia");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getContrasenia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDireccion method, of class Usuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDireccion method, of class Usuario.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Usuario instance = new Usuario();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iniciarSesion method, of class Usuario.
     */
    @Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        String usuario = "";
        String contrasenia = "";
        Usuario instance = new Usuario();
        instance.iniciarSesion(usuario, contrasenia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setContrasenia method, of class Usuario.
     */
    @Test
    public void testSetContrasenia() {
        System.out.println("setContrasenia");
        String contrasenia = "";
        Usuario instance = new Usuario();
        instance.setContrasenia(contrasenia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregar method, of class Usuario.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Integer idUsuario = null;
        String nombre = "";
        String apellido = "";
        String usuario = "";
        String genero = "";
        String contrasenia = "";
        String direccion = "";
        Usuario instance = new Usuario();
        instance.agregar(idUsuario, nombre, apellido, usuario, genero, contrasenia, direccion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of modificar method, of class Usuario.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Integer idUsuario = null;
        String nombre = "";
        String apellido = "";
        String usuario = "";
        String genero = "";
        String contrasenia = "";
        String direccion = "";
        Usuario instance = new Usuario();
        instance.modificar(idUsuario, nombre, apellido, usuario, genero, contrasenia, direccion);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminar method, of class Usuario.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Integer idUsuario = null;
        Usuario instance = new Usuario();
        instance.eliminar(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostrar method, of class Usuario.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Integer idUsuario = null;
        Usuario instance = new Usuario();
        Usuario expResult = null;
        Usuario result = instance.mostrar(idUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
