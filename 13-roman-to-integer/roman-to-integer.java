class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dictionary = new HashMap<>();
        int sum = 0;
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int currentValue = dictionary.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int nextValue = dictionary.get(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    sum -= currentValue;
                } else {
                    sum += currentValue;
                }
            } else {
                sum += currentValue;
            }
        }

        return sum;
    }
}