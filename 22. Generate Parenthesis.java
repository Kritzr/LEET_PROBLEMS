class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stack = new StringBuilder();

        backtrack(0,0,n,result,stack);
        return result;
    }

    private void backtrack(int open, int close, int n, List<String> result, StringBuilder stack){
        if(open == close && open ==n ){
            result.add(stack.toString());
            return;
        }

        if(open<n){
            stack.append('(');
            backtrack(open+1, close, n, result, stack);
            stack.deleteCharAt(stack.length()-1);
        }

        if(close<open){
            stack.append(')');
            backtrack(open, close+1, n, result,stack);
            stack.deleteCharAt(stack.length()-1);
        }
    }
}
