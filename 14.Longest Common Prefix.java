public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int number=strs.length;
        if(number==0)  return "";
        else if(number==1) return strs[0];
        else{
        	int length=strs[0].length();
            for(int i=0;i<length;i++)//record the bit to be compared
               for(int j=1;j<number;j++)//比较后面几个字符串相对应度字母是否相同
                 { if(i+1>strs[j].length()||strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);}
                 }
         return strs[0];      
        }
    }
      public static void main(String[] args){
        String[] strs={"hello","helbo","hell"};
        String s=longestCommonPrefix(strs);
        System.out.println("LongestCommonPrefix:"+s);
}