class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if null str return empty
        if(strs==null||strs.length==0){
            return "";
        }
        String temp=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            // compare temp variable to any one of str
            while(j<temp.length()&&j<strs[i].length()){
                if(temp.charAt(j)!=strs[i].charAt(j)){
                    break;//if not equal break
                }
                j++;
            }
            // add the found char to temp
            temp=temp.substring(0,j);
            if(temp.isEmpty()){
                return "";// fast return if nothing is found
            }
        }
        return temp;
    }
}