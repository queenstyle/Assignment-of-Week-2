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
        int num = 0, find = 0;
        double rs=0, rl=0, pei=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入幾個橢圓:");
        num = sc.nextInt();
        Circle[] c = new Circle[num];
        for (int i = 0; i < num; i++) {
            System.out.println("第" + (i + 1) + "的短邊:");
            rs = sc.nextDouble();
            System.out.println("第" + (i + 1) + "的長邊:");
            rl = sc.nextDouble();
            c[i] = new Oval(rs, rl);
        }
        while (true) {
            System.out.println("請輸入編號:");
            find = sc.nextInt();
            if (find < 1 || find > num) {
                System.out.println("編號錯誤!");
            } else {
                pei=c[find-1].area();
                System.out.println("編號:" + find + "\n短邊:"+rs+"\n長邊:"+rl+ "\n面積:" + pei);
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

class Oval extends Circle {
    double rb;

    public Oval(double a, double b) {
        super(a);
        rb = b;
    }

    @Override
    double area() {
        return 3.14 * r * rb;
    }
}
