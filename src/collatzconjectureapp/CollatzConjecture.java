/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatzconjectureapp;

/**
 *
 * @author marc anthony
 */
public class CollatzConjecture {
    private int num;
    private int count;
    
    public CollatzConjecture(int num){
        this.num = num;
        System.out.println("Steps to the result: ");
        compute();
        System.out.println("\nSteps count: " + count);
        
    }
    
    private void compute(){
        int i = 0;
        while(this.num != 1){
            System.out.print(num + ",");
            if(this.num%2 == 0){
                this.num=num/2;
            }else{
                this.num=(num*3)+1;
            }
            i++;
        }
        System.out.print("1");
        this.count = i;
    }
    
}
