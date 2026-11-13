class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;

        var mp = new Map();
        for(var i = 0; i < s.length; i++) {
            mp.set(s[i], (mp.get(s[i]) || 0)+1);
            mp.set(t[i], (mp.get(t[i]) || 0)-1);
        }
        for(const [key, value] of mp) {
            if(value!=0) return false;
        }

        return true;
    }
}
