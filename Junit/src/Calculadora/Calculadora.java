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
    
    public int add (int v)
    {
        ans += v;
        return  ans;
    }
    public int sub (int v)
    {
        ans -=v;
        return ans;
    }
    public int ans()
    {
        return ans;
    }
        public void clearAns ()
    {
        ans= 0;
    }

}
