class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> answer1 = new HashSet<>();
        Set<Integer> answer2 = new HashSet<>();
        for (int i : nums1) {
            answer1.add(i);
        }
        for (int i : nums2) {
            answer2.add(i);
        }

        for (int i : nums1) {
            if (answer2.contains(i)) {
                answer1.remove(i);
                answer2.remove(i);
            }
        }

        answer.add(new ArrayList<>(answer1));
        answer.add(new ArrayList<>(answer2));

        return answer;
    }
}