/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Hernan Mauricio Pena leg: 111708
 */
@RunWith(value = Parameterized.class)
public class CalculadoraParametro {
    @Parameters
    public static Iterable<Object[]> getData() 
    {
        return Arrays.asList(new Object[][]{ {3,3,6},{2,3,5},{3,1,4}});
               
    }
    private int a, b, exp;

    public CalculadoraParametro(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Test
    public void testAdd() {
        Calculadora cal = new Calculadora();
        int resultado = cal.add(a, b);
        assertEquals(exp, resultado);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
