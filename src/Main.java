public class Main {

    public static void main(String[] args) {
        CalculateContext context = new CalculateContext(new Add());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new CalculateContext(new Multiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }
}
