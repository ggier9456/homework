package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int num= sca.nextInt();
        System.out.println("How many round-trip tickets: ");
        int rnum=sca.nextInt();
        Tickets tic =new Tickets(num,rnum);
        tic.print();
    }
}
