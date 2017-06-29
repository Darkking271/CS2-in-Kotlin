package gui

import java.awt.*
import javax.swing.*

/**
 * Created by Alex on 6/24/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI3())
}

private class ThreadForGUI3 : Runnable{
    override fun run(){
        val gui = GUI3()
    }
}

class GUI3{
    val frame = KFrame3("GUI 3")
}

class KFrame3(title : String) : JFrame(title){
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
        val colorLabel = JLabel("Press a button...")
        contentPane.layout = FlowLayout()
        contentPane.add(blueButton)
        contentPane.add(redButton)
        contentPane.add(greenButton)
        contentPane.add(yellowButton)
        contentPane.add(colorLabel)
    }
}