class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long[] times = new long[n];

        for (int j = 0; j < m; j++) {
            long start_time = 0;
            for (int i = 0; i < n; i++) {
                start_time =Math.max(start_time, times[i]) + (long) skill[i] * mana[j];
            }
            times[n - 1] =start_time;
            for (int i =n - 2; i >= 0; i--) {
                times[i] =times[i + 1] -(long) skill[i + 1] * mana[j];
            }
        }
        return times[n - 1];
    }
}
