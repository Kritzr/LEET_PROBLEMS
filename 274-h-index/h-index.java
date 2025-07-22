class Solution {
    public int hIndex(int[] citations) {
        List<Integer> arr = new ArrayList<>(citations.length);
        for (int citation : citations) {
            arr.add(citation);
        }
        Collections.sort(arr, Collections.reverseOrder());
        int h = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= i + 1) {
                h = i + 1;
            } 
            else {
                break;
            }
        }
        return h;
    }
}