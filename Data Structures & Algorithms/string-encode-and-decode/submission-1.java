class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i)).append(Character.toString((char) 257));
        }
        // System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=257){
                sb.append(str.charAt(i));
            }
            else{
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list;
    }
}
