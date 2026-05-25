class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;
        Arrays.sort(nums);
        Map<Integer, Integer> values = new HashMap<>();
        int[] result = new int[k];
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            values.merge(nums[i], 1, Integer::sum);
        }
        for(int i=0; i<k; i++){
            int start = 0;
            for(Map.Entry<Integer, Integer> entry: values.entrySet()){
                if(entry.getValue() > start && !seen.contains(entry.getKey())){
                    start = entry.getValue();
                    result[i] = entry.getKey();
                }
            }
            seen.add(result[i]);
        }
        return result;
    }
}
