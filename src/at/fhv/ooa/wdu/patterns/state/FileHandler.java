package at.fhv.ooa.wdu.patterns.state;

public class FileHandler {

    private File myFile;


    public FileHandler(String parth){
        myFile = new File(parth);
        openFile();
    }

    public void closeFile(){
        myFile.setState(new StateClosed());
    }

    public void openFile(){
        myFile.setState(new StateOpen());
    }

    public String readFile(){
        return myFile.read();
    }


}
