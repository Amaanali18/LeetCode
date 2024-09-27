class Solution {
    public int strStr(String haystack, String needle) {
        // if haysatck is less than needle , it is no valid so -1
        if(haystack.length()<needle.length()){
            return -1;
        }
        // start searching for needle in haystack by substringds when found return the value immediately
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;//this ensures first found value is the only ans 
            }
        }
        return -1;//ifnothing found return -1
    }
}