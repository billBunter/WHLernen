package at.fhv.ooa.wdu.patterns.state;

public class File {

    private FileState state;
    private String parth;

    public File(String parth){
        this.parth = parth;
    }

    public String read(){
        return state.readFile(parth);
    }

    public void setState(FileState state){
        this.state = state;
    }

}
