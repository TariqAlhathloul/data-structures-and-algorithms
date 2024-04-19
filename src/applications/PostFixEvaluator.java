package applications;
import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluator {
        public static int evaluatePostfix(String expression) {
            Stack<Integer> stack = new Stack<>();
            String[] tokens = expression.split(" ");

            for (String token : tokens) {
                if (isNumeric(token)) {
                    stack.push(Integer.parseInt(token));
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    int result = performOperation(operand1, operand2, token);
                    stack.push(result);
                }
            }

            return stack.pop();
        }

        private static boolean isNumeric(String str) {
            return str.matches("-?\\d+");
        }

        private static int performOperation(int operand1, int operand2, String operator) {
            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return operand1 / operand2;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter postfix expression (each operand and operator separated by space):");
            String postfixExpression = scanner.nextLine();

            try {
                int result = evaluatePostfix(postfixExpression);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
