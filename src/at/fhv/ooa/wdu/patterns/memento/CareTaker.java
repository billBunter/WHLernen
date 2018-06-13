package at.fhv.ooa.wdu.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList;

    public CareTaker (){
        mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int i){
        if (mementoList.size() <= i){
            return null;
        }
        return mementoList.get(i);
    }

}
