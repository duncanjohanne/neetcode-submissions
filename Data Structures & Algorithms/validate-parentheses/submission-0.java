class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Deque<String> stack = new ArrayDeque<>();
        Map<String, String> parenthesis = new HashMap<>();
        parenthesis.put("}", "{");
        parenthesis.put(")", "(");
        parenthesis.put("]", "[");
        if(parenthesis.containsKey(String.valueOf(s.charAt(0)))) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(parenthesis.containsValue(String.valueOf(c))){
                 stack.push(String.valueOf(c));
            }else{
                if(stack.peek() == null || !stack.peek().equals(parenthesis.get(String.valueOf(c)))) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
