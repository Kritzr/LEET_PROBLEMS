class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2-num1);
            }

            else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }

            else if (c.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2/num1);
            }

            else{
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.pop();
    }
}
