
package coe318.lab7;

/**
 * This is the abstract class for Resistors and Voltage Sources.
 *
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public abstract class CircuitElement {
    private final Node node1,node2;
    private double value;
    
    /**
     * Sets the Nodes of The Element
     * @param node1 -Node 1 of The Circuit Element
     * @param node2 -Node 2 of The Circuit Element
     */
    public CircuitElement(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
    }
    
    public void setValue(double value){
        this.value=value;
    }
    /**
     * Return the Value of the Resistor(Resistance) or the Voltage Source 
     * @return 
     */
    public double getValue() {
        return value;
    }
    /**
     * Returns the two nodes of The Circuit Element
     * @return 
     */
    public Node[] getNodes(){
        Node[] temp={this.node1,this.node2};
        return temp;
    }
    
}
