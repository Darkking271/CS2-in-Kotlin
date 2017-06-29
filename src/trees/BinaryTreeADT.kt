package trees

/**
 * Created by darki on 6/25/2017.
 */
interface BinaryTreeADT<K, V>{
    fun value() : V?
    fun empty() : Boolean
    fun height() : Int
    fun preorder()
    fun inorder()
    fun postorder()
    @Throws(BinaryTreeCreationException::class)
    fun addLR(key: K, value: V, dir: String)
    fun addND(key: K, value: V)
    @Throws(BinaryTreeCreationException::class)
    fun addST(key: K, value: V)
    operator fun get(key: K): V?
    fun find(key: K): BinaryTree<K, V>?
    fun member(key: K): Boolean
    fun visit()
    fun sprout(key: K, value: V)
}