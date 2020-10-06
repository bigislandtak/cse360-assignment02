/**
* The AddingMachine program implements a machine that can perform basic addition
* and subtraction and store the current total along with the entire transaction history.
*
* @author  Takeyuki Oshima
* @version 2.0
* @since   2020-10-05 
*/

package cse360assignment02;

import java.util.*;

public class AddingMachine {
  /**
   * The current total.
   */
  private int total;

  /**
   * The transaction history.
   */
  ArrayList<String> transactions;
  
  /**
   * Creates a new AddingMachine with total initialized to zero.
   */
  public AddingMachine () {
    total = 0;
    transactions = new ArrayList<String>();
    transactions.add("0");
  }
  
  /**
   * Gets the current total.
   * @return total.
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds the value given as the parameter to the current total
   * @param value value to be added to total.
   */
  public void add (int value) {
    total += value;
    transactions.add("+");
    transactions.add(Integer.toString(value));
  }

  /**
   * Subtracts the value given as the parameter from the current total
   * @param value value to be subtracted from total.
   */
  public void subtract (int value) {
    total -= value;
    transactions.add("-");
    transactions.add(Integer.toString(value));
  }

  /**
   * String representation of transaction history.
   * @return transactions concatenated into a string.
   */
  public String toString () {
    StringBuilder sb = new StringBuilder();
    for (String s : transactions)
      sb.append(s + " ");
    return sb.toString();
  }

  /**
   * Clears the transaction history.
   */
  public void clear() {
    transactions.clear();
  }
}