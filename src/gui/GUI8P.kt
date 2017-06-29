package gui

import frames.KFrame8p
import javax.swing.SwingUtilities

/**
 * Created by Alex on 6/25/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI8P())
}

private class ThreadForGUI8P : Runnable{
    override fun run(){
        val gui = GUI8P()
    }
}

class GUI8P(){
    val frame = KFrame8p("GUI 8P")
}