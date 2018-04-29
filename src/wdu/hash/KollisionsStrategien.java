package wdu.hash;

import java.util.Map;

public class KollisionsStrategien{

    private final static double c1 = 0.5;
    private final static double c2 = 1.5;
    private static int[] hashTable = new int[13];

    private static int hashFunktion(int key, int value){
        int i = 0;
        int hash = ((3*key)+2)%13;
        int tryes = 1;
        while (!insert(hash, value) && tryes < hashTable.length){
            i++;
            tryes++;
            hash = (int)(hash + i*c1 + i*c2)%13;
        }
        System.out.print(i+1 +", Waren die anzahl der versuche -- ");
        return hash;
    }

    private static boolean insert(int key, int value){
//        System.out.println(key);
        if (hashTable[key] == 0){
            hashTable[key] = value;
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int[] ints = {12,56,47,89,31,82,10,11,45,48,15,19,19};
        ints = insertionSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]+",");
        }
        if (false){
            for (int i = 0; i < ints.length; i++) {
                System.out.println(hashFunktion(ints[i],ints[i]));
            }
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println(hashTable[i] + ",");
            }
        }
    }

    private static int[] insertionSort(int[] ints){
        for (int i = 1; i < ints.length; i++) {
            int x = ints[i];
            int j = i;
            while (j > 0 && ints[j-1] > x){
                 ints[j] = ints[j-1];
                 j--;
            }
            ints[j] = x;
        }
        return ints;
    }

}




