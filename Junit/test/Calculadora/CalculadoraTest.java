/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculadoraTest {

   static Calculadora cal;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeclass()");
        cal = new Calculadora();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    @Before
    public void before() {
        System.out.println("before()");

    }

    @After
    public void after() {
        System.out.println("after()");
    }

    @Test
    public void testSum() {
        System.out.println("sum()");
        int resultado = cal.add(3, 2);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testAnsSkum() {
        System.out.println("ansSum");
        cal.add(3, 2);
        int resultado = cal.ans();
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test()
    public void testDiv() {
        System.out.println("testDiv()");
        cal.div(5, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        System.out.println("tesDivPorCero");
        cal.div(5, 0);
    }

    @Test(timeout = 100)
    public void testAlgoritmoOptimo() {
        System.out.println("testAlgoritmoOptimo");
        cal.operacionOptima();
    }

    @Test(timeout = 100)
    public void bucleInfinito() {
        System.out.println("bucleInfinito");
        cal.bucleInfinito();
    }

}