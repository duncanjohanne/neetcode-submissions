class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            int forwhile = i;
            boolean found = false;
            while (forwhile<temperatures.length-1) {
                forwhile++;
                if(temperatures[forwhile] > temperatures[i]){
                    found = true;
                    break;
                }
            }
            if(found){
                result[i] = forwhile-i;
            }else{
                result[i] = 0;
            }
            found = false;
        }
        return result;
    }
}
