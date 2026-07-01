class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.size() == 3) {
                Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();

                while (it.hasNext()) {
                    Map.Entry<Integer, Integer> entry = it.next();

                    entry.setValue(entry.getValue() - 1);

                    if (entry.getValue() == 0) {
                        it.remove();
                    }
                }
            }
        }

        List<Integer> res = new ArrayList<>(map.keySet());
        List<Integer> ans = new ArrayList<>();

        for (int candidate : res) {
            int count = 0;

            for (int n : nums) {
                if (n == candidate) {
                    count++;
                }
            }

            if (count > nums.length / 3) {
                ans.add(candidate);
            }
        }

        return ans;
    }
}