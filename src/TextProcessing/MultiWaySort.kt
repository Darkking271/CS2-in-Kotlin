package TextProcessing

import javax.swing.JFileChooser
import java.util.*
import java.io.*
import kotlin.collections.ArrayList

/**
 * Created by Alex on 6/28/2017.
 */
fun main(args: Array<String>){
    val words = initialOrder()
    val pass1 = pass1(words)
    pass2(pass1)
}

private fun initialOrder() : ArrayList<String>{
    val words = getFile()
    displayInitialOrder(words)
    return words
}

@Throws(FileNotFoundException::class)
private fun getFile() : ArrayList<String>{
    val homedir = "${System.getProperty("user.dir")}" +
            "${File.separator}Text Documents"
    val jfc = JFileChooser(File(homedir))
    jfc.showOpenDialog(null)
    val file = jfc.selectedFile
    val scanner = Scanner(file)
    val words = getWords(scanner)
    return words
}

private fun getWords(scanner : Scanner) : ArrayList<String>{
    val words = ArrayList<String>()
    while(scanner.hasNext()){
        words.add(scanner.next().toLowerCase())
    }
    return words
}

private fun displayInitialOrder(words : ArrayList<String>){
    println("Initial Order:")
    for (i in 0..words.size - 1){
        print("${words[i]} ")
        if ((i + 1) % 10 == 0)
            println()
    }
    println("\n")
}

private fun pass1(words : ArrayList<String>) : LinkedList<String>{
    val vowels = sortVowels(words)
    displayPass1(vowels)
    println()
    val betweenPass = transferQueues(vowels)
    displayList("Words sorted by vowel count: ", betweenPass)
    return betweenPass
}

private fun sortVowels(words : ArrayList<String>) : ArrayList<Queue<String>>{
    val vowels = createEmptyVowelQueues(words)
    for (s in words){
        var vowelCount = vowelCount(s.toLowerCase())
        vowels[vowelCount].add(s)
    }
    return vowels
}

private fun createEmptyVowelQueues(words : ArrayList<String>) : ArrayList<Queue<String>>{
    val vowels = ArrayList<Queue<String>>()
    var queue : Queue<String>
    val hiVowel = highestVowelCount(words)
    for (i in 0..hiVowel + 1){
        queue = LinkedList<String>()
        vowels.add(queue)
    }
    return vowels
}

private fun highestVowelCount(words : ArrayList<String>) : Int{
    var most = 0
    var vowel : Int
    var letter : Char

    for (s in words){
        vowel = 0
        for (i in 0..s.length - 1){
            letter = s[i].toLowerCase()
            if (testVowel(letter))
                vowel++
        }
        if (vowel > most)
            most = vowel
    }
    return most - 1
}

private fun testVowel(i : Char) : Boolean = (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')

private fun vowelCount(s : String) : Int{
    val count = (0..s.length - 1).count { testVowel(s[it].toLowerCase()) }
    return count
}

private fun displayPass1(vowels : ArrayList<Queue<String>>){
    println("Pass 1:")
    for (i in 0..vowels.size - 1){
        println("${i + 1} vowels: [ ")
        displayQueue(vowels[i])
        println("]")
    }
}

private fun displayQueue(queue : Queue<String>){
    var copy = LinkedList(queue)
    for (i in 0..copy.size - 1){
        print("${copy.remove()} ")
        if ((i + 1) % 10 == 0)
            println()
    }
}

private fun transferQueues(words : ArrayList<Queue<String>>) : LinkedList<String>{
    val transferList = LinkedList<String>()
    var copy : Queue<String>
    for (i in words){
        copy = LinkedList(i)
        for (e in 0..copy.size - 1){
            transferList.add(copy.remove())
        }
    }
    return transferList
}

private fun displayList(text : String, betweenPass : LinkedList<String>){
    println(text)
    for (i in 0..betweenPass.size - 1){
        print("${betweenPass[i]} ")
        if ((i + 1) % 10 == 0)
            println()
    }
}

private fun pass2(pass1 : LinkedList<String>){
    val letters = sortLetters(pass1)
    displayPass2(letters)
    println()
    val finalPass = transferQueues(letters)
    displayList("Words sorted by vowel count and letter count: ", finalPass)
    println("\n")
}

private fun displayPass2(letters : ArrayList<Queue<String>>){
    println("\n\nPass 2:")
    for (i in 0..letters.size - 1){
        println("${i + 1} letters: [")
        var queue = letters[i]
        displayQueue(queue)
        println("]")
    }
}

private fun createEmptyLetterQueues(pass1 : LinkedList<String>) : ArrayList<Queue<String>>{
    val letters = ArrayList<Queue<String>>()
    var queue : Queue<String>
    var hiLetter = highestLetterCount(pass1)
    for (i in 0..hiLetter){
        queue = LinkedList()
        letters.add(queue)
    }
    return letters
}

private fun highestLetterCount(pass1 : LinkedList<String>) : Int{
    var most = 0
    for (s in pass1){
        if (s.length > most)
            most = s.length
    }
    return most
}

private fun sortLetters(pass1 : LinkedList<String>) : ArrayList<Queue<String>>{
    val letters = createEmptyLetterQueues(pass1)
    for (s in pass1){
        letters[s.length - 1].add(s.toLowerCase())
    }
    return letters
}