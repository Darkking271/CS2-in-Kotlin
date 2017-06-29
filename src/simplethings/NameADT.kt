package simplethings

/**
 * Created by Alex on 6/23/2017.
 */
interface NameADT{
    fun first() : String
    fun last() : String
    fun natural() : String
    fun formal() : String
    fun initials() : String
    fun check(fi : String, li : String) : Boolean
}
