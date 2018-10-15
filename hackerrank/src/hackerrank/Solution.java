/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import jdk.nashorn.internal.objects.NativeArray;
/**
 *
 * @author Benutzer1
 */
public class Solution {
    
    public Solution() {
    }

    // create a new Method for each soliution inside this class
    public int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] result = new int [grades[0]];
        
        // Iterate trough each grade 
        for(int i = 1; i < (grades[0]+1); i++)
        {
            if(grades[i] >= 38)
            {
                if(grades[i]%5>=3)
                {   
                    System.out.println("Ergebnis des Modulo");
                    grades[i] =  grades[i]+(5-(grades[i]%5));
                }
            }
            result[i-1] = grades[i];
        }
        
        return result;
    }
    
    public int stockMaximize(int[] prices) {
        int result = 0;
        
        return result;
    }
}
