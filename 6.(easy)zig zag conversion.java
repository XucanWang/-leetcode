public class Solution {
    public static String convert(String s, int numRows) {
        int length= s.length();//compute the number of chars in the string
        if (length==0||numRows==1) return s;
        else{
        StringBuffer[] stringlist=new StringBuffer[numRows];//create n string buffers
        for(int k=0;k<numRows;k++)
        stringlist[k]=new StringBuffer();
        int i=0;//the flag to record whether the string has finished 
        while(i<length){
            for (int row=0; row<numRows&&i<length; row++){
            stringlist[row].append(s.charAt(i));
             i++;}
             for(int row=numRows-2;row>0&&i<length;row--){
              stringlist[row].append(s.charAt(i));  
              i++;
             }
        }
        for(int row=1; row<numRows;row++)
        stringlist[0].append(stringlist[row]);
        return stringlist[0].toString();
        }
    }
    public static void main(String[] args){
        String s="PAYPALISHIRING";
        System.out.println(convert(s,3));
        }
  }
}