package wdu.hash;

import java.util.Map;

public class KollisionsStrategien{

    private final static double c1 = 0.5;
    private final static double c2 = 1.5;
    private static int[] hashTable = new int[12];

    private static int hashFunktion(int key, int value){
        int i = 0;
        int hash = ((3*key)+2)%12;
        while (!insert(hash, value)){
            i++;
            hash = (int)(hash + i*c1 + i*c2)%12;
        }
        return hash;
    }

    private static boolean insert(int key, int value){
        if (hashTable[key] == 0){
            hashTable[key] = value;
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] ints = {12,56,47,89,31,82,10,11};

        for (int i = 0; i < ints.length; i++) {
            hashFunktion(ints[i],ints[i]);
        }
    }

}




