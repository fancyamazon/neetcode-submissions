class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}
        for i, num in enumerate(nums):
            comp = target - nums[i]

            if comp in mp:
                return [mp[comp], i]
            
            mp[num] = i
        