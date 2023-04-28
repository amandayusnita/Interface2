/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author hp
 */
public class MyClass implements MyInterface1, MyInterface2 {
    public void myMethod1(){
        System.out.println("Hello World");
    }
    
    @Override
    public void myMethod2(){
        System.out.println("Hello Java");
    }
    @Override
    public void myMethod3(){
        System.out.println("Hello Indonesia");
    }
    
}
