/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Resistor {
    public static int No_of_R=0;
    
    private double resistance;
    private final int Id;
    private Node node1,node2;

    public Resistor(double resistance, Node node1, Node node2) {
        this.Id=++No_of_R;
        if(resistance>=0){
            this.resistance = resistance;
        }else{
            throw new IllegalArgumentException("Resistance must be a non-negative Value.");
        }
        this.node1 = node1;
        this.node2 = node2;
    }
    
    public Node[] getNodes(){
        Node[] temp={this.node1,this.node2};
        return temp;
    }

    @Override
    public String toString() {
        return "R"+this.Id+"\tNodes: "+this.node1+" & "+this.node2+"\t"+this.resistance+" Ohms";
    }
    
}
