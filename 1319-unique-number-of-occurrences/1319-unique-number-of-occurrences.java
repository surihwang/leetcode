class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] occur = new int[2001];
        boolean[] v = new boolean[2001];
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            i = (i <= 0) ? i * -1 : i + 1000;
            occur[i]++;
            set.add(i);
        }

        for (int i : set) {
            if (v[occur[i]]) return false;
            v[occur[i]] = true;
        }
        return true;
    }
}