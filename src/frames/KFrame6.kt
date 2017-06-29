package frames

import java.awt.*
import java.awt.event.*
import javax.swing.*

/**
 * Created by Alex on 6/25/2017.
 */
class KFrame6(title : String) : JFrame(title), ActionListener{
    private var blueButton = JButton("Blue")
    private var redButton = JButton("Red")
    private var greenButton = JButton("Green")
    private var yellowButton = JButton("Yellow")
    private var reflector = JPanel()

    init{
        setSize(500, 300)
        defaultCloseOperation = EXIT_ON_CLOSE
        addComponents(contentPane)
        addListener()
        isVisible = true
    }

    private fun addComponents(contentPane : Container){
        contentPane.layout = BorderLayout()
        contentPane.add(blueButton, BorderLayout.NORTH)
        contentPane.add(redButton, BorderLayout.SOUTH)
        contentPane.add(greenButton, BorderLayout.EAST)
        contentPane.add(yellowButton, BorderLayout.WEST)
        contentPane.add(reflector, BorderLayout.CENTER)
    }

    private fun addListener(){
        blueButton.addActionListener(this)
        redButton.addActionListener(this)
        greenButton.addActionListener(this)
        yellowButton.addActionListener(this)
    }

    override fun actionPerformed(event : ActionEvent) {
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