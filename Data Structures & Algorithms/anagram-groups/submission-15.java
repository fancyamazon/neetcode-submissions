class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String sorted = new String(chs);
            mp.computeIfAbsent(sorted, x -> new ArrayList<>()).add(s); // new
        }
        return new ArrayList<>(mp.values()); // new
    }
}

// Java sort string: first conv to char array, then back
// char[] chs = s.toCharArray();
// Arrays.sort(chs);
// String sorted = new String(chs);
// lots of syntax regarding arraylist and maps