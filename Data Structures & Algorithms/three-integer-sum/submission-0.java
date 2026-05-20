class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> res1 = new ArrayList<>();
                    res1.add(nums[i]);
                    res1.add(nums[j]);
                    res1.add(nums[k]);
                    res.add(res1);

                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }

                    while(j < k && nums[k] == nums[k-1]) {
                        k--;
                    }
                    j++;
                    k--;

                } else if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}
