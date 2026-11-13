class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nondup = set(nums)
        print(nondup)
        return len(nondup) != len(nums)
        