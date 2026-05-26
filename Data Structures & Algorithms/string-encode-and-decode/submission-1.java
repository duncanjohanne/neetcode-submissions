class Solution {

    public String encode(List<String> strs) {
        Collections.reverse(strs);
        StringBuilder encoded = new StringBuilder();
        int[] strLengths = new int[strs.size()];
        for(int i=0; i<strs.size(); i++){
            strLengths[i] = strs.get(i).length();
        }
        for(int length: strLengths){
            encoded.append(length);
            encoded.append(",");
        }
        encoded.append("#@#");
        for(String str: strs){
            encoded.append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        String[] parts = str.split("#@#");
        if(parts.length == 0) return new ArrayList<>();
        String[] lengths = parts[0].split(",");
        List<String> decoded = new ArrayList<>();
        int start = 0;
        if(parts.length == 1){
            for(String l: lengths) decoded.add("");
            return decoded;
        };
        String partString = parts[1];
        for(int i=0; i<lengths.length; i++){
            if(lengths[i].matches("\\d+")){
                int sLen = Integer.parseInt(lengths[i]);
                if(sLen == 0){
                    decoded.add("");
                    continue;
                }
                decoded.add(
                    partString.substring(start, sLen+start)
                );
                start = sLen + start;
            }
        }
        Collections.reverse(decoded);
        return decoded;
    }
}