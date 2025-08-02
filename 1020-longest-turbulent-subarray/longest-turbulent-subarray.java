class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int left = 0, right = 1; 
        int answer = 1; 
        String prev = "";
        while(right <arr.length){
            if(arr[right-1] > arr[right] && prev!=">"){
                answer = Math.max(answer, right-left+1);
                right++;
                prev = ">";
            }

            else if(arr[right-1] < arr[right] && prev!="<"){
                answer = Math.max(answer, right-left+1);
                right++;
                prev = "<";
            }

            else{
                if(arr[right]==arr[right-1]){
                    right++;
                }
                else {
                    right = right;
                }
                left = right -1; 
                prev = "=";

            }

        }

        return answer;
    }
}