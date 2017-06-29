package gui

import frames.KFrame6
import javax.swing.SwingUtilities

/**
 * Created by Alex on 6/25/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI6())
}

private class ThreadForGUI6 : Runnable{
    override fun run() {
        val gui = GUI6()
    }
}

class GUI6{
    val fram = KFrame6("GUI6")
}