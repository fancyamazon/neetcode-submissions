class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let nondup = new Set(nums);
        return nondup.size != nums.length;
    }
}
