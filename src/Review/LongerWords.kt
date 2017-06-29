package Review

import java.util.*

/**
 * Created by Alex on 6/23/2017.
 */
fun main(args : Array<String>){
    var input = Scanner(System.`in`)

    print("Enter a Sentence:  ")
    var sent = input.nextLine()
    var words = longer(sent)

    println("The longer words...")
    println(words)
}

fun longer(sent : String) : String{
    var mean: Int
    var total = 0
    var longerWords = ""
    var word = sent.split(" ")

    for (i in word)
        total += i.length
    mean = total / word.size

    for (i in word){
        if (i.length > mean)
            longerWords += "$i\n"
    }
    return longerWords
}
