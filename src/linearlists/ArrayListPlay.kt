package linearlists

import java.util.ArrayList
import simplethings.Name
import simplethings.Triangle

/**
 * Created by Alex on 6/25/2017.
 */
fun main(args : Array<String>){
    val songs =  createSongList()
    displayList("The songs...", songs)
    val actors = createActorList()
    displayList("The actors...", actors)
    val triangles = createTriangleList()
    displayList("The triangles...", triangles)

    displayLengths(songs)
    displayInitials(actors)
    displayAreas(triangles)
}

private fun createSongList() : ArrayList<String> {
    val songs = ArrayList<String>()
    songs.add("Happy")
    songs.add("Dog Days are Over")
    songs.add("Budapest")
    songs.add("Give Me Your Eyes")
    songs.add("Castle of Glass")
    songs.add("Heralds")
    songs.add("No Rest for the Wicked")
    songs.add("Death from Above")
    return songs
}

private fun createActorList() : ArrayList<Name>{
    val actors = ArrayList<Name>()
    actors.add(Name("Ryan", "Reynolds"))
    actors.add(Name("Hugh", "Jackman"))
    actors.add(Name("Zach", "Braff"))
    actors.add(Name("Bradley", "Cooper"))
    actors.add(Name("Halle", "Berry"))
    actors.add(Name("Kate", "Mara"))
    actors.add(Name("Kevin", "Spacey"))
    return actors
}

private fun createTriangleList() : ArrayList<Triangle>{
    val triangles = ArrayList<Triangle>()
    triangles.add(Triangle(30))
    triangles.add(Triangle(6, 12, 9))
    triangles.add(Triangle(3, 4, 5))
    triangles.add(Triangle(10))
    triangles.add(Triangle(12))
    triangles.add(Triangle(12, 13, 14))
    return triangles
}

private fun displayList(text : String, items : ArrayList<*>){
    println("$text")
    for (i in items)
        println(i)
    println()
}

private fun displayLengths(songs : ArrayList<String>){
    println("\nThe Song Lengths...")
    for (i in songs)
        println(i.length)
}

private fun displayInitials(actors : ArrayList<Name>){
    println("\nThe Initials...")
    for (i in actors)
        println(i.initials())
}

private fun displayAreas(triangles : ArrayList<Triangle>){
    println("\nThe Areas...")
    for (i in triangles)
        println(i.area())
}


