//Write a program which accept number from user and return the count of odd digits. 
//Input :  2395  Output :  3 

import java.util.*;
class Digit
{
    public int Count(int iNo)
    {
        
       int iDigit=0,Count=0;
       while(iNo>0)
       {
           iDigit=iNo%10;
           if((iDigit%2)!=0)
           {
               Count++;
           }
           iNo=iNo/10;

       }
     return Count;
     }
}


class Eleven
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no ");
       
        int iValue=sobj.nextInt();
        Digit  obj=new Digit();
     int iRet=obj.Count(iValue);
     System.out.println("Odd no Count is"+iRet);
    }
        
}