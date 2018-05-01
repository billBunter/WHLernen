package wdu.patternmatching;

public class BoyerMoor {

    public static void main(String[] args) {
         String text = "abbadababacbdac";
         String pattern = "babac";
         int pos = boyerMoor(text,pattern);
        System.out.println(pos);
    }

    public static int boyerMoor(String text, String pattern){
        int[] shift = initShift(pattern);
        int textIndex = pattern.length();       //i
        int patternIndex = pattern.length();    //j
        while ((patternIndex > 0) && (textIndex <= text.length())){
            char pattChar = pattern.charAt(patternIndex-1);
            char textChar = text.charAt(textIndex -1);
            if (textChar == pattChar){
                textIndex--;
                patternIndex--;
            } else {
                int shiftValue = getShift(text.charAt(textIndex - 1), shift);
                textIndex = textIndex + shiftValue;
                patternIndex = pattern.length();
            }
        }
        return textIndex;
    }

    private static int[] initShift(String pattern) {
        int[] shift = new int[26];
        int value;
        for (int i = 0; i < shift.length; i++){
            shift[i] = pattern.length();
        }
        for (int i = 0; i < pattern.length(); i++) {
            value = getIntFromChar(pattern.charAt(i));
            shift[value] = pattern.length() - i - 1;
        }
        printArray(shift);
        return shift;
    }

    private static int getShift(char ch , int[] shift){
        int value;
        if ((int) ch > 96){                //Kleinbuchstabe
            value = (int) ch - 97;
        } else {
            value = (int) ch - 65;
        }
        return shift[value];
    }

    private static void printArray(int[] arr){
        int help = 65;
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)help + ": " + arr[i]);
            help++;
        }
    }

    private static int getIntFromChar(char ch){
        int value;
        if ((int) ch > 96){                //Kleinbuchstabe
            value = (int) ch - 97;
        } else {
            value = (int) ch - 65;
        }
        return value;
    }
}
