package simplethings

/**
 * Created by Alex on 6/23/2017.
 */
class Triangle : TriangleADT{

    private var sideOne : Double = 0.0
    private var sideTwo : Double = 0.0
    private var sideThree : Double = 0.0

    constructor(sides : Int){
        sideOne = sides.toDouble()
        sideTwo = sides.toDouble()
        sideThree = sides.toDouble()
    }
    constructor(side1 : Int, side2 : Int, side3 : Int){
        sideOne = side1.toDouble()
        sideTwo = side2.toDouble()
        sideThree = side3.toDouble()
    }

    override fun perimeter(): Double {
        return sideOne + sideTwo + sideThree
    }
    override fun area(): Double {
        var p = (sideOne + sideTwo + sideThree) / 2
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree))
    }
    override fun toString(): String {
        return "<Triangle with A = $sideOne, B = $sideTwo, C = $sideThree>"
    }
}
