/**
 *
 * @author Pasindu Gusthinna Wadu - 500707381
 */
package coe318.lab3;
public class Counter {
    private int modulus;
    private Counter left;
    private int digit;
    
    
    public Counter(int modulus, Counter left) {
        this.modulus=modulus;
        this.left=left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit=digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if(getModulus()-1==getDigit()){
            setDigit(0);
            if(getLeft()!=null)
                getLeft().setDigit(getLeft().getDigit()+1);
        }else
            setDigit(getDigit()+1);
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(getLeft()==null)
            return getDigit();
        else
            return getDigit()+getModulus()*getLeft().getCount();
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
