public class CalculateContext {
    private CalculateStrategy strategy;

    public CalculateContext(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.calculate(num1,num2);
    }
}
