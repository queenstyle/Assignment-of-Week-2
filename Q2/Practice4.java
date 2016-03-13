/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice4;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author fsa
 */
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0, temp = 0, find = 0;
        String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入幾個學生:");
        num = sc.nextInt();
        String namearray[] = new String[num];
        for (int i = 0; i < num; i++) {
            namearray[i] = new String();
        }
        int n[] = new int[num];
        int grade[] = new int[num];
        for (int a = 0; a < num; a++) {
            System.out.println("請輸入第" + (a + 1) + "學生姓名:");
            name = sc.next();
            while (true) {
                System.out.println("請輸入第" + (a + 1) + "學生成績:");
                try {
                    temp = sc.nextInt();
                    if (temp >= 0 && temp <= 100) {
                        namearray[a] = name;
                        grade[a] = temp;
                        n[a] = a + 1;
                        break;
                    } else {
                        System.out.println("成績格式有誤!");
                    }
                } catch (Exception e) {
                    System.out.println("成績格式有誤!" + e);
                    break;
                }
            }
        }
        while(true)
        {
        int check=0;
        System.out.println("請輸入要搜尋的編碼:");
        find = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if ((find - 1) == n[i]) {
                System.out.println("編號:" + find + " 姓名:" + namearray[i] + " 成績" + grade[i]);
                check=1;
                break;
            }
        }
        if(check==0)
        {
            System.out.println("沒有此編號!!!");
            continue;
        }
        break;
    }
    }
}
