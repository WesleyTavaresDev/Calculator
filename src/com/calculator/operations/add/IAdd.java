package src.com.calculator.operations.add;

public interface IAdd {
    
    public default double add(double a, double b) {
        return 0;
    }
}