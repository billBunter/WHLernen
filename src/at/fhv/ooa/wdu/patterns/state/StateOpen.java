package at.fhv.ooa.wdu.patterns.state;

public class StateOpen implements FileState {

    @Override
    public String readFile(String parth) {
        return "File at parth: " + parth + "is being read";
    }
}
