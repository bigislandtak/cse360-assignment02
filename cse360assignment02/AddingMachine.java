package cse360assignment02;

import java.util.*;

public class AddingMachine {
  private int total;
  ArrayList<String> transactions;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    transactions = new ArrayList<String>();
    transactions.add("0");
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total += value;
    transactions.add("+");
    transactions.add(Integer.toString(value));
  }

  public void subtract (int value) {
    total -= value;
    transactions.add("-");
    transactions.add(Integer.toString(value));
  }

  public String toString () {
    StringBuilder sb = new StringBuilder();
    for (String s : transactions)
      sb.append(s + " ");
    return sb.toString();
  }

  public void clear() {
    transactions.clear();
  }
}