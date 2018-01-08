/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 * Represents a Node.
 * Each node has a unique Id.
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Node {
    private final int Id;
    
    /**
     * Sets the ID of The Node
     * @param id 
     */
    public Node(int id){
        this.Id=id;
    }
    /**
     * Returns the node Id
     * @return 
     */
    public int getId(){
        return this.Id;
    }
    /**
     * Returns the ID of the Node
     * @return 
     */
    @Override
    public String toString() {
        return ""+this.Id;
    }
    
    
}
