public class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
    long reverse=0;
   int flag=x;
   while (flag!=0){
	   reverse=reverse*10+flag%10;
        flag=flag/10;}
  
return (reverse==x);
  }
  public static void main(String[] args){
    	  System.out.println(reverse(1234321));
    	  System.out.println(reverse(-1234321));
    	  }
}