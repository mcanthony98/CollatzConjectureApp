/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatzconjectureapp;

import java.util.Scanner;

/**
 *
 * @author marc anthony
 */
public class CollatzConjectureApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int entry = in.nextInt();
        CollatzConjecture ent1 = new CollatzConjecture(entry);
    }
    
}
