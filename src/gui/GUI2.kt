package gui

import javax.swing.*

/**
 * Created by Alex on 6/24/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI2())
}

private class ThreadForGUI2 : Runnable{
    override fun run(){
        var gui = GUI2()
    }
}

class GUI2{
    val fram = KFrame2("GUI 2")
}

class KFrame2(title : String) : JFrame(title){
    init {
        setSize(500, 300)
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
    }
}