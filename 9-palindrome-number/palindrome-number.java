class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int num=x;
        int d;
        int rev=0;
        while(num>0)
        {
            d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        if(x==rev)
        return true;
        else
        return false;
    }
}
