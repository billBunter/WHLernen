package at.fhv.ooa.wdu.patterns.observer;

import java.util.LinkedList;

public class RunMe {

    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        for (int i = 1; i <= 21; i++){
            data.add(i);
        }
        DataSubject subject = new DataSubject();
        subject.setData(data);
        System.out.println(subject.getAvg());
        System.out.println(subject.getSum());
        data.add(100);
        subject.setData(data);
        System.out.println(subject.getAvg());
        System.out.println(subject.getSum());
    }

}
