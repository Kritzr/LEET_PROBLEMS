class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        fizzbuzz(ans, n, 1);
        return ans;
    }

    public void fizzbuzz(List<String> ans, int n, int i) {
        if (i > n) {
            return;
        }

        String current = "";
        if (i % 3 == 0) {
            current += "Fizz";
        }
        if (i % 5 == 0) {
            current += "Buzz";
        }
        if (current.isEmpty()) {
            current = Integer.toString(i);
        }

        ans.add(current); 

        fizzbuzz(ans, n, i + 1); 
    }
}