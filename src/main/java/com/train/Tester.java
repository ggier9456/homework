package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num1=0;
        int rnum1= 0;
        int num = 0;
        int rnum =0;

        while (num != -1) {
            System.out.println("Please enter number of tickets: ");
            num = sca.nextInt();
            num1 =num1+num;
            if (num == -1) {
                System.out.println("close down.");
                Tickets tic = new Tickets(num1, rnum1);
                tic.print();
            } else{
                System.out.println("How many round-trip tickets: ");
                rnum = sca.nextInt();
                rnum1=rnum1+rnum;

            }
            if(rnum1>num1){
                System.out.println("Your number of round-trip tickets can't exceed your tickets\n Plz return again.");
                num1=0;
                rnum=0;
                rnum1=0;
            }
            else{
                Tickets tic = new Tickets(num1, rnum1);
                tic.print();
            }
        }
        }
    }
