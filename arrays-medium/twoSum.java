class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int val = target - a;
            if(map.containsKey(val)) {
                ans[0] = map.get(val);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
