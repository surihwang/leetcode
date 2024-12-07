class Solution {
    public int maxOperations(int[] nums, int k) {
        int r = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (i >= k)
                continue;
            if (!map.containsKey(i))
                map.put(i, 1);
            else {
                map.put(i, map.get(i) + 1);
            }
        }

        TreeSet<Integer> keys = new TreeSet<>(map.keySet());

        for (int key : keys) {
            if (!map.containsKey(k - key))
                continue;
            if (key == (k - key)) {
                r += map.get(key) / 2;
            } else {
                r += Math.min(map.get(key), map.get(k - key));
                map.remove(key);
                map.remove(k - key);
            }
        }

        return r;
    }
}