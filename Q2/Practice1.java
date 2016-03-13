/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author fsa
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int year=0,month=0,day=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入姓名:");
        InputStreamReader is = new InputStreamReader(System.in,"Big5");
        BufferedReader in = new BufferedReader(is);
        String name = in.readLine();
       // String name = scanner.nextLine();
        System.out.println("請輸入生日year:");
        year = scanner.nextInt();
         System.out.println("請輸入生日month:");
        month = scanner.nextInt();
         System.out.println("請輸入生日day:");
        day = scanner.nextInt();
        System.out.println(name + " " + (year-1911)+"."+month+"."+day);
    }

}