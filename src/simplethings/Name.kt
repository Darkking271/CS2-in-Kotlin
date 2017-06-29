package simplethings

/**
 * Created by Alex on 6/23/2017.
 */
class Name(private var first : String, private var last : String) : NameADT{

    override fun first() : String{
        return first
    }
    override fun last() : String{
        return last
    }
    override fun natural() : String{
        return "$first $last"
    }
    override fun formal() : String{
        return "$last $first"
    }
    override fun initials() : String{
        return "${first[0]}${last[0]}"
    }
    override fun check(fi: String, li: String): Boolean {
        return fi.equals("${first[0]}") && li.equals("${last[0]}")
    }
    override fun toString() : String{
        return "$first $last"
    }
}
