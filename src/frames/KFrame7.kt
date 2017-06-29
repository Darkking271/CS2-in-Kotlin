package frames

import java.awt.*
import java.awt.event.*
import javax.swing.*
import utilities.Random
import javax.swing.border.Border

/**
 * Created by Alex on 6/25/2017.
 */
class KFrame7(title : String) : JFrame(title), ActionListener{
    private var reflector = JPanel()
    private var blueButton = JButton("Blue")
    private var redButton = JButton("Red")
    private var greenButton = JButton("Green")
    private var yellowButton = JButton("Yellow")
    private var colorButton = JButton("Color")
    private var input = JTextField()
    private var gen = Random()

    init {
        setSize(500, 300)
        defaultCloseOperation = EXIT_ON_CLOSE
        addComponents(contentPane)
        addListeners()
        isVisible = true
    }

    private fun addComponents(contentPane : Container){
        var controlPanel = JPanel()
        controlPanel.layout = FlowLayout()
        controlPanel.add(blueButton)
        controlPanel.add(redButton)
        controlPanel.add(greenButton)
        controlPanel.add(yellowButton)
        controlPanel.add(colorButton)

        contentPane.layout = BorderLayout()
        contentPane.add(controlPanel, BorderLayout.NORTH)
        contentPane.add(reflector, BorderLayout.CENTER)
        contentPane.add(input, BorderLayout.SOUTH)
    }

    private fun addListeners(){
        blueButton.addActionListener(this)
        redButton.addActionListener(this)
        greenButton.addActionListener(this)
        yellowButton.addActionListener(this)
        colorButton.addActionListener(this)
        input.addActionListener(this)
    }

    override fun actionPerformed(event : ActionEvent){
        if (event.source is JTextField)
            input.text = ""

        when (event.actionCommand.toUpperCase()){
            "RED" -> reflector.background = Color.RED
            "YELLOW" -> reflector.background = Color.YELLOW
            "BLUE" -> reflector.background = Color.BLUE
            "GREEN" -> reflector.background = Color.GREEN
            "COLOR" -> reflector.background = gen.color()
        }
    }
}