 //Write java program which accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO. 
//Input :  N :   6 
  //NO:  66 
  //Elements : 85 66 3 66 93 88 


import java.util.*;
class Number
{
    public int First(int arr[],int iNo)
    {
        int i=0;
        for(i=1;i<=arr.length;i++)
        {
            if(arr[i]==iNo)
            {
                
                break;
            }
        }
        if(i==arr.length)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }
}





class Seventeen
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter no Elements");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
         System.out.println("Enter the Elements");
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sobj.nextInt();
         }
         System.out.println("Enter the Particular No");
         int iValue=sobj.nextInt();
        Number obj=new Number();
         int iRet = obj.First(arr,iValue);
        System.out.println("First occurance of no is"+iRet);
        
       
     
    }
        
}