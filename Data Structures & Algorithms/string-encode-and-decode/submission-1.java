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
            int j = i;
            while (Character.isDigit(str.charAt(i))) {
                i++;
            }
            if (str.charAt(i) == '#') {
                int len = Integer.parseInt(str.substring(j, i));
                i++;
                String stoadd = "";
                stoadd = stoadd + str.substring(i, i+len);
                i = i+len;
                
                res.add(stoadd);
            }
            
        }

        return res;

    }
}
