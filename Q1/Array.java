/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author fsa
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int array[]={1,2,3,4000,56,48,94,64,8};
     int total=0;
     double ave=0;
     for(int a:array)
     total+=a;
     System.out.println("total:"+total);
     ave=(double)total/array.length;
     System.out.println("ave:"+ave);
    }
    
}
