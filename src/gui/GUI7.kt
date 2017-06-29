package gui

import frames.KFrame7
import javax.swing.SwingUtilities

/**
 * Created by Alex on 6/25/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI7())
}

private class ThreadForGUI7 : Runnable{
    override fun run(){
        val gui = GUI7()
    }
}

class GUI7(){
    val frame = KFrame7("GUI 7")
}