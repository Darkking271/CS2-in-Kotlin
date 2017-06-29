package Review

/**
 * Created by Alex on 6/22/2017.
 */

import java.util.Scanner

fun main(args : Array<String>){
    var input = Scanner(System.`in`)
    var count = 0

    print("The Positive integer?   ")
    var num = input.nextInt()
    print("$num ")

    while (num != 1){
        if (num % 2 == 0){
            num /= 2
            print("$num ")
            count = format(count)
        }else{
            num = num * 3 + 1
            print("$num ")
            count = format(count)
        }
    }

}

fun format(count : Int) : Int{
    var num = count + 1
    if ((num + 1) % 10 == 0)
        println()
    return num

}
