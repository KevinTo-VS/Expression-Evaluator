package expressionevaluator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExpressionEvaluatorWithVariables {
    private static HashMap<String, Double> symbolTable = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Pattern pattern = Pattern.compile("[A-Z][A-Z0-9]*");

    public static void processCommand(String command) throws Exception {
        String[] parts = command.split("\\s+", 3);
        String operation = parts[0];

        switch (operation) {
            case "ACCEPT":
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid ACCEPT command");
                }
                acceptVariable(parts[1]);
                break;
            case "LET":
                if (parts.length != 3 || !parts[1].equals("=")) {
                    throw new IllegalArgumentException("Invalid LET command");
                }
                letExpression(parts[2], parts[0]);
                break;
            case "PRINT":
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid PRINT command");
                }
                printExpression(parts[1]);
                break;
            case "RUN":
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid RUN command");
                }
                runCommand(parts[1]);
                break;
            default:
                throw new IllegalArgumentException("Invalid command");
        }
    }

    private static boolean isValidVariableName(String name) {
        return pattern.matcher(name.toUpperCase()).matches();
    }

    private static void acceptVariable(String variable) {
        if (isValidVariableName(variable)) {
            System.out.print("Enter value for " + variable + ": ");
            double value = scanner.nextDouble();
            symbolTable.put(variable.toUpperCase(), value);
        } else {
            throw new IllegalArgumentException("Improper variable name " + variable);
        }
    }

    private static double evaluateExpression(String expression) {
      return 0;
    }

    private static void letExpression(String expression, String variable) {
        String varName = variable.substring(4).trim();
        if (isValidVariableName(varName)) {
            double result = evaluateExpression(expression);
            symbolTable.put(varName.toUpperCase(), result);
        } else {
            throw new IllegalArgumentException("Improper variable name in LET command");
        }
    }

    private static void printExpression(String expression) {
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    private static void runCommand(String lineNumber) throws Exception {
        
        throw new UnsupportedOperationException("RUN command not implemented yet");
    }

    public static void main(String[] args) {
        try {
            processCommand("ACCEPT CAT");
            processCommand("ACCEPT DOG");
            processCommand("LET AVERAGE = (CAT + DOG) / 2.0");
            processCommand("PRINT AVERAGE");
            processCommand("RUN 10"); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
