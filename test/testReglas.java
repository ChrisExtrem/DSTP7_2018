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
        //Caso 2 productos iguales
        v1.AgregarDetalle(Negocio.Productos()[0],2);
        assertEquals(25d,r1.RealizarDescuento(v1),0);
        //Caso 3 productos iguales
        v1.AgregarDetalle(Negocio.Productos()[6],3);
        assertEquals(53d,r1.RealizarDescuento(v1),0);
    }
    
    @Test
    public void testRegla2(){
        Regla2 r2 = new Regla2();
        Venta v2 = new Venta();
        //Caso Total >500 y <=1000
        v2.AgregarDetalle(Negocio.Productos()[0],10);
        v2.AgregarDetalle(Negocio.Productos()[1], 1);
        System.out.println("Resultado 1: "+v2.Total());
        System.out.println("Descuento 1(3%): "+r2.RealizarDescuento(v2));
        assertEquals(15.9d,r2.RealizarDescuento(v2),0.01); //Total 530, descuento esperado 15.9
        //Caso Total >1000 y <=2500
        v2.AgregarDetalle(Negocio.Productos()[3], 10);
        System.out.println("Resultado 2: "+v2.Total());
        System.out.println("Descuento 2(5%): "+r2.RealizarDescuento(v2));
        assertEquals(56.5d,r2.RealizarDescuento(v2),0.01); //Total 1130, descuento esperado 56.5
        //Caso Total >2500
        v2.AgregarDetalle(Negocio.Productos()[5], 100);
        System.out.println("Resultado 3: "+v2.Total());
        System.out.println("Descuento 3(6.5%): "+r2.RealizarDescuento(v2));
        assertEquals(170.95d,r2.RealizarDescuento(v2),0.01); //Total 2630, descuento esperado 170.95
    }
    
    @Test
    public void testRegla3(){
        Regla3 r3 = new Regla3();
        Venta v3 = new Venta();
        //Caso 2 Unidades Lacteos
        v3.AgregarDetalle(Negocio.Productos()[1], 2);
        System.out.println("Resultado 1: "+v3.Total());
        System.out.println("Descuento 1(30% x 2 Unidades): "+r3.RealizarDescuento(v3));//Total 60, descuento esperado 9.0d
        assertEquals(9,r3.RealizarDescuento(v3),0.01);
        //Caso 5 Unidades Verduras
        v3.AgregarDetalle(Negocio.Productos()[3], 5);
        System.out.println("Resultado 2: "+v3.Total());
        System.out.println("Descuento 2(30% x 5 Unidades): "+r3.RealizarDescuento(v3));//Total 360, descuento esperado 81.0d
        assertEquals(81,r3.RealizarDescuento(v3),0.01);
    }
    
    @Test
    public void testRegla4(){
        Regla4 r4 = new Regla4();
        Venta v4 = new Venta();
        v4.AgregarDetalle(Negocio.Productos()[0], 10);
        v4.AgregarDetalle(Negocio.Productos()[3], 10);
        System.out.println("Resultado: "+v4.Total());
        System.out.println("Descuento en Ventas > $1000 (10% x Producto.Cantidad>3): "
                +r4.RealizarDescuento(v4)); //Total 1100, descuento esperado 11
        assertEquals(11,r4.RealizarDescuento(v4),0.01);
    }
    
}
