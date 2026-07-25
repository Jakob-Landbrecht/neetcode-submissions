class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charDisS = new HashMap<>();
        Map<Character, Integer> charDisT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            charDisS.merge(s.charAt(i), 1, (oldValue, newValue) -> oldValue + 1);
            charDisT.merge(t.charAt(i), 1, (oldValue, newValue) -> oldValue + 1);
        }
        return charDisS.equals(charDisT);
    }
}
