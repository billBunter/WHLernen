package at.fhv.ooa.wdu.patterns.proxy;

public class RunMe {

    public static void main(String[] args) {
        ProxyCalculator pCalculator = new ProxyCalculator();
        int result = pCalculator.calculate(5,1);
        System.out.println(result);
    }

}
