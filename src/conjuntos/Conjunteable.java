/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.ArrayList;

/**
 *
 * @author memol
 */
public class Conjunteable {
    private final ArrayList<String> terminos;
    
    public Conjunteable(){
        terminos=new ArrayList<>();
    }
    
    public void add(String num){
        terminos.add(num);
    }
    
    public void addUnique(String num){
        if(terminos.contains(num)==false){
            add(num);
        }
    }
    
    public int size(){
       return terminos.size();
    }
    
    public String get(int pos){
        return terminos.get(pos);
    }
    
    public void showElements(){
        System.out.print("=[ ");
        for(int i=0;i<terminos.size();i++){
            System.out.print(terminos.get(i)+" ");
        }
        System.out.println("]");
    }
    
    public void union(Conjunteable a, Conjunteable b){
        terminos.clear();
        for(int i=0; i<a.size(); i++){
            addUnique(a.get(i));
        }
        for(int i=0; i<b.size(); i++){
            addUnique(b.get(i));
        }
        showElements();
    }
    
    public void unionAll(Conjunteable a, Conjunteable b){
        terminos.clear();
        for(int i=0; i<a.size(); i++){
            add(a.get(i));
        }
        for(int i=0; i<b.size(); i++){
            add(b.get(i));
        }
        showElements();
    }
    public void minus(Conjunteable a, Conjunteable b){
        terminos.clear();
        for(int i=0; i<a.size(); i++){
            add(a.get(i));
        }
        for(int i=0; i<b.size(); i++){
           terminos.remove(b.get(i));
        }
        showElements();
    }
    public void intersect(Conjunteable a, Conjunteable b){
        terminos.clear();
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(a.get(i)==b.get(j)){
                    addUnique(a.get(i));
                }
            }
        }
        showElements();  
    }
    public void product(Conjunteable a, Conjunteable b){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                System.out.print("("+a.get(i)+","+b.get(j)+")");
            }
        }
    }
}
