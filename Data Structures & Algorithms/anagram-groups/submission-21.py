class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = defaultdict(list)
        for s in strs:
            sort = "".join(sorted(s))
            mp[sort].append(s)
        
        return list(mp.values())

# learned 
# easy to pack map values into list through list(mp.values())
# sort string with "".join(sorted(s))
# append to list with .append