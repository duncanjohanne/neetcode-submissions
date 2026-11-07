class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(target == 0 || position.length == 1) return 1;
        TreeMap<Integer, Integer> tree = new TreeMap<>(Comparator.reverseOrder());
        for(int i=0; i<position.length; i++){
            tree.put(position[i], speed[i]);
        }
        Deque<Double> stack = new ArrayDeque<>();
        for(Map.Entry<Integer, Integer> entry: tree.entrySet()){
            double time = (double)(target - entry.getKey())/entry.getValue();
            if(stack.isEmpty()) stack.push(time);
            if(time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
