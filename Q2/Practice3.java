/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice3;
import java.util.Scanner;


/**
 *
 * @author fsa
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year=0,check1=0,check2=0;
        Scanner sc=new Scanner(System.in);
         System.out.println("請輸入一個西元的年份:");
        year=sc.nextInt();
         System.out.println("閏年:");
        for(int i=1;i<=year;i++)
        {
            check1=0;
            check2=0;
        if((i%400)==0)
            check1=1;
        if((i%4)==0 && (i%100)!=0)
            check2=1;
        if(check1==1 || check2==1)
            System.out.println("西元："+i);
            }  
    }
    
}
