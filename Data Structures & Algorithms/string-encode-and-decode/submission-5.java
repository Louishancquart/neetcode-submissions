class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j =i;
            
            // find  # 
            while(str.charAt(j) != '#'){
                j++;
            }

            // get length
            int len = Integer.parseInt(str.substring(i,j));

            // extract stringabstract
            i = j+1;
            strs.add(str.substring(i,i+len));
            
            // move to next
            i = i+len;
        }
        return strs;
    }
}
