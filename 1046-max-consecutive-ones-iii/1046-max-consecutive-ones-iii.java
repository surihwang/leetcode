class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, s = 0, zero = 0;

        for (int e = 0; e < nums.length; e++) {
            if (nums[e] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[s++] == 0) {
                    zero--;
                }
            }

            max = Math.max(max, e - s + 1);
        }
        return max;
    }
}