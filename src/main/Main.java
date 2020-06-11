/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conjuntos.Conjunteable;

/**
 *
 * @author memol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conjunteable a=new Conjunteable();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        Conjunteable b=new Conjunteable();
        b.add("5");
        b.add("6");
        b.add("7");
        Conjunteable c=new Conjunteable();
        System.out.print("A");
        a.showElements();
        System.out.print("B");
        b.showElements();
        System.out.print("UNION");
        c.union(a,b);
        System.out.print("UNIONALL");
        c.unionAll(a,b);
        System.out.print("MINUS");
        c.minus(a,b);
        System.out.print("INTERSECT");
        c.intersect(a, b);
        System.out.print("PRODUCTO");
        c.product(a, b); 
    }
    
}
