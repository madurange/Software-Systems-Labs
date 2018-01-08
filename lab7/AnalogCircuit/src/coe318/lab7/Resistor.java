/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 * Represents a Resistor
 * Each Resistor has a unique Id, two nodes and a value(Resistance) with Units(Ohms)
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Resistor extends CircuitElement{
    public static int No_of_R=0;
    
    private final int R_ID;
    /**
     * Sets the two nodes, ID and the value of the Resistor.
     * @param resistance - Value of The Resistor.(A non-negative Value)
     * @param node1 - Node 1 of The Resistor
     * @param node2 - Node 2 of The Resistor
     */
    public Resistor(double resistance, Node node1, Node node2) {
        super(node1, node2);
        this.R_ID=++No_of_R;
        if(resistance>=0){
            setValue(resistance);
        }else{
            throw new IllegalArgumentException("Resistance must be a non-negative Value.");
        }

    }
    /**
     * Prints the description of the Resistor as the Output
     * @return 
     */
    @Override
    public String toString() {
        return "R"+this.R_ID+"\tNodes: "+getNodes()[0]+" & "+getNodes()[1]+"\t"+getValue()+" Ohms";
    }
        
}
