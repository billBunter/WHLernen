package wdu.baume;

import wdu.baume.uevier.Order;

public class BinarieTree {

    private Node root;
    private int depth;
    private int amountNodes;

    public BinarieTree(){
        this.depth = 0;
        this.amountNodes = 0;
    }

    public void insertNode(Node newNode){
        if (root == null){
            root = newNode;
            root.setDepth(0);
            this.amountNodes = 1;
        } else {
            Node cur = root;
            boolean inserted = false;
            while (!inserted){
                if (goLeft(amountNodes+1, cur.getDepth())){
                    if (cur.getLeft() == null){
                        inserted = insertNode(cur, newNode, true, getDepthOfPos(amountNodes+1));
                    } else {
                        cur = cur.getLeft();
                    }
                } else {
                    if (cur.getRight() == null){
                        inserted = insertNode(cur, newNode, false, getDepthOfPos(amountNodes+1));
                    } else {
                        cur = cur.getRight();
                    }
                }
            }
        }
    }

    public void insertSequnz(int[] intArr){
        for (int i = 0; i < intArr.length; i++) {
            Node newNode = new Node(intArr[i]);
            insertNode(newNode);
        }
        System.out.println("Insert hase been done.");
    }

    public void printTree(Order order){
        if (order == Order.IN){
            inOrderRecursiv(root);
        } else if (order == Order.POST) {
            postOrderRecursiv(root);
        } else {
            preOrderRekursiv(root);
        }
    }

    private void postOrderRecursiv(Node t){
        if (t != null){
            postOrderRecursiv(t.getLeft());
            postOrderRecursiv(t.getRight());
            System.out.print(t.toString()+",");
        }
    }

    private void inOrderRecursiv(Node t){
        if (t != null){
            inOrderRecursiv(t.getLeft());
            System.out.print(t.toString()+",");
            inOrderRecursiv(t.getRight());
        }
    }

    private void preOrderRekursiv(Node t){
        if (t != null){
            System.out.print(t.toString()+",");
            preOrderRekursiv(t.getLeft());
            preOrderRekursiv(t.getRight());
        }
    }

    private boolean insertNode(Node cur, Node newNode, boolean isLeft, int depth) {
        if (isLeft){
            cur.setLeft(newNode);
        } else {
            cur.setRight(newNode);
        }
        newNode.setParent(cur);
        newNode.setDepth(depth);
        this.depth = depth;
        this.amountNodes++;
        return true;
    }

    private boolean goLeft(int pos, int depth){
        int depthOfPos = getDepthOfPos(pos);
        while (depth + 1 != depthOfPos){
            pos = pos / 2;
            depthOfPos--;
        }
        return pos % 2 == 0;
    }

    private int getDepthOfPos(int pos){
        int depth = 0;
        while (pos / 2 >= 1){
            depth++;
            pos = pos / 2;
        }
        return depth;
    }
}
