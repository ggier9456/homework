package com.train




fun main(args:Array<String>) {

    var num: Int = 0
    var num1: Int = 0
    var rnum: Int = 0
    var rnum1: Int = 0

    while (num != -1) {
        println("Please enter number of tickets: ")
        num = readLine()!!.toInt();
        num1 = num1 + num
        if (num == -1) {
            println("close down.")
            val tic = Ticket(num1, rnum1)
            tic.print()
        } else {
            println("How many round-trip tickets: ")
            rnum = readLine()!!.toInt();
            rnum1 = rnum1 + rnum
        }
        if(rnum1>num1){
            println("Your number of round-trip tickets can't exceed your tickets\nPlz return again.")
            rnum=0
            num1=0
            rnum1=0
        }else{
            val tic = Ticket(num1, rnum1)
            tic.print()
        }
    }
}
class Ticket(var num:Int,var rnum:Int) {
    fun print() {
        println("tickets:"+num+"\n"+"round trip: "+rnum+"\n"+"total" + ((num - rnum) * 1000 + (rnum * 0.9 * 2000)))
    }
}