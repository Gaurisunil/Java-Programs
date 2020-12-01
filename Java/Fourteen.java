import java.util.*;
class Digit
{
    public int Count(int iNo)
    {
        
       int iDigit=0,iMuit=1;
       while(iNo>0)
       {
           iDigit=iNo%10;
           if((iDigit!=0))
           {
               iMuit=iMuit*iDigit;
           }
           iNo=iNo/10;

       }
     return iMuit;
     }
}


class Fourteen

{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the no ");
       
        int iValue=sobj.nextInt();
        Digit  obj=new Digit();
     int iRet=obj.Count(iValue);
     System.out.println("Multiplaction all digit"+iRet);
    }
        
}