import wdu.baume.BinarieTree;
import wdu.baume.uevier.Order;

public class Main {

    public static void main(String[] args) {

        if (false){
            int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            BinarieTree tree = new BinarieTree();
            tree.insertSequnz(ints);
            System.out.print("PostOrder:\t");
            tree.printTree(Order.POST);
            System.out.print("\nInOrder:\t");
            tree.printTree(Order.IN);
            System.out.print("\nPreOrder:\t");
            tree.printTree(Order.PRE);
            System.out.print("\nTiefensuche:\t");
            tree.dieSucheInDerTiefe();
        }


        int[] arr = {6,95,2,1,23,45,88,4,99};
        for (int i: arr){
            System.out.print(i + ", ");
        }
        Sorter s = new Sorter(arr);
        System.out.println("\nSortieren!!\n");
        for (int i: arr){
            System.out.print(i + ", ");
        }

    }

    private static class Sorter{
        private int[] arr;
        private int length;


        public Sorter(int[] arr){
            sort(arr);
        }
        private void sort(int[] ints){
            arr = ints;
            length = arr.length;
            qickSort(0, length-1);
        }
        private void qickSort(int low, int high){
            int lowI = low;
            int highI = high;
            int pivot = arr[low + (high - low)/2];
            while (lowI <= highI){
                while (arr[lowI] < pivot){
                    lowI++;
                }
                while (arr[highI] > pivot){
                    highI--;
                }
                if (lowI <= highI){
                    swap(lowI, highI);
                    highI--;
                    lowI++;
                }
            }
            if (low < highI){
                qickSort(low, highI);
            }
            if (high > lowI){
                qickSort(lowI,high);
            }
        }
        private void swap(int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
    }

}
