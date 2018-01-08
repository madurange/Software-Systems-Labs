/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Account {
    
    private String name;
    private int number;
    private double balance;
    
    public Account(String name, int number, double initialbalance) {
        this.name = name;
        this.number = number;
        this.balance = initialbalance;
    }
    
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    /*
     * Making a deposit if only the amount depositing is greater than 0
     * Returns "true" if deposit is made otherwise returns "false" 
     */
    public boolean deposit(double amount){
        if(amount>0){
            balance+=amount;
            return true;
        }else{
            return false;
        }
            
    }
    
    public boolean withdraw(double amount){
        if(amount>0 && getBalance()>=amount){
            balance-=amount;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
    
}
