package TextProcessing

import java.util.*
import java.io.*
import kotlin.collections.ArrayList

/**
* Created by Alex on 6/28/2017.
*/
fun main(args : Array<String>){
    val input = Scanner(System.`in`)
    print("Lyrics or Poem?: ")
    var type = input.nextLine()
    type = type.toLowerCase()
    println()

    when (type){
        "lyrics" -> receiveFile("Flickering Flame.txt")
        "poem" -> receiveFile("The Wicked.txt")
    }
}

private fun receiveFile(link : String){
    val file = FileReader("${System.getProperty("user.dir")}" +
            "${File.separator}Text Documents${File.separator}$link")
    val reader = BufferedReader(file)

    var line = reader.readLine()
    var text = ""
    while (line != null){
        text += line
        line = reader.readLine()
    }

    var words = text.split(" ")
    var longest = longestWords(words)
    display(longest)
}

private fun longestWords(list : List<String>) : ArrayList<String> {
    var mean: Int
    var total = 0
    val longer = ArrayList<String>()

    for (s in list)
        total += s.length

    mean = total / list.size

    for (s in list) {
        if (s.length > mean)
            longer.add(s)
    }
    return longer
}

private fun display(list : ArrayList<String>){
    println("The longer words...\n")
    for (i in 0..list.size - 1){
        print("${list[i]} ")
        if ((i + 1) % 10 == 0)
            println()
    }
}
