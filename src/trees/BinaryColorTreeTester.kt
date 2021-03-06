package trees

import trees.BinaryTree
import trees.BinaryTreeCreationException

/**
* Created by Alex on 6/28/2017.
*/
@Throws(BinaryTreeCreationException::class)
fun main(args : Array<String>){
    testLR()
    testST()
    testND()
    testND()
}

private fun testLR(){
    println("Test LR...")
    val t = BinaryTree<String, String?>()
    println(">>> Creating empty tree.")
    println(">>> Adding elements to the tree directionally ...")
    try {
        t.addLR("Red", null, "")
        t.addLR("Blue", null, "l")
        t.addLR("Green", null, "lr")
        t.addLR("Black", null, "ll")
        t.addLR("White", null, "r")
        t.addLR("Purple", null, "lrr")
        t.addLR("Yellow", null, "rr")
        t.addLR("Orange", null, "lrrl")
        t.addLR("Indigo", null, "lrrll")
        t.addLR("Aqua", null, "lll")
        t.addLR("Tangerine", null, "rl")
        t.addLR("Pink", null, "lrrlr")
        t.addLR("Ghostwhite", null, "lrl")
        t.addLR("Gray", null, "lrlr")
        t.addLR("Brown", null, "lrll")
        t.addLR("Gainsboro", null, "lrllr")
    }catch (e : BinaryTreeCreationException){
        e.printStackTrace()
    }
    println(">>> PREORDER")
    t.preorder()
    println(">>> INORDER")
    t.inorder()
    println(">>> POSTORDER")
    t.postorder()
    println(">>> HEIGHT = ${t.height()}\n")
}

private fun testST(){
    println("Test BST...")
    val t = BinaryTree<String, String?>()
    println(">>> Creating empty tree.")
    println(">>> Adding elements to the bindary search tree...")
    t.addST("Red", null)
    t.addST("Blue", null)
    t.addST("Green", null)
    t.addST("Black", null)
    t.addST("White", null)
    t.addST("Purple", null)
    t.addST("Yellow", null)
    t.addST("Orange", null)
    t.addST("Indigo", null)
    t.addST("Aqua", null)
    t.addST("Tangerine", null)
    t.addST("Pink", null)
    t.addST("Ghostwhite", null)
    t.addST("Gray", null)
    t.addST("Brown", null)
    t.addST("Gainsboro", null)
    println(">>> PREORDER")
    t.preorder()
    println(">>> INORDER")
    t.inorder()
    println(">>> POSTORDER")
    t.postorder()
    println(">>> HEIGHT = ${t.height()}\n")

}

private fun testND(){
    println("Test ND...")
    val t = BinaryTree<String, String?>()
    println(">>> Creating empty tree.")
    println(">>> Adding elements to the tree nondeterministacally")
    t.addND("Red", null)
    t.addND("Blue", null)
    t.addND("Green", null)
    t.addND("Black", null)
    t.addND("White", null)
    t.addND("Purple", null)
    t.addND("Yellow", null)
    t.addND("Orange", null)
    t.addND("Indigo", null)
    t.addND("Aqua", null)
    t.addND("Tangerine", null)
    t.addND("Pink", null)
    t.addND("Ghostwhite", null)
    t.addND("Gray", null)
    t.addND("Brown", null)
    t.addND("Brown", null)
    println(">>> PREORDER")
    t.preorder()
    println(">>> INORDER")
    t.inorder()
    println(">>> POSTORDER")
    t.postorder()
    println(">>> HEIGHT = ${t.height()}\n")

}

