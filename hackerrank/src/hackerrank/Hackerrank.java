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
    public void stockMaximize(Solution loesung) {
        
//        Function Description
//          Complete the stockmax function in the editor below. It must return an integer that represents the maximum profit achievable.
//          stockmax has the following parameter(s):
//          prices: an array of integers that represent predicted daily stock prices

//        int[] prices = new int[3];
        int[] testcase1 = new int[3];
        testcase1[0] = 5;
        testcase1[1] = 3;
        testcase1[2] = 2;
        
        int[] testcase2 = new int[3];
        testcase2[0] = 1;
        testcase2[1] = 2;
        testcase2[2] = 100;
        
        int[] testcase3 = new int[4];
        testcase3[0] = 1;
        testcase3[1] = 3;
        testcase3[2] = 1;
        testcase3[3] = 2;
        
        int ergebnis = loesung.stockMaximize(testcase3);
        System.out.println("Loesung stockMaximize: " + ergebnis);
    }
}

