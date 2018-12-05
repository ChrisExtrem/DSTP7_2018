/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dstp7.model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class testReglas {
    
    public testReglas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Negocio.Iniciar();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testRegla1(){
        Regla1 r1 = new Regla1();
        Venta v1 = new Venta();
        v1.AgregarDetalle(Negocio.Productos()[0],2);
        assertEquals(25d,r1.RealizarDescuento(v1),0);
        v1.AgregarDetalle(Negocio.Productos()[6],3);
        assertEquals(53d,r1.RealizarDescuento(v1),0);
    }
    
}
