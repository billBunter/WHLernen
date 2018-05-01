package wdu.baume;

public class Node<T> {

    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;
    private T data;
    private int depth;
    private boolean markiert = false;

    public Node(T data){
        this.data = data;
        depth = -1;
    }

    public Node(T data, Node<T> parent){
        this.data = data;
        this.parent = parent;
        depth = -1;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean getMarkiert(){
        return markiert;
    }

    public void setMarkiert(boolean b){
        markiert = b;
    }

    @Override
    public String toString(){
        return data.toString();
    }
}