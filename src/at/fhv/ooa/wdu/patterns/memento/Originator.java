package at.fhv.ooa.wdu.patterns.memento;

public class Originator {

    private String state;

    public Originator(String state){
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}