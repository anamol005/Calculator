# Calculator

## Introduction

This is a simple Java Calculator program.

It can add positive integers, reset the current value to zero, and return the current value.

The program also throws an exception when a negative number is added.

## Source Code

```java
public class Calculator {
    private int currentValue;

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        currentValue += number;
    }

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
```

## Explanation

Calculator is a simple class that keeps a running total.

- `currentValue` stores the total. It is private, so other classes cannot change it directly. Since it is an int and no starting value is assigned, Java initializes it to 0.
- `add(int number)` adds a number to the total. If the number is negative, it throws an IllegalArgumentException. Zero is allowed.
- `getCurrentValue()` returns the current total without changing it.
- `reset()` sets the total back to 0.
- Exception handling: In main, calculator.add(-5) throws an exception. The try/catch catches it and prints its message, so the program can handle invalid input instead of stopping unexpectedly.

For example, adding 10 and then 20 makes the total 30. Calling reset() makes it 0 again.