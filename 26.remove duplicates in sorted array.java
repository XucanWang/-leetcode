public class Solution {
    public static int removeDuplicates(int[] nums) {
     if(nums.length==0||nums.length==1) return nums.length;
     int j=1;
     int i=0;
     int counter=1;
     while(j<nums.length){
         if(nums[i]==nums[j]){j++;}
         else{
             i++;
             nums[i]=nums[j];
             j++;
             counter++;
         }
     }
    return counter;
    }

    public static void main(String args[]){
        int[] nums={1,2,3,3,3,4,4};
        System.out.println(removeDuplicates(nums));
    }
}