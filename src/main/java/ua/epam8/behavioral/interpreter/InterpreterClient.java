package ua.epam8.behavioral.interpreter;

import java.util.Stack;

public class InterpreterClient {
    public static void main(String[] args) {
        String postfix = "545+*";
        final String OPERATORS = "+-*/";
        Stack<Number> stack = new Stack<Number>();

        for(char c : postfix.toCharArray()) {
            Exp resultExp;
            if(OPERATORS.indexOf(c) == -1) {
                resultExp = new Number(c - 48);
            }
            else {
                Exp right = stack.pop();
                Exp left = stack.pop();

                switch (c) {
                    case '+':
                        resultExp = new AddExp(left, right);
                        break;
                    case '-':
                        resultExp = new SubstractExp(left, right);
                        break;
                    case '*':
                        resultExp = new MultiplyExp(left, right);
                        break;
                    case '/':
                        resultExp = new DivideExp(left, right);
                        break;
                    default:
                        resultExp = new Number(0);
                }
            }
            stack.push(new Number(resultExp.evaluate()));
        }
        System.out.println("Result: " + stack.pop().evaluate());
    }
}
