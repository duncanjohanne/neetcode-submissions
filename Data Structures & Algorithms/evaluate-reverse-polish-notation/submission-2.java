class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operations = new HashSet<>();
        operations.add("*");
        operations.add("-");
        operations.add("/");
        operations.add("+");
        int first = 0;
        int last = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s: tokens){
            if(operations.contains(s) && !stack.isEmpty()){
                switch (s) {
                    case "+":
                        last = stack.pop();
                        first = stack.pop();
                        stack.push(last+first);
                        break;
                    case "-":
                        last = stack.pop();
                        first = stack.pop();
                        stack.push(first-last);
                        break;
                    case "*":
                        last = stack.pop();
                        first = stack.pop();
                        stack.push(first*last);
                        break;
                    case "/":
                        last = stack.pop();
                        first = stack.pop();
                        stack.push(first/last);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
