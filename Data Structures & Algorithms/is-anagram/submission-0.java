class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = true;
        if(s.length() != t.length()) return false;
        for(char first: s.toCharArray()){
            int checkOne = checkHowManyTimeCharAppears(s, first);
            int checkTwo = checkHowManyTimeCharAppears(t, first);
            if(checkOne != checkTwo){
                result = false;
                break;
            };
        }
        return result;
    }

    public int checkHowManyTimeCharAppears(String s, char c){
        int count = 0;
        for(char toCount: s.toCharArray()){
            if(toCount == c) count++;
        }
        return count;
    }
}
