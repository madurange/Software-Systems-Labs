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
public class Node {
    public static int No_of_nodes=0;
    
    private final int Id;
    
    public Node(){
        this.Id=No_of_nodes++;
    }

    @Override
    public String toString() {
        return ""+this.Id;
    }
    
    
}
