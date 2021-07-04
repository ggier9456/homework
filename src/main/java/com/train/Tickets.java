package com.train;


public class Tickets {
    int num;
    int rnum;

    public Tickets(int num, int rnum) {
        this.num = num;
        this.rnum = rnum;
    }

    public void print() {
        System.out.println("total tickets:" + num + "\n" + "round trip:" + rnum + "\n" + "total:" + ((num - rnum) * 1000 + (rnum * 0.9 * 2000)));

    }
}