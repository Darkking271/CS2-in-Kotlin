package frames

import java.awt.*
import java.awt.event.*
import javax.swing.*
import utilities.Random
import javax.swing.border.Border

/**
 * Created by Alex on 6/25/2017.
 */
class KFrame8(title : String) : JFrame(title), ActionListener {
    var output = JTextArea()
    var pointButton = JButton("Point")
    var lineButton = JButton("Line")
    var wordButton = JButton("Word")
    var quoteButton = JButton("Quote")
    var colorButton = JButton("Color")
    var clearButton = JButton("Clear")
    var input = JTextField()
    var gen = Random()

    init {
        setSize(500, 600)
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

        when (event.actionCommand.toUpperCase()){
            "POINT" -> newLine(gen.point(500, 600))
            "LINE" -> newLine(gen.line(500, 600))
            "WORD" -> newLine(gen.word())
            "QUOTE" -> newLine(gen.quote())
            "COLOR" -> output.background = gen.color()
            "CLEAR" ->{output.text = ""
                        output.background = Color.WHITE}
        }
    }

    private fun newLine(line : String){
        output.append("$line\n")
    }
}