class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Set<Integer> set = new HashSet<>(nums.length);
        for(int x: nums) set.add(x);
        int[] result = new int[set.size()];
        int i = 0;
        for(int x: set) result[i++] = x;
        Arrays.sort(result);
        int longest = 1;
        int tempCount = 1;
        for(int x=1; x<result.length; x++){
            int difference = result[x] - result[x-1];
            if(difference == 1){
                tempCount++;
            }else{
                if(tempCount > longest){
                    longest = tempCount;
                }
                tempCount = 1;

            }
        }
        return tempCount > longest ? tempCount : longest;
    }
}
