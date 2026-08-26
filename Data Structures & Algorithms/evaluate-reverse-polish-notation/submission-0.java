/*class Solution {
    public int evalRPN(String[] tokens) {
        
    }
}*/
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(apply(a, b, token));
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private int apply(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // truncates toward zero, matches problem spec
            default: throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }
}
