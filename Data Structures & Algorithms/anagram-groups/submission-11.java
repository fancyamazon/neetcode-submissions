class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String sorted = new String(chs);
            if(!mp.containsKey(sorted)) mp.put(sorted, new ArrayList<>());
            mp.get(sorted).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}

// Java sort string: first conv to char array, then back
// char[] chs = s.toCharArray();
// Arrays.sort(chs);
// String sorted = new String(chs);
// lots of syntax regarding arraylist and maps