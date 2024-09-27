class validParentheses {
    public boolean isValid(String s) {
    //run a condition till all string is checked
    while(true){
        // check for ()
        if(s.contains("()")){
            s=s.replace("()","");
        }
        // check for {}
        else if(s.contains("{}")){
            s=s.replace("{}","");
        }
        // check for []
        else if(s.contains("[]")){
            s=s.replace("[]","");
        }
        // return false as it will be not valid anyways
        else{   
            return s.isEmpty();
        }
    }
    }
}