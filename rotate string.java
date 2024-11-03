class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length()){
            String chance = s +s;
            return chance.contains(goal);
        }
        return false;
    }
}
