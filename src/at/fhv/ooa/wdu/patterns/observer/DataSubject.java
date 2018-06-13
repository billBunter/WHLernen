package at.fhv.ooa.wdu.patterns.observer;

import java.util.*;

public class DataSubject {

    private double avg;
    private double sum;
    private List<Integer> data;
    private List<Observer> observerList;

    public DataSubject(){
        observerList = new LinkedList<>();
        observerList.add(new AvgObserver());
        observerList.add(new SumObserver());
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
        update();
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    private void update(){
        for (Observer o : observerList){
            o.update(this);
        }
    }
}
