class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = {}
        for i, val in enumerate(strs):
            sort = "".join(sorted(val))
            if sort not in mp: 
                mp[sort] = []
            mp[sort].append(val)
        
        return list(mp.values())

# learned 
# easy to pack map values into list through list(mp.values())
# sort string with "".join(sorted(s))
# append to list with .append