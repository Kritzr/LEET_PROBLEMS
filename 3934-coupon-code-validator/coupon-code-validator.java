class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Integer> ans = new ArrayList<>();
        Set<String> buss  =  new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));

        for(int i=0; i<code.length; i++){
            if(isActive[i] && buss.contains(businessLine[i])&& check(code[i])){
                ans.add(i);
            }
        }

        ans.sort((i,j)->{
            int compare = businessLine[i].compareTo(businessLine[j]);
            if(compare!=0){
                return compare;
            }

        
            return code[i].compareTo(code[j]);
        });

        List<String> result = new ArrayList<>();
        for(int i:ans){
            result.add(code[i]);
        }

        return result;

    }

    public boolean check(String str){
        if(str.isEmpty()){
            return false;
        }

        for(char c:str.toCharArray()){
            if(!Character.isLetterOrDigit(c) && c!='_'){
                return false;
            }
        }

        return true;
    }
}