 /*Write Java program which accept String from user and display below pattern. 
Input :  Hello 
Output : H  
         H e  
         H e l   
         H e l l  
         H e l l o */

import java.util.*;
class Pattern
{
    public void Pattern(String str)
    {
       char arr[]=str.toCharArray();
       int i=0,j=0;
        for( i=0;i<arr.length;i++)
        {
            for( j=0;j<=i;j++)
            {
                System.out.print(arr[j]+"\t");
                
               
            }
            System.out.println();
        }
    }
} 
class ThirtyThree


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  String");
        String str=sobj.nextLine();
       
        Pattern obj=new Pattern();
        obj.Pattern(str);
    }
}