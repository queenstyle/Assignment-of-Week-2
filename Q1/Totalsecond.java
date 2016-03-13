/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalsecond;

/**
 *
 * @author fsa
 */
public class Totalsecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int time1[]={4,23,45};
        int time2[]={13,54,23};
        int total1,total2;
        total1=time1[0]*60*60+time1[1]*60+time1[2];
        total2=time2[0]*60*60+time2[1]*60+time2[2];
        System.out.println("total second :"+(total2-total1));
    }
    
}
