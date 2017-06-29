package trees

import trees.BinaryTreeCreationException
import trees.BinaryTree

/**
 * Created by Alex on 6/26/2017.
 */
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
        t.addLR("lion", null, "")
        t.addLR("shark", null, "r")
        t.addLR("elephant", null, "l")
        t.addLR("zebra", null, "rr")
        t.addLR("alligator", null, "ll")
        t.addLR("ardvaark", null, "llr")
        t.addLR("tiger", null, "rrl")
        t.addLR("giraffe", null, "lr")
        t.addLR("bear", null, "rrll")
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
    t.addST("lion", null)
    t.addST("shark", null)
    t.addST("elephant", null)
    t.addST("zebra", null)
    t.addST("alligator", null)
    t.addST("ardvaark", null)
    t.addST("tiger", null)
    t.addST("giraffe", null)
    t.addST("bear", null)
    t.addST("snake", null)
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
    t.addND("lion", null)
    t.addND("shark", null)
    t.addND("elephant", null)
    t.addND("zebra", null)
    t.addND("alligator", null)
    t.addND("ardvaark", null)
    t.addND("tiger", null)
    t.addND("giraffe", null)
    t.addND("bear", null)
    t.addND("snake", null)
    println(">>> PREORDER")
    t.preorder()
    println(">>> INORDER")
    t.inorder()
    println(">>> POSTORDER")
    t.postorder()
    println(">>> HEIGHT = ${t.height()}\n")
}