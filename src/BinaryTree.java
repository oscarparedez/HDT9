
public class BinaryTree<E>{
    E valEsp;
    E valEng;
    BinaryTree<E> left;
    BinaryTree<E> right;

    public BinaryTree(E valEng,E valEsp){
        this.valEsp=valEsp;
        this.valEng=valEng;
    }

    public BinaryTree(E valEng,E valEsp,BinaryTree<E> left, BinaryTree<E> right){
        this.valEsp=valEsp;
        this.valEng=valEng;
        this.left=left;
        this.right=right;
    }

    E valEng(){
        return this.valEng;
    }

    E valEsp(){
        return this.valEsp;
    }

    BinaryTree<E> getLeft(){
        return this.left;
    }

    BinaryTree<E> getRight(){
        return this.right;
    }

    
    void setLeft(BinaryTree<E> newLeft){
        left=newLeft;
    }

    void setRight(BinaryTree<E> newRight){
        right=newRight;
    }


}