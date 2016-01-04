public class Solution {
    public static  int reverse(int x) {
   long reverse=0;
   while (x!=0){
	   reverse=reverse*10+x%10;
        x=x/10;}
   if(reverse<Integer.MIN_VALUE||reverse>Integer.MAX_VALUE)
	  {System.out.println("OverFlow"); return 0;}
   else {return (int)reverse;}
  }
    public static void main(String[] args){
    	  System.out.println(reverse(1234567));
    	  System.out.println(reverse(1534236469));
    	  }
}