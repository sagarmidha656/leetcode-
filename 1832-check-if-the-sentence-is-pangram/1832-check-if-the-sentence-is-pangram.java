class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] fre = new boolean[26];
        for(char c : sentence.toCharArray()){
            fre[c-'a'] = true;
        }
        for(int i =0 ; i<26 ; i++){
            if(fre[i]==false){
                return false;
            }
        }
        return true;
    }
}