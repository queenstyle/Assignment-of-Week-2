/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author fsa
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y, m, d;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年:");
        y = sc.nextInt();
        System.out.println("請輸入月:");
        m = sc.nextInt();
        System.out.println("請輸入日:");
        d = sc.nextInt();
        Date date = new Date(y, m, d);
        temp = date.check();
        if (temp == 1) {
            System.out.println("此格式正確:");
            System.out.println(y + "." + m + "." + d);
        } else {
            System.out.println("此格式錯誤:");
        }
    }

}

class Date {

    int year, month, day;

    Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public int check()//return 1是對的 return -1是錯的
    {
        if (year > 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 0 && day <= 31) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 0 && day <= 30) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (month == 2) {
                if (((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                    if (day <= 29 && day > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    if (day <= 28 && day > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
