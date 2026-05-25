class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1) return List.of(List.of(strs[0]));
        Map<String, List<String>> values = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if(values.containsKey(String.valueOf(arr))){
                values.get(String.valueOf(arr)).add(str);
                continue;
            }
            List<String> newList = new ArrayList<>();
            newList.add(str);
            values.put(String.valueOf(arr), newList);
        }
        for(List<String> list: values.values()){
            result.add(list);
        }
        return result;
    }
}
