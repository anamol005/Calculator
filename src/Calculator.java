public class Calculator {
    private int currentValue;
// Add a positive integer to the current value.
// Throw an exception if the number is negative.
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        currentValue += number;
    }

    // Get the current value.
    public int getCurrentValue() {
        return currentValue;
    }

    public void reset() {
        currentValue = 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);

        System.out.println("Current value: " + calculator.getCurrentValue());

        calculator.reset();

        System.out.println("After reset: " + calculator.getCurrentValue());

        try {
            calculator.add(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}