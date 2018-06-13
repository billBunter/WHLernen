package at.fhv.ooa.wdu.patterns.state;

public class StateClosed implements FileState {

    @Override
    public String readFile(String parth) {
        //throw FileClosed error
        return "error!!! File is closed";
    }
}
