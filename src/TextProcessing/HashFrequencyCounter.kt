package TextProcessing

import java.util.*
import java.io.*
import javax.swing.JFileChooser
import kotlin.collections.HashMap

/**
 * Created by Alex on 6/29/2017.
 */
val wordFreq = HashMap<String, Int>()
val input = Scanner(System.`in`)

fun main(args : Array<String>){
    establishFrequencyCounts()
    dump()
    interpret()
}

@Throws(FileNotFoundException::class)
private fun establishFrequencyCounts(){
    val words = getFile()
    populateTable(words)
}

@Throws(FileNotFoundException::class)
private fun getFile(){
    val homedir = "${System.getProperty("user.dir")}${File.separator}" +
            "Text Documents"
    val jfc = JFileChooser(File(homedir))
    jfc.showOpenDialog(null)
}

