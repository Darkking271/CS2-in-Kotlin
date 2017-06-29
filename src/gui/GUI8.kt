package gui

import frames.KFrame8
import javax.swing.SwingUtilities

/**
 * Created by Alex on 6/25/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI())
}

private class ThreadForGUI : Runnable{
    override fun run(){
        val gui = GUI8()
    }
}

class GUI8{
    val frame = KFrame8("GUI 8")
}
