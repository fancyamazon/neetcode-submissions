class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> nondup; 
        for(int i : nums) nondup.insert(i);
        return nondup.size() != nums.size();
    }
};