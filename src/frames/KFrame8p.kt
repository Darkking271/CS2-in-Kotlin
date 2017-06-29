package frames

import java.awt.*
import java.awt.event.*
import javax.swing.*

/**
 * Created by Alex on 6/25/2017.
 */
class KFrame8p(title : String) : JFrame(title), ActionListener{
    private var output = JTextArea()
    private var pointButton = JButton("Point")
    private var lineButton = JButton("Line")
    private var wordButton = JButton("Word")
    private var quoteButton = JButton("Quote")
    private var colorButton = JButton("Color")
    private var clearButton = JButton("Clear")
    private var input = JTextField()

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
        controlPanel.add(pointButton)
        controlPanel.add(lineButton)
        controlPanel.add(wordButton)
        controlPanel.add(quoteButton)
        controlPanel.add(colorButton)
        controlPanel.add(clearButton)

        contentPane.layout = BorderLayout()
        contentPane.add(controlPanel, BorderLayout.NORTH)
        contentPane.add(output, BorderLayout.CENTER)
        contentPane.add(input, BorderLayout.SOUTH)
    }

    private fun addListeners(){
        pointButton.addActionListener(this)
        lineButton.addActionListener(this)
        wordButton.addActionListener(this)
        quoteButton.addActionListener(this)
        colorButton.addActionListener(this)
        clearButton.addActionListener(this)
        input.addActionListener(this)
    }

    override fun actionPerformed(event : ActionEvent){
        if (event.source is JTextField)
            input.text = ""

        when(event.actionCommand.toUpperCase()){
            "POINT" -> output.append("Point\n")
            "LINE" -> output.append("Line\n")
            "WORD" -> output.append("Word\n")
            "QUOTE" -> output.append("Quote\n")
            "COLOR" -> output.append("Color\n")
            "CLEAR" -> output.append("Clear\n")
            "CL" -> output.text = ""
        }
    }
}
