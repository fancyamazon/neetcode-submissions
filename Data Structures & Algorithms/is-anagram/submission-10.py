class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        x = {}
        for i in range(len(s)):
            x[s[i]] = x.get(s[i], 0) + 1
            x[t[i]] = x.get(t[i], 0) - 1

        for ch in x:
            if x[ch] != 0:
                return False
        
        return True