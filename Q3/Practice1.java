/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author fsa
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0,find=0;
        double r,ac,arc,pei;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入幾個圓:");
        num = sc.nextInt();
        Circle[] c = new Circle[num];
        for (int i = 0; i < num; i++) {
            System.out.println("第" + (i + 1) + "的半徑:");
            r = sc.nextDouble();
            c[i] =new Circle(r);
        }
        while (true) {
            System.out.println("請輸入編號:");
            find=sc.nextInt();
            if(find<1 || find>num)
            {
                System.out.println("編號錯誤!");
                continue;
            }else
            {
            System.out.println("請輸入角度:");
            ac=sc.nextDouble();
            arc=c[find-1].Arc(ac);
            pei=c[find-1].Pie(ac);
            System.out.println("編號"+find+":\n弧長:"+arc+"\n面積:"+pei);
            break;
            }
        }
    }

}

class Circle {

    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }

    double Arc(double a) {
        return (2 * r * 3.14) * a / 360;
    }

    double Pie(double p) {
        return (r * r * 3.14) * p / 360;
    }
}
