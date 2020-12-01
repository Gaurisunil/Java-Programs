



 /*Write a java program which accept two array from user and check whether that array and its elements are palindrome or not. 
Input :   11 252 387783 252 11 
Output :   TRUE 
Input :   11 252 387783 77 11 
Output :   FALSE 
Input :   11 252 786 252 11 
Output :   FALSE 
Input :   11 252 786 253 11 
Output :   FALSE */



import java.util.*;
class MyArray
{
    public boolean chkPallindrome(int arr[])
    {
       
       int i=0;
    
       int iStart=0,iEnd=arr.length-1;
       for( iStart=0,iEnd=arr.length-1;iStart<arr.length;iStart++,iEnd--)
           {
            if(arr[iStart]!=arr[iEnd]-1)
            {
                break;
            }
            iStart++;
            iEnd--;
           }
                       
          if(iStart<iEnd)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
} 
class  FiftyThree


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr1[]={  11, 252,786,11 };
        
    MyArray obj=new MyArray();
     boolean bRet=false;
      bRet=obj.chkPallindrome(arr1);
      if(bRet==true)
      {
          System.out.println("Its Pallindrome");
      }
      else
      {
          System.out.println("Its not Pallindrome");
      }
}
}