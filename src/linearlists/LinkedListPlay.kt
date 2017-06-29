package linearlists

import java.util.LinkedList
import java.text.DecimalFormat

/**
 * Created by darki on 6/25/2017.
 */
fun main(args : Array<String>){
    //Create lists
    val animals = createAnimalList()
    display("\nThe Animal Names...", animals)
    val reals = randomList(77)
    display("\nThe Real Numbers...", reals)

    //Use Lists
    val lengths = lengths(animals)
    display("\nThe lengths of animal names...", lengths)

    val reverseAnimals = reverse(animals)
    display("\nThe animals in reverse order", reverseAnimals)

    val min = minimum(reals)
    println("\nThe minimum number = $min")
    display("\nThe real numbers...", reals)

    val orderList = sort(reals)
    display("\nThe real numbers in ascending order...", orderList)
    display("\nThe real numbers...", reals)
}

fun createAnimalList() : LinkedList<String>{
    val animals = LinkedList<String>()
    //Predetermined Animals
    animals.add("Aardvark")
    animals.add("Bear")
    animals.add("Crocodile")
    animals.add("Dove")
    animals.add("Elephant")
    animals.add("Finch")
    animals.add("Giraffe")
    animals.add("Hyena")
    animals.add("Iguana")
    animals.add("Jackalope")
    animals.add("Bat")
    animals.add("Walrus")
    animals.add("Lobster")
    //My Animals
    animals.add("Lion")
    animals.add("Tiger")
    animals.add("Bison")
    animals.add("Woodpecker")
    animals.add("Panda")
    animals.add("Ox")
    animals.add("Yak")
    animals.add("Elk")
    animals.add("Bull")
    animals.add("Fox")
    return animals
}

fun randomList(x : Int) : LinkedList<Double>{
    val reals = LinkedList<Double>()
    val dec = DecimalFormat(".#")
    for (i in 0..x)
        reals.add((dec.format(Math.random() * 1000 / 10)).toDouble())
    return reals
}

fun lengths(animals : LinkedList<String>) : LinkedList<Int>{
    val lengths = animals.mapTo(LinkedList<Int>()) { it.length }
    return lengths
}

fun reverse(animals : LinkedList<String>) : LinkedList<String>{
    val reverseAnimals = (animals.size - 1 downTo 0).mapTo(LinkedList<String>()) { animals[it] }
    return reverseAnimals
}

fun minimum(reals : LinkedList<Double>) : Double{
    var min = 100.00
    for (i in reals){
        if (i < min)
            min = i
    }
    return min
}

fun sort(reals : LinkedList<Double>) : LinkedList<Double>{
    var copy = LinkedList<Double>(reals)
    if (copy.isEmpty())
        return copy

    val min = minimum(reals)
    copy.remove(min)
    copy = sort(copy)
    copy.addFirst(min)
    return copy
}

fun display(text : String, items : LinkedList<*>){
    print("$text\n<")
    for (i in 0..items.size - 1){
        print("${items[i]} ")
        if ((i + 1) % 10 == 0)
            println()
    }
    println(">")
}