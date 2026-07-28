class Solution {
    public boolean checkVowel(char s){
            if(s=='a' || s == 'e'||s=='i' || s=='o' || s=='u') return true;
            return false;
        }
    public int vowelStrings(String[] words, int left, int right) {
        int count =0;
        for(int i =left ;i<=right;i++){
            String w = words[i];
            if(checkVowel(w.charAt(0)) && checkVowel(w.charAt(w.length()-1))){
                count++;
            }
        }
        return count;
    }
}