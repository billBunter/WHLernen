import wdu.baume.BinarieTree;
import wdu.baume.uevier.Order;

public class Main {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        BinarieTree tree = new BinarieTree();
        tree.insertSequnz(ints);
        System.out.print("PostOrder:\t");
        tree.printTree(Order.POST);
        System.out.print("\nInOrder:\t");
        tree.printTree(Order.IN);
        System.out.print("\nPreOrder:\t");
        tree.printTree(Order.PRE);
    }

}
