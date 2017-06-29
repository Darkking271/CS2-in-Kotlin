package gui

import java.awt.*
import java.awt.event.*
import javax.swing.*

/**
 * Created by darki on 6/24/2017.
 */
fun main(args : Array<String>){
    SwingUtilities.invokeLater(ThreadForGUI5())
}

private class ThreadForGUI5 : Runnable{
    override fun run(){
        val GUI5 = GUI5()
    }
}

class GUI5{
    val frame = KFrame5("GUI 5")
}

class KFrame5(title : String) : JFrame(title), ActionListener{
    var blueButton = JButton("Blue")
    var redButton = JButton("Red")
    var greenButton = JButton("Green")
    var yellowButton = JButton("Yello")
    var reflector = JPanel()

    init{
        setSize(500, 300)
        defaultCloseOperation = EXIT_ON_CLOSE
        addComponents(contentPane)
        addListeners()
        isVisible = true
    }

    fun addComponents(contentPane : Container){
        contentPane.layout = BorderLayout()
        contentPane.add(blueButton, BorderLayout.NORTH)
        contentPane.add(redButton, BorderLayout.SOUTH)
        contentPane.add(greenButton, BorderLayout.EAST)
        contentPane.add(yellowButton, BorderLayout.WEST)
        contentPane.add(reflector, BorderLayout.CENTER)
    }

    fun addListeners(){
        blueButton.addActionListener(this)
        redButton.addActionListener(this)
        greenButton.addActionListener(this)
        yellowButton.addActionListener(this)
    }

    override fun actionPerformed(event : ActionEvent){
        var command = event.actionCommand
        if (command == "Red")
            reflector.background = Color.RED
        else if (command == "Yellow")
            reflector.background = Color.YELLOW
        else if (command == "Blue")
            reflector.background = Color.BLUE
        else if (command == "Green")
            reflector.background = Color.GREEN
    }
}