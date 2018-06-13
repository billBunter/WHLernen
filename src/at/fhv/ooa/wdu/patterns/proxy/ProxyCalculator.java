package at.fhv.ooa.wdu.patterns.proxy;

public class ProxyCalculator implements Calculator {
//This class is a spacessaver for the huge class 'RealCalculator' which should only be created if needed!

    private RealCalculator calculator;

    public ProxyCalculator (){
    }

    @Override
    public int calculate(int numOne, int numTwo) {
        //real class gets created if not yet
        if (calculator == null){
            calculator = new RealCalculator();
        }
        //gets used
        int returnInt = calculator.calculate(numOne,numTwo);
        //and gets deleted
        calculator = null;
        //value is returned
        return returnInt;
    }
}
