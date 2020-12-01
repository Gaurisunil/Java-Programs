//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits. 
//Input :  2395  Output :  -15 (2 - 17) 


import java.util.*;
class Digit
{
    public int Count(int iNo)
    {
        
       int iDigit=0,iEven=0,iOdd=0;
       while(iNo>0)
       {
           iDigit=iNo%10;
           if((iDigit%2)==0)
           {
               iEven=iEven+iDigit;
           }
           else
           {
               iOdd=iOdd+iDigit;

           }
           iNo=iNo/10;

       }
     return iEven-iOdd;
     }
}


class Fifteen

{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no ");
       
        int iValue=sobj.nextInt();
        Digit  obj=new Digit();
     int iRet=obj.Count(iValue);
     System.out.println("Diff between even and odd digit"+iRet);
    }
        
}