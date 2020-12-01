 /* Write a java program which accept two arrays from user and return difference between summation of arrays. 
Input :  2 9 7 5 2 3   9 3 5 5 
Output : 6  */

import java.util.*;
class MyArray
{
    public int Display(int arr1[],int arr2[])
    {
       
       int i=0,j=0;
       int iSum1=0,iSum2=0;
       for( i=0;i<arr1.length;i++)
           {
            iSum1=iSum1+arr1[i];
            
               
           }  
           System.out.println();             
          for( j=0;j<arr2.length;j++)
             {
                    iSum2=iSum2+arr2[j];
                 
                  
             }
          return (iSum1-iSum2);
    }
} 
class Fifty


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr1[]={2,9,7,5,2,3};
        int arr2[]={1,8,7,5,5};
    MyArray obj=new MyArray();
       int iRet= obj.Display(arr1,arr2);
       System.out.println("Diffe is "+iRet);
    }
}