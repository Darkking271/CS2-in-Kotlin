package Testers

import simplethings.Name

/**
 * Created by Alex on 6/23/2017.
 */
fun main(args : Array<String>){

    var n = Name("Cleo", "White")
    println("First Name = ${n.first()}")
    println("Last Name = ${n.last()}")
    println("Natural Name = ${n.natural()}")
    println("Formal Name = ${n.formal()}")

    if (n.check("C", "W"))
        println("Initials of ${n.natural()} are CW")
    else
        println("Initials of ${n.natural()} are not CW")

    if (n.check("W", "C"))
        println("Initials of ${n.natural()} are WC")
    else
        println("Initials of ${n.natural()} are not WC")
}