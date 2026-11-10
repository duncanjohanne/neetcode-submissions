class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) return true;
        String stripped = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(stripped.length()%2==0){
            int point_one = (stripped.length()/2)-1;
            int point_two = point_one + 1;
            for(int i=point_one, j=point_two; i>=0; i--, j++){
                if(stripped.charAt(i) == stripped.charAt(j)) continue;
                return false;
            }
        }else{
            int point = (stripped.length()+1)/2;
            for(int i=0, j=stripped.length()-1; i<point-1; i++, j--){
                if(stripped.charAt(i) == stripped.charAt(j)) continue;
                return false;
            }
        }
        return true;
    }
}
