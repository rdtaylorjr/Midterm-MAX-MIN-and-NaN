/**
 Midterm Question 6
 CSC 255 Objects and Algorithms (Fall 2020)
 Oakton Community College
 Professor: Dr. Hector Hernandez

 @file MaxNumbers.java
 @author Russell Taylor
 @date 7/13/20
 
 Based on a provided program stub
 "Complete the Java program such that it will display, in hex, the 
  representations used for java.lang.Float.MIN_VALUE, java.lang.Float.MAX_VALUE, 
  and java.lang.Float.Nan"
*/

//import java.util.*;
//import java.lang.*;

class MaxNumbers
{

    public static void main(String[] args)
    {
    	System.out.println("Min value = " + Float.toHexString(Float.MIN_VALUE));
    	System.out.println("Max value = " + Float.toHexString(Float.MAX_VALUE));
    	System.out.println("NaN value = " + Float.toHexString(0f/0f));
    }
}