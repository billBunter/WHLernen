package at.fhv.ooa.wdu.patterns.proxy;

public class RealCalculator implements Calculator {
//This class is soooooooo big it should only be created if needed!!

    @Override
    public int calculate(int numOne, int numTwo) {
        return numOne+numTwo;
    }
}
