 /* Write Java program which accept array of characters from user and return difference between frequency of capital and frequency of small characters. 
Input :  b N e B R b A I O G i  
Output : 3 (7 - 4) */


import java.util.*;
class MyArray
{
    public int SumArray(String str)
    {
       char arr[]=str.toCharArray();
       int i=0,iCount1=0,iCount2=0;
    
       
       for(i=0;i<arr.length;i++)
           {
          if((arr[i]>='A')&&(arr[i]<='Z'))
         {              
           iCount1++;
         }
        else  if((arr[i]>='a')&&(arr[i]<='z'))
         {              
           iCount2++;
         }
           }
           return (iCount1-iCount2);
    }
} 
class  Sixty



   {
    
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  String");
        String str=sobj.nextLine();
       
        MyArray obj=new MyArray();
      int iRet=obj.SumArray(str);
      System.out.println("count is"+iRet);
}

   }