class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];

        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                int temp = hm.get(target-nums[i]);
                res[0] = Math.min(i,temp);
                res[1] = Math.max(i,temp);;
                return res;
            } else {
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
