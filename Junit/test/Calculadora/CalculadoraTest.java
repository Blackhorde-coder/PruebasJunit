/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hernan Mauricio Pena leg: 111708
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        int resultado = Calculadora.suma(2,3);
        int esperado = 5;
        assertEquals(esperado, resultado);


    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");

    }

}
