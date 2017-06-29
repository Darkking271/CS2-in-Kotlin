package Review

import java.util.*

/**
 * Created by darki on 6/23/2017.
 */
fun main(args : Array<String>){
    val input = Scanner(System.`in`)

    print("Enter a sentence:  ")
    val sent = input.nextLine()
    val word = longest(sent)

    println(word)
}

fun longest(sent : String) : String{
    var maxLength = 0
    var words = sent.split(" ")
    var longWord = ""

    for (i in words){
        if (i.length > maxLength){
            maxLength = i.length
            longWord = i
        }
    }
    return longWord
}
