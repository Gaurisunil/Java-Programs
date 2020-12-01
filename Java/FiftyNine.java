
/*Write Java program which accept array of characters from user and replace each capital character with its corresponding small character. 
Input :  b N e B R b A i G i  
Output : 4  */

import java.util.*;
class MyArray
{
    public int SumArray(String str)
    {
       char arr[]=str.toCharArray();
       int i=0,iCount=0;
    
       
       for(i=0;i<arr.length;i++)
           {
          if((arr[i]=='A')||(arr[i]=='a')||(arr[i]=='E')||(arr[i]=='e')||(arr[i]=='I')||(arr[i]=='i')||(arr[i]=='O')||(arr[i]=='o')||(arr[i]=='u')||(arr[i]=='U'))
         {              
           iCount++;
         }
           }
           return iCount;
    }
} 
class  FiftyNine



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