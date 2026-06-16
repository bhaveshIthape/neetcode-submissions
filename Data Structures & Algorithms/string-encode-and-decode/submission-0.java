class Solution {

    public String encode(List<String> strs) {

        String encode = "";
        for (String s: strs) {
            encode = encode + s.length() + "#" + s;
        }

        return encode;

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            String digit = "";
            while (Character.isDigit(str.charAt(i))) {
                digit = digit + str.charAt(i);
                i++;
            }
            if (str.charAt(i) == '#') {
                i++;

                int len = Integer.parseInt(digit);
                String stoadd = "";
                stoadd = stoadd + str.substring(i, i+len);
                i = i+len;
                
                res.add(stoadd);
            }
            
        }

        return res;

    }
}
