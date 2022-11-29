package day34_GarbageCollection_AccessModifiers;

public class MyCalculatorVersion1 {
    public int plus(int n1, int n2) {
        return n1 + n2;
    }
    public int minus(int n1, int n2) {
        return n1 - n2;
    }
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
    public int divide(int n1, int n2) {
        return n1 - n2;
    }
}

class TestVersion1 {
    public static void main(String[] args) {
        MyCalculatorVersion1 a = new MyCalculatorVersion1();
        System.out.println(a.plus(2, 3));
        System.out.println(a.minus(2, 3));
        System.out.println(a.multiply(2, 3));
        System.out.println(a.divide(2, 3));
    }
}
/*
Task-2
version 1: without instance variables and no setInfo method
Create a "MyCalculator" class that has instance methods which can do simple math operations on two numbers.
The methods are: plus, minus, multiply and divide.
All the methods get two ints then the method does the required math operation and returns the result as an int.

In version one we just have instance methods with parameters (actions) no attributes of the class

 */