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
        Scanner scanner = new Scanner(System.in);
        float num1, num2, ans;
        int choose = 0;
        System.out.println("請輸入第一個浮點數字:");
        num1 = scanner.nextFloat();
        System.out.println("請輸入第二個浮點數字:");
        num2 = scanner.nextFloat();
        System.out.println("請擇一： 1)+ 2)- 3)* 4)/");
        choose=scanner.nextInt();
        switch (choose) {
            case 1:
                ans = num1 + num2;
                System.out.println("ans:" + ans);
                break;
            case 2:
                ans = num1 - num2;
                System.out.println("ans:" + ans);
                break;
            case 3:
                ans = num1 * num2;
                System.out.println("ans:" + ans);
                break;
            case 4:
                if (num2 != 0) {
                    ans = num1 / num2;
                    System.out.println("ans:" + ans);
                } else {
                    System.out.println("error!!分母不能為零");
                }
                break;
            default:
                System.out.println("error!");
        }
    }

}
