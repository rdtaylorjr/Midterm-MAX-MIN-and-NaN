/**
 Midterm Question 6
 CSC 255 Objects and Algorithms (Fall 2020)
 Oakton Community College
 Professor: Dr. Hector Hernandez

 @file half_adder_nand.java
 @author Russell Taylor
 @date 7/13/20
 
 Based on a provided program stub
 "Complete the Java program such that it will display, in hex, the 
  representations used for java.lang.Float.MIN_VALUE, java.lang.Float.MAX_VALUE, 
  and java.lang.Float.Nan"
*/


//import java.util.*;
//import java.io.*;
import javax.swing.*;

public class half_adder_nand{
  public static void main(String [] args)
  {
    int x, y, c, s;
    boolean X, Y;
    String binary = JOptionPane.showInputDialog("Please enter 00, 01, 10, or 11: ");
    x = Integer.parseInt(binary.charAt(0)+"");
    if(x == 1) X = true;
    else X = false;
    y = Integer.parseInt(binary.charAt(1)+"");
    if(y == 1) Y = true;
    else Y = false;
    System.out.println("x = " + X + "\ny = " + Y);

    boolean carry = !(!(X&&Y)&&!(X&&Y));
    boolean sum = !(!(X&&!(X&&Y))&&!(Y&&!(X&&Y)));
    System.out.println("carry = " + carry + "\nSum = " + sum);

    if(carry == true) c = 1;
    else c = 0;
    if(sum == true) s = 1;
    else s = 0;

    JOptionPane.showMessageDialog(null, "carry = " + c + "\nsum = " + s, 
     "Carry & Sum", JOptionPane.INFORMATION_MESSAGE);
    }
}