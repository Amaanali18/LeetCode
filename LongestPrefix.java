class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String temp=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<temp.length()&&j<strs[i].length()){
                if(temp.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            temp=temp.substring(0,j);
            if(temp.isEmpty()){
                return "";
            }
        }
        return temp;
    }
}