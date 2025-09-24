/**
 * A simple Hello World program demonstrating basic Java syntax
 * This program prints greetings and demonstrates basic input/output
 */
public class HelloWorld {
    public static void main(String[] args) {
        // Print a simple greeting
        System.out.println("Hello, World!");
        System.out.println("Welcome to the Java Projects Repository!");
        
        // Demonstrate variables and basic operations
        String name = "Java Developer";
        int year = 2024;
        double version = 21.0;
        
        System.out.println("Hello, " + name + "!");
        System.out.println("Current year: " + year);
        System.out.println("Java version: " + version);
        
        // Simple calculation
        int a = 10;
        int b = 20;
        int sum = a + b;
        
        System.out.println(a + " + " + b + " = " + sum);
        
        // Demonstrate basic control structure
        if (sum > 25) {
            System.out.println("Sum is greater than 25");
        } else {
            System.out.println("Sum is 25 or less");
        }
        
        // Simple loop example
        System.out.println("Counting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        System.out.println("Program execution completed successfully!");
    }
}