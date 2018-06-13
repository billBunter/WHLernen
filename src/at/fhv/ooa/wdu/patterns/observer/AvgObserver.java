package at.fhv.ooa.wdu.patterns.observer;

import java.util.List;

public class AvgObserver extends Observer {
    @Override
    public void update(DataSubject ds) {
        double sum = calcSum(ds.getData());
        ds.setAvg(sum/ds.getData().size());
    }

    private double calcSum(List<Integer> data){
        double sum = 0;
        for (Integer i : data){
            sum = sum + i;
        }
        return sum;
    }
}
