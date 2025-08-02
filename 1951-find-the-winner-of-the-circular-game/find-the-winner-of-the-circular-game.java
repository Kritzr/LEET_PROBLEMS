class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            list.add(i+1);
        }
        ArrayList<Integer> killings = new ArrayList<>();

        int answer = Josephus(list, 0, k, killings);
        System.out.println(killings);
        return answer;
    }

    public int Josephus(ArrayList<Integer> list, int curr, int k, ArrayList<Integer> killings){
            
            if(list.size()==1){
                return list.get(0);
            }

            int delete = (curr + k-1)% list.size();
            killings.add(list.remove(delete));
            return Josephus(list, delete, k, killings);
          
            
    }
}