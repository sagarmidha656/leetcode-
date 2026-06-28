class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> set1 = new HashMap<>();
        HashMap<Character,Integer> set2 = new HashMap<>();

        for(char str : s.toCharArray() ){
            set1.put(str,set1.getOrDefault(str,0)+1);
        }
         for(char str2 : t.toCharArray() ){
            set2.put(str2,set2.getOrDefault(str2,0)+1);
        }

        return set1.equals(set2);
    }
}