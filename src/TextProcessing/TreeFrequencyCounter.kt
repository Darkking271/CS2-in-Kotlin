package TextProcessing

import java.io.*
import java.util.*
import trees.*
import javax.swing.JFileChooser
import kotlin.collections.ArrayList

/**
 * Created by Alex on 6/29/2017.
 */
@Throws(FileNotFoundException::class)
fun main(args : Array<String>){
    val words = getFileWords()
    val tree = createTree(words)
    tree.inorder()
}

@Throws(FileNotFoundException::class)
private fun getFileWords() : ArrayList<String>{
    val homedir = "${System.getProperty("user.dir")}${File.separator}" +
            "Text Documents"
    val jfc = JFileChooser(File(homedir))
    jfc.showOpenDialog(null)
    val file = jfc.selectedFile
    val words = getWords(file)
    return words
}

private fun getWords(file : File) : ArrayList<String>{
    val scanner = Scanner(file)
    val words = ArrayList<String>()
    while (scanner.hasNext())
        words.add(scanner.next().toLowerCase())
    return words
}

@Throws(BinaryTreeCreationException::class)
private fun createTree(words : ArrayList<String>) : BinaryTree<String, Int>{
    val tree = BinaryTree<String, Int>()
    for (s in words){
        if (tree.member(s)){
            var node = tree.find(s)
            node?.value = node?.value!!.plus(1)
        }
        else
            tree.addST(s, 1)
    }
    return tree
}
