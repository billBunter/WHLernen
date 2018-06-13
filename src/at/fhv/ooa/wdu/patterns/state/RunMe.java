package at.fhv.ooa.wdu.patterns.state;

public class RunMe {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("C:/parth...");
        System.out.println(fileHandler.readFile());
        fileHandler.closeFile();
        System.out.println(fileHandler.readFile());
    }

}
