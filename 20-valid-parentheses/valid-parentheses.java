class Solution {
    public boolean isValid(String s) {
        Stack<Character> paraenthesis = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='['||c=='{'){
                paraenthesis.push(c);
            }
            else{
                if(paraenthesis.isEmpty()){
                    return false;
                }
                char top = paraenthesis.pop();
                 if(c==')' && top!='('){
                    return false;
                }
                if(c==']' && top!='['){
                    return false;
                }
                if(c=='}' && top!='{'){
                    return false;
                }
            }

        }
        return paraenthesis.isEmpty();
    }
}