class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            mp.put(c1, mp.getOrDefault(c1, 0) + 1);
            mp.put(c2, mp.getOrDefault(c2, 0) - 1);
        }
        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if(entry.getValue() != 0) return false;
        }
        return true;
    }
}
