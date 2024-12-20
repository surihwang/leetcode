class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, altitude = 0;
        for (int num : gain) {
            altitude += num;
            max = Math.max(max, altitude);
        }
        return max;
    }
}