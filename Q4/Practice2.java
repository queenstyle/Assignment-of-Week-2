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
        int num = 0, choose = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入幾個圖形:");
        num = sc.nextInt();
        Shape shape[] = new Shape[num];
        for (int i = 0; i < num; i++) {
            System.out.print("1)圓形2)矩形3)橢圓形4)三角形-1)exit:");
            choose = sc.nextInt();
            if (choose == 1) {
                double r = 0;
                System.out.println("圓的半徑:");
                r = sc.nextDouble();
                shape[i] = new Circle(r);
            }
            if (choose == 2) {
                double a = 0, b = 0;
                System.out.println("矩形的長:");
                a = sc.nextDouble();
                System.out.println("矩形的寬:");
                b = sc.nextDouble();
                shape[i] = new Rectangle(a, b);
            }
            if (choose == 3) {
                double rs = 0, rl = 0;
                System.out.println("橢圓形的短邊:");
                rs = sc.nextDouble();
                System.out.println("橢圓形的長邊:");
                rl = sc.nextDouble();
                shape[i] = new Oval(rs, rl);
            }
            if (choose == 4) {
                double b, h;
                System.out.println("三角形的底:");
                b = sc.nextDouble();
                System.out.println("三角形的高:");
                h = sc.nextDouble();
            }
            if (choose == -1) {
                break;
            }
        }
        for (int i = 0; i < num; i++) {
            shape[i].show();
        }
    }
}

abstract class Shape {

    abstract double area();

    abstract void show();
}

class Circle extends Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }

    @Override
    void show() {
        System.out.println("圓形:" + this.area());
    }
}

class Rectangle extends Shape {

    double width, height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    void show() {
        System.out.println("矩形:" + this.area());
    }
}

class Oval extends Shape {

    double ra;
    double rb;

    public Oval(double a, double b) {
        ra = a;
        rb = b;
    }

    @Override
    double area() {
        return 3.14 * ra * rb;
    }

    @Override
    void show() {
        System.out.println("橢圓形:" + this.area());
    }
}

class Triangle extends Shape {

    double botton, hieght;

    public Triangle(double a, double b) {
        botton = a;
        hieght = b;
    }

    double area() {
        return botton * hieght / 2;
    }

    @Override
    void show() {
        System.out.println("三角形:" + this.area());
    }
}
