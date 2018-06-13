package at.fhv.ooa.wdu.patterns.memento;

public class RunMe {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("red");
        System.out.println(originator.getState());
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("blue");
        System.out.println(originator.getState());
        careTaker.addMemento(originator.saveStateToMemento());
        Memento m = careTaker.getMemento(0);
        if (m != null){
            originator.restoreStateFromMemento(m);
        }
        System.out.println(originator.getState());
        }

}
