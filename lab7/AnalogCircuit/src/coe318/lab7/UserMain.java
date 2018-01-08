/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.Scanner;

/**
 * Main Class of the Application which creates a circuit containing 
 * Resistors and Voltage Sources. 
 * @author pgusthin
 */
public class UserMain implements UserInterface{
    private final Scanner user=new Scanner(System.in);
    private Circuit c;
    private String input[],keyword;
    
    public static void main(String[] args){
        UserMain u1=new UserMain();
        u1.start();
        
    }

    @Override 
    public void start() {
        System.out.println("Simple DC Circuit\n=================\n");
        System.out.println("To Create a Resistor:\t\t r <node1> <node2> <value>");
        System.out.println("To Create a Voltage Source:\t v <node1> <node2> <value>");
        System.out.println("To Display the circuit so far:\t spice");
        System.out.println("To End:\t\t\t\t end\n");
        this.c=Circuit.getInstance();
        do{
            input = user.nextLine().split(" ");
            keyword = input[0];

            if(keyword.equals("r")){
                c.add(new Resistor(Double.parseDouble(input[3]),c.getNode(Integer.parseInt(input[1])),c.getNode(Integer.parseInt(input[2]))));
            }
            if(keyword.equals("v")){
                c.add(new VoltageSource(Double.parseDouble(input[3]),c.getNode(Integer.parseInt(input[1])),c.getNode(Integer.parseInt(input[2]))));
            }
            
            if(keyword.equals("spice")){
                spice();
            }
        }while(keyword.equals("end")==false);
        end();
    }

    @Override
    public void end() {
        System.out.println("All Done");
    }

    @Override
    public void spice() {
        System.out.println("\n"+c.toString().toUpperCase());
    }
    
}
