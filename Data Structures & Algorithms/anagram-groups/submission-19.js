class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        var mp = {};
        for(var s of strs) {
            var sorted = s.split("").sort().join(""); // js sort
            if(!mp[sorted]) { // check if entry exists
                mp[sorted] = [];
            }
            mp[sorted].push(s); //.push
        }
        return Object.values(mp); // Object.values()
    }
}
