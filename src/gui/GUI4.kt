package gui

import java.awt.*
import javax.swing.*

/**
 * Created by Alex on 6/24/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI4())
}

private class ThreadForGUI4 : Runnable{
    override fun run(){
        val gui = GUI4()
    }
}

class GUI4(){
    val frame = KFrame4("GUI 4")
}

class KFrame4(title : String) : JFrame(title){
    init {
        setSize(500, 300)
        defaultCloseOperation = EXIT_ON_CLOSE
        addComponents(contentPane)
        isVisible = true
    }

    private fun addComponents(contentPane : Container){
        val blueButton = JButton("Blue")
        val redButton = JButton("Red")
        val greenButton = JButton("Green")
        val yellowButton = JButton("Yellow")
        val colorLabel = JLabel("Press a button...",
                SwingConstants.CENTER)
        contentPane.layout = BorderLayout()
        contentPane.add(blueButton, BorderLayout.NORTH)
        contentPane.add(redButton, BorderLayout.SOUTH)
        contentPane.add(greenButton, BorderLayout.EAST)
        contentPane.add(yellowButton, BorderLayout.WEST)
        contentPane.add(colorLabel, BorderLayout.CENTER)
    }
}
