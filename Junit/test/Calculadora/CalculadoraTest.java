/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class CalculadoraTest {
    Calculadora cal;
    @Before
    public void before ()
    {
        System.out.println("before()");
        cal = new Calculadora();

    }
    @After
    public void after()
    {
        System.out.println("after()");
        cal.clearAns();
    }
    
    @Test
    public void testSum ()
    {
        System.out.println("sum()");
        int resultado = cal.add(3,2);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testAnsSkum ()
    {
        System.out.println("ansSum");
        cal.add(3, 2);
        int resultado = cal.ans();
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    
    
    
//    public void testSuma() {
//        System.out.println("suma");
//        int resultado = Calculadora.suma(2,3);
//        int esperado = 5;
//        assertEquals(esperado, resultado);
//    }
//    @Test
//    public void testResta() {
//        System.out.println("resta");
//        int resultado = Calculadora.resta(3, 2);
//        int esperado = 1;
//        assertEquals(esperado, resultado);
//    }

}
