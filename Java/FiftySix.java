/*Write java program which accept array of characters from user and count number of capital characters. 
Input :  b N j B R b A d G G  
Output : 6 */


import java.util.*;
class MyArray
{
    public int SumArray(String str)
    {
       char arr[]=str.toCharArray();
       int i=0,iCount=0;
    
       
       for(i=0;i<arr.length;i++)
           {
          if((arr[i]>='A')&&(arr[i]<='Z'))
         {              
           iCount++;
         }
           }
           return iCount;
    }
} 
class  FiftySix



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