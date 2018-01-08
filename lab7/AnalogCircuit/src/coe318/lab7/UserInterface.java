/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 * This is an interface for the UserMain.
 * @author pgusthin
 */
public interface UserInterface {
    /**
     * Stating the Implementation of the Circuit getting inputs from the User.
     */
    public void start();
    /**
     * End the Implementation of the Circuit.
     * Prints "ALL DONE"
     */
    public void end();
    /**
     * Prints the spice description of the circuit entered so far.
     */
    public void spice();
    
    
}
