package trees

/**
 * Created by Alex on 6/25/2017.
 */
class BinaryTreeCreationException : Exception {
    //Creates instance of the binary tree without detail message
    constructor() {}

    //Creates instance of the binary tree with specified detail message
    constructor(msg: String) : super(msg) {}
}