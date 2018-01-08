/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 * Represents a VoltageSource
 * Each VoltageSource has a unique Id, two nodes and a value with Units(V)
 * @author pgusthin
 */
public class VoltageSource extends CircuitElement{
    public static int No_of_VS=0;
    
    private final int VS_ID;
    /**
     * Sets the two nodes, ID and the value of the Voltage Source.
     * @param value - Value of The Voltage Source
     * @param node1 - Node 1 of The Voltage Source
     * @param node2 - Node 2 of The Voltage Source
     */
    public VoltageSource(double value, Node node1, Node node2) {
        super(node1, node2);
        this.VS_ID=++No_of_VS;
        setValue(value);
    }
    /**
     * Prints the description of the Voltage Source as the Output.
     * @return 
     */
    @Override
    public String toString() {
        return "V"+this.VS_ID+"\tNodes: "+getNodes()[0]+" & "+getNodes()[1]+"\t"+"DC\t"+getValue()+" V";
    }
  

}
