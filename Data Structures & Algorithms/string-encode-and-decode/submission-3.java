class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i).length()).append("é").append(strs.get(i));
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<str.length()) {
			int num = 0;
			while(str.charAt(i)!='é'){
			    sb.append(str.charAt(i));
			    i++;
			}
			num = Integer.parseInt(sb.toString());
			sb.setLength(0);
			int j = i+1;
			list.add(str.substring(j, num+i+1));
			i = num+i+1;
			// System.out.println(list);
		}
        return list;
    }
}
