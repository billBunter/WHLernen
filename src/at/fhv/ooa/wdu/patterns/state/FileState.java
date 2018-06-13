package at.fhv.ooa.wdu.patterns.state;

public interface FileState {
//can also be abstract if some states have the same behaviour they would be implemented here.

    String readFile(String parth);

}
