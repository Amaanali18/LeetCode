
class Palindrome {
    public boolean isPalindrome(int x) {
        //negative number is not a palindrome
        if(x<0){
            return false;
        }
        // define a long int temp to store the number
        // define a long int reverse to store reverse of input
        long temp=x;
        long reverse=0;
        // write a function to reverse a int without converting it to string
        while(temp!=0){//loop runs till temp becomes 0
            int digit=(int)(temp%10);//get the last digit
            reverse=reverse*10+digit;// append the last digit to reverse
            temp/=10;// remove last digit from temp
        }
        // check if reverse is equal to x
        return reverse==x;
    }
}