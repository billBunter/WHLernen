package wdu.baume.uevier;

import wdu.baume.BinarieTree;

public class SequenzZuVerkettung {

    public static void main(String[] args) {

        char[] sequnz1 = {4,7,1,3,9,0,2,3,6,8};
        int[] sequnz2 = {1,2,3,4,5,6,7,8,9,10};


        BinarieTree tree = new BinarieTree();
        tree.insertSequnz(sequnz2);

        tree.proOroder();

        System.out.println("blablabal");

    }



}
