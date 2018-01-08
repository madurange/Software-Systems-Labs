/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Pasindu Gusthinna Wadu-500707381
 */
public class Circuit {
    
    private static Circuit instance = null;
    
    private ArrayList<Resistor> resistors=new ArrayList<Resistor>();
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    
    private Circuit() {}
    
    public void add(Resistor r){
        this.resistors.add(r);
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i < this.resistors.size(); i++) {
            temp+=this.resistors.get(i)+"\n";
        }
        return temp;
    }
    
    
    public static void main(String[] args){
         Node n0=new Node();
         Node n1=new Node();
         Node n2=new Node();
         
         Resistor r1=new Resistor(30.0, n0, n1);
         Resistor r2=new Resistor(45.0, n1, n2);
         Resistor r3=new Resistor(50.0, n2, n0);
         
         Circuit cir=new Circuit();
         
         cir.add(r1);
         cir.add(r2);
         cir.add(r3);
         
         System.out.println("The Circuit :\n"+cir);
    }
    
}
