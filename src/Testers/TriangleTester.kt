package Testers

import simplethings.Triangle

/**
 * Created by darki on 6/23/2017.
 */
fun main(args : Array<String>){
    var edward = Triangle(10)
    println(edward)

    var iris = Triangle(3, 4, 5)
    println(iris)

    println("Perimeter of edward = ${edward.perimeter()}")
    println("Perimeter of iris = ${iris.perimeter()}")
    println("Area of edward = ${edward.area()}")
    println("Area of iris = ${iris.area()}")
}
