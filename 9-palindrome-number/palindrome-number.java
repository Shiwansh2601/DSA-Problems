class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int data=x;
        int rem;
        int rev=0;
        while(data>0)
        {
            rem=data%10;
            rev=rev*10+rem;
            data=data/10;
        }
        if(x==rev)
        return true;
        else
        return false;
    }
}