class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            list.add(i+1);
        }

        int answer = Josephus(list, 0, k);
        return answer;
    }

    public int Josephus(ArrayList<Integer> list, int curr, int k){
            if(list.size()==1){
                return list.get(0);
            }

            int delete = (curr + k-1)% list.size();
            list.remove(delete);
            int answer = Josephus(list, delete, k);
            return answer;
            
    }
}