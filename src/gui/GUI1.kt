package gui

import javax.swing.*

/**
 * Created by Alex on 6/24/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI1())
}

private class ThreadForGUI1 : Runnable{
    override fun run(){
        val gui = GUI1()
    }
}

class GUI1{
    init{
        val frame = JFrame("GUI 1")
        frame.setSize(500, 300)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.isVisible = true
    }
}