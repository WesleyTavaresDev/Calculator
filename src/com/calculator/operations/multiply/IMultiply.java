package src.com.calculator.operations.multiply;

public interface IMultiply {
    
    public default double multiply(double a, double b) {
        return a * b;
    }

}