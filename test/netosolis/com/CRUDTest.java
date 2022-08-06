/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netosolis.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego_Cárdenas
 */
public class CRUDTest {
    
    private Statement st;
    
    public CRUDTest() {
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
     * Test of insert method, of class CRUD.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String nombre = "TESTING";
        String genero = "SOFTWARE";
        int anio = 21;
        String actor = "DEVELOPMEN";
        String pais = "COLOMBIA";
        CRUD instance = new CRUD();
        boolean result = false, expResult = true;
        result = instance.insert(nombre, genero, anio, actor, pais);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectXtodas method, of class CRUD.
     * @throws java.sql.SQLException
     */
    @Test
    public void testSelectXtodas() throws SQLException {
        System.out.println("selectXtodas");
        CRUD instance = new CRUD();
        ResultSet pelicula = instance.selectXtodas();
        String expResult = "TESTING";
        String result = "";
        while (pelicula.next()) {            
            result = pelicula.getString("nombre");
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of selectXgenero method, of class CRUD.
     * @throws java.sql.SQLException
     */
    @Test
    public void testSelectXgenero() throws SQLException {
        System.out.println("selectXgenero");
        String genero = "SOFTWARE";
        CRUD instance = new CRUD();
        ResultSet pelicula = instance.selectXgenero(genero);
        String expResult = "SOFTWARE";
        String result = "";
        while (pelicula.next()) {            
            result = pelicula.getString("genero");
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of selectXpais method, of class CRUD.
     * @throws java.sql.SQLException
     */
    @Test
    public void testSelectXpais() throws SQLException {
        System.out.println("selectXpais");
        String pais = "COLOMBIA";
        CRUD instance = new CRUD();
        ResultSet pelicula = instance.selectXpais(pais);
        String expResult = "COLOMBIA";
        String result = "";
        while (pelicula.next()) {            
            result = pelicula.getString("pais");
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class CRUD.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 11;
        CRUD instance = new CRUD();
        boolean expResult = true;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class CRUD.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 8;
        String nombre = "HACKING";
        String genero = "REDES";
        int anio = 31;
        String actor = "CARLOS";
        String pais = "USA";
        CRUD instance = new CRUD();
        boolean expResult = true;
        boolean result = instance.update(id, nombre, genero, anio, actor, pais);
        assertEquals(expResult, result);
    }
    
}
