package at.fhv.ooa.wdu.patterns.observer;

import java.util.List;

public class SumObserver extends Observer {
    @Override
    public void update(DataSubject ds) {
        double sum = 0;
        List<Integer> data = ds.getData();
        for (Integer i : data){
            sum = sum + i;
        }
        ds.setSum(sum);
    }
}
