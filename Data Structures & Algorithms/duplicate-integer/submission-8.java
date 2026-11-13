class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nondup = new TreeSet<>();
        for(int nxt : nums) nondup.add(nxt);
        return nondup.size() != nums.length;
    }
}