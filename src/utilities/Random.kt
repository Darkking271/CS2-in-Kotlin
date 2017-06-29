package utilities

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.awt.*

/**
 * Created by Alex on 6/25/2017.
 */
class Random{
    var quote = arrayOfNulls<String>(10)
    var word = arrayOfNulls<String>(10)

    init {
        quote[0]= "You must be the change you wish to see in the world. " +
                "--  Mahatma Gandhi"
        quote[1] = "Focus is a matter of deciding what things you're not going to do." +
                "  --  John Carmack"
        quote[2] = "Injustice anywhere is a threat to justice everytwhere." +
                "  --  Martin Luther King Jr"
        quote[3] = "Never tell me the odds." +
                "  --  Han Solo"
        quote[4] = "When I left you, I was but the learner. Now I'm the master." +
                "  --  Darth Vader"
        quote[5] = "Have no fear of perfection, you'll never reach it" +
                "  --  Salvador Dali"
        quote[6] = "Make your own demons." +
                "  --  Tony Stark"
        quote[7] = "Winter is coming." +
                "  --  Ned Stark"
        quote[8] = "I don't want to fix the wheel, I want to break the wheel!" +
                "  --  Daenerys Targaryen"
        quote[9] = "If I say I'm dead, then I am. I'm not going to raise by balding head" +
                " on a beach in ten\nyears' time, saying all is well." +
                "  --  Trevor Philips"
        word[0] = "Coffee  ::  Fuel source for programmers and engineers"
        word[1] = "DOOM  ::  John Carmack's flesh and blood, literally"
        word[2] = "Python  ::  Computer language for quitters"
        word[3] = "Guitar  ::  Axe with strings"
        word[4] = "Router  ::  A friend who never leaves your side"
        word[5] = "Laptop  ::  The other friend who never leaves"
        word[6] = "Phone  ::  Brick with lights and buttons"
        word[7] = "Music  ::  A series of vibrations"
        word[8] = "Apple  ::  Removing ports because of courage"
        word[9] = "Netflix  ::  Just one more episode"
    }

    fun color() : Color{
        return Color(number(256), number(256), number(256))
    }

    fun point(x : Int, y : Int) : String{
        return "(${number(x)}, ${number(y)})"
    }

    fun line(x : Int, y : Int) : String{
        return "${number(x)} ${number(y)}"
    }

    fun word() : String{
        return "${word[number(10)]}"
    }

    fun quote() : String{
        return "${quote[number(10)]}"
    }

    fun number(x : Int) : Int = (Math.random() * x).toInt()
}
