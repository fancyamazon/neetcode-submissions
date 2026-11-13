class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        var mp = {};
        for(var i = 0; i < nums.length; i++) {
            var comp = target - nums[i];

            if(comp in mp) {
                return [mp[comp], i];
            }

            mp[nums[i]]=i;
        }
    }
}
