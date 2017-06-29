package trees

/**
 * Created by Alex on 6/25/2017.
 */
class BinaryTree<K, V> : BinaryTreeADT<K, V>{
    private var key : K? = null
    private var value : V? = null
    private lateinit var lchild : BinaryTree<K, V>
    private lateinit var rchild : BinaryTree<K, V>

    override fun value() : V?{
        return value
    }

    override fun setValue(value : V) {
        this.value = value
    }

    override fun empty() : Boolean = key == null

    override fun height() : Int {
        if (empty())
            return 0
        else
            return 1 + max(lchild.height(), rchild.height())
    }

    private fun max(a : Int, b : Int) : Int{
        if (a > b)
            return a
        else return b
    }

    override fun preorder() {
        if (!empty()){
            visit()
            lchild.preorder()
            rchild.preorder()
        }
    }

    override fun inorder() {
        if (!empty()){
            lchild.inorder()
            visit()
            rchild.inorder()
        }
    }

    override fun postorder() {
        if (!empty()){
            lchild.postorder()
            rchild.postorder()
            visit()
        }
    }

    @Throws(BinaryTreeCreationException::class)
    override fun addLR(key : K, value : V, dir : String) {
        try{
            if (dir == "")
                sprout(key, value)
            else if (dir.substring(0, 1).toUpperCase() == "L")
                lchild.addLR(key, value, dir.substring(1))
            else if (dir.substring(0, 1).toUpperCase() == "R")
                rchild.addLR(key, value, dir.substring(1))
            else
                throw BinaryTreeCreationException("### strange directional indicator: ${dir.substring(0, 1)}")
        }catch (e : BinaryTreeCreationException){
            throw BinaryTreeCreationException("### no such location in the tree")
        }
    }

    override fun addND(key : K, value : V) {
        if (empty())
            sprout(key, value)
        else if (Math.random() < 0.5)
            lchild.addND(key, value)
        else
            rchild.addND(key, value)
    }

    @Throws(BinaryTreeCreationException::class)
    override fun addST(key : K, value : V) {
        if (empty())
            sprout(key, value)
        else{
            val cey = key as Comparable<K>
            val t = this.key as K
            if (cey < t)
                lchild.addST(key, value)
            else if (cey > t)
                rchild.addST(key, value)
        }
    }

    override fun get(key : K) : V? {
        val t = find(key)
        return t?.value
    }

    override fun find(key : K) : BinaryTree<K, V>? {
        if (empty())
            return null
        else if (this.key == key)
            return this
        else{
            val l = lchild.find(key)
            if (l != null)
                return l
            val r = rchild.find(key)
            if(r != null)
                return r
            return null
        }
    }

    override fun member(key : K) : Boolean {
        if (empty())
            return false
        else if (this.key == key)
            return true
        else
            return (lchild.member(key) || rchild.member(key))
    }

    override fun visit() {
        val rep : String
        if (value == null)
            rep = "--"
        else
            rep = value.toString()
        println("[${this.key}:$rep]")
    }

    override fun sprout(key: K, value: V) {
        this.key = key
        this.value = value
        this.lchild = BinaryTree<K, V>()
        this.rchild = BinaryTree<K, V>()
    }
}