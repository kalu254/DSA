package popular_problems.ReversePolishNotation;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static java.lang.String.valueOf;

public class ReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {


        Stack<String> tokenStack = new Stack<>();


        for (int i = 0; i < tokens.length; i++) {
            //check if its an operator and pop last two
            //perform operation on last two, push back stack

            String s = tokens[i];
            String op1;
            String op2;

            if (!tokenStack.isEmpty()) {

                if (s.equals("+")) {
                    op1 = tokenStack.pop();
                    op2 = tokenStack.pop();

                    tokenStack.push(String.valueOf(Integer.parseInt(op2) + Integer.parseInt(op1)));
                } else if (s.equals("-")) {
                    op1 = tokenStack.pop();
                    op2 = tokenStack.pop();
                    tokenStack.push(String.valueOf(Integer.parseInt(op2) - Integer.parseInt(op1)));
                }
                else if (s.equals("*")) {
                    op1 = tokenStack.pop();
                    op2 = tokenStack.pop();
                    tokenStack.push(String.valueOf(Integer.parseInt(op2) * Integer.parseInt(op1)));
                }else if (s.equals("/")) {
                    op1 = tokenStack.pop();
                    op2 = tokenStack.pop();
                    tokenStack.push(String.valueOf(Integer.parseInt(op2) / Integer.parseInt(op1)));
                }
                else{
                    tokenStack.push(s);
                }
            } else {
                tokenStack.push(s);
            }


        }

        return Integer.parseInt(tokenStack.pop());

    }

}
