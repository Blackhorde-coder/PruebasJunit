/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Hernan Mauricio Pena leg: 111708
 */
public class Calculadora {

    public Calculadora() {
        ans = 0;
    }
    private int ans;

    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int add(int v) {
        ans += v;
        return ans;
    }

    public int sub(int v) {
        ans -= v;
        return ans;
    }

    public int ans() {
        return ans;
    }

    public void clearAns() {
        ans = 0;
    }

    public int div(int a, int b) {
        if(b == 0)
        {
            throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO!!!");
        }
        ans = a/b;
        return ans;
    }
    public void operacionOptima ()
    {
        try
        {
                    Thread.sleep(2000);

        } catch (InterruptedException e)
        {
        }
    }
    public void bucleInfinito ()
    {
        for (;;);
    }

}
