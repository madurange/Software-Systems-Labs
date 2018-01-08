/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.ArrayList;

/**
 * This is the class for the circuit.
 * Only one circuit can be created in UserMain class.
 * @author Pasindu Gusthinna Wadu-500707381
 */
public class Circuit {
    
    private static Circuit instance = null;
    
    private final ArrayList<CircuitElement> elements=new ArrayList<CircuitElement>();
    private final ArrayList<Node> nodes=new ArrayList<Node>();
    /**
     * Create only one Circuit object.
     * @return - the circuit object 
     */
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
    
    private Circuit() {}
    /**
     * Add resistors or voltage sources to the circuit
     * @param e- Circuit element to be added to the circuit  
     */
    public void add(CircuitElement e){
        this.elements.add(e);
    }
    /**
     * Creates nodes and return nodes
     * @param x - node id to be created or returned
     * @return 
     */
    public Node getNode(int x){
        for(int i=0;i<nodes.size();i++){
            if(nodes.get(i).getId()==x){
                return nodes.get(i);
            }
        }
        nodes.add(new Node(x));
        return nodes.get(nodes.size()-1);
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i < this.elements.size(); i++) {
            temp+=this.elements.get(i).toString()+"\n";
        }
        return temp;
    }
    
}
