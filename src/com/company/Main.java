package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hinhhoc hinhhoc = new Hinhhoc();
        Hinhhoc[] hs = new Hinhhoc[3];
        hs[0] = new Circle(5);
        hs[1] = new Rec(10,15);
        hs[2] = new Square(5);
        System.out.println("luc dau");
        for (int i = 0; i < hs.length; i++) {
            System.out.println(hs[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao so bat ki");
        double percents = scanner.nextDouble();
        System.out.println("sau khi thay doi");
        for (int i = 0; i < hs.length; i++) {
            ((Resize)hs[i]).resize(percents);
            System.out.println(hs[i]);
        }
    }
}



