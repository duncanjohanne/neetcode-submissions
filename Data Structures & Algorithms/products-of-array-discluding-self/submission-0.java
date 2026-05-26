class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            List<Integer> tempNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
            int product = 1;
            tempNums.remove(i);
            for(Integer num: tempNums){
                product *= num;
            }
            output[i] = product;
        }
        return output;
    }
}  
