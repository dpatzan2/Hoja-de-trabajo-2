package consoleui;

import interfaces.PostfixEvaluator;
import model.Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleUI implements PostfixEvaluator {

    public void show() {
        try {
            String filePath = "src/datos.txt";
            File file = new File(filePath);

            if (!file.exists()) {
                System.err.println("El archivo no existe: " + file.getAbsolutePath());
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                int result = evaluatePostfix(line);
                System.out.println("Resultado para '" + line + "': " + result);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int operandB = stack.pop();
                int operandA = stack.pop();
                int result = performOperation(token, operandA, operandB);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private int performOperation(String operator, int operandA, int operandB) {
        switch (operator) {
            case "+":
                return operandA + operandB;
            case "-":
                return operandA - operandB;
            case "*":
                return operandA * operandB;
            case "/":
                if (operandB == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operandA / operandB;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operator);
        }
    }
}
