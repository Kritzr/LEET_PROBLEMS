import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Long> result = new LinkedList<>();

        for (int num_int : nums) {
            long num = num_int;
            
            while (!result.isEmpty() && findGCD(result.getLast(), num) > 1) {
                
                long last = result.removeLast();
                num = (last * num) / findGCD(last, num);
            }
           
            result.addLast(num);
        }
        
        
        List<Integer> finalResult = new ArrayList<>();
        for (long l : result) {
            finalResult.add((int) l);
        }
        return finalResult;
    }

    public long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
