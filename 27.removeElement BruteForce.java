public class Solution {
    public int removeElement(int[] nums, int val) {
        int counter=0;
        if(nums.length==0) return 0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
           nums[flag++]=nums[i];
           counter++;}
        }
        return counter;
        }
    public static void main(String args[]){
      int[] nums={1,2,3,4,5,6,7,8,9,9,9,9,9,9};
      System.out.println(removeElement(nums,9));
    }
}