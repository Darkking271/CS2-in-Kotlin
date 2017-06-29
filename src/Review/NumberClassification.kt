package Review

import java.util.*

/**
 * Created by Alex on 6/23/2017.
 */
fun main(args : Array<String>){
    var generator = Random()
    var num: Int
    var count = 0
    var all = ""
    var odd = ""
    var even = ""
    var mixed = ""
    var pairs = ""

    num = generator.nextInt(900) + 100; count++

    while(count != 26){
        all += "$num "
        if (testOdd(num))
            odd += "$num "
        else if (testEven(num))
            even += "$num "
        else if (testMixed(num))
            mixed += "$num "
        else if (testPairs(num))
            pairs += "$num "

        num = generator.nextInt(900) + 100; count++
    }

    display("The numbers...", all)
    display("The odd digit numbers", odd)
    display("The even digit numbers",even)
    display("The mixed digit numbers", mixed)
    display("The pairs...", pairs)
}

fun testOdd(num : Int) : Boolean{
    val temp = Integer.toString(num)
    val digit = IntArray(3)

    for(i in 0..2)
        digit[i] = temp[i].toInt()

    return digit[0] % 2 != 0 && digit[1] % 2 != 0 && digit[2] % 2 != 0
}

fun testEven(num : Int) : Boolean{
    val temp = Integer.toString(num)
    val digit = IntArray(3)

    for (i in 0..2)
        digit[i] = temp[i].toInt()

    return digit[0] % 2 == 0 && digit[1] % 2 == 0 && digit[2] % 2 == 0
}

fun testMixed(num : Int) : Boolean{
    val temp = Integer.toString(num)
    val digit = IntArray(3)

    for (i in 0..2)
        digit[i] = temp[i].toInt()

    return digit[0] != digit[1] && digit[1] != digit[2] && digit[0] != digit[2]
}

fun testPairs(num : Int) : Boolean{
    val temp = Integer.toString(num)
    val digit = IntArray(3)

    for (i in 0..2)
        digit[i] = temp[i].toInt()

    return digit[0] == digit[1] || digit[1] == digit[2] || digit[0] == digit[2]
}

fun display(text : String, num : String){
    println("$text \n$num \n")
}