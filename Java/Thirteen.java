//Write a program which accept number from user and return the count of digits in between 3 and 7. 
//Input :  2395  Output :  1 


import java.util.*;
class Digit
{
    public int Count(int iNo)
    {
        
       int iDigit=0,Count=0;
       while(iNo>0)
       {
           iDigit=iNo%10;
           if((iDigit>3)&&(iDigit<7))
           {
               Count++;
           }
           iNo=iNo/10;

       }
     return Count;
     }
}


class Thirteen

{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no ");
       
        int iValue=sobj.nextInt();
        Digit  obj=new Digit();
     int iRet=obj.Count(iValue);
     System.out.println("Range  Count is"+iRet);
    }
        
}