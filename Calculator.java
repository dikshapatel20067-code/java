import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter your operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter your second number ");
        double secondNumber = scanner.nextDouble();

        double result=0;
        boolean validOperator = true;
        

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        
    }
}