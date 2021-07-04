package com.train

import java.util.*


fun main(args:Array<String>) {
    val sca =Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val num=sca.nextInt()
    println("How many round-trip tickets: ")
    val rnum=sca.nextInt()
    val tic =Ticket(num,rnum)
    tic.print()
}



class Ticket(var num:Int,var rnum:Int) {
    fun print() {
        println("tickets:"+num+"\n"+"round trip: "+rnum+"\n"+"total" + ((num - rnum) * 1000 + (rnum * 0.9 * 2000)))
    }
}