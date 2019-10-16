class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int size = nums.length;
        HashMap<Integer, Integer> hash_map = new HashMap();
        for (int i = 0; i < size; i++) {
            int b = target - nums[i];
            if (hash_map.containsKey(b) && i != hash_map.get(b)) {
                ans[0] = i;
                ans[1] = hash_map.get(b);
                break;
            }
            hash_map.put(nums[i], i);
        }
        return ans;
    }
}