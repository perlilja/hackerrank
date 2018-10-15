/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;

/**
 *
 * @author Benutzer1
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hackerrank h = new Hackerrank();
        Solution loesung = new Solution();
        // initialize your new task here
        h.gradingStudents(loesung);
    }
    
    // create the task inside a new method here
    public void gradingStudents(Solution loesung) {
        int[] grades = new int[5];
        
        grades[0] = 4;      
        grades[1] = 73;
        grades[2] = 67;
        grades[3] = 38;
        grades[4] = 33;
        
        int[] ergebnis = loesung.gradingStudents(grades);
        
        for(int i =  0; i < (grades[0]); i++)
        {
            System.out.println(ergebnis[i]);
        }
    }
}

