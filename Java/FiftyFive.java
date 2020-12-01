
  /* Write java program which accept array from user and replace each member with summation of its digit. 
Input :  89 687 56 549 87 9 
Output :  17 21 11 18 15 9 */



import java.util.*;
class MyArray
{
    public void SumArray(int arr[])
    {
       
       int i=0,iDigit=0,iSum=0;
    
       
       for(i=0;i<arr.length;i++)
           {
           while(arr[i]!=0)
            {
                iDigit=arr[i]%10;
                iSum=iSum+iDigit;
                arr[i]=arr[i]/10;
            }
            arr[i]=iSum;
           }
                       
         for(i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]+"\t");
         }
         }
} 
class  FiftyFive



   {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
         int arr1[]={11,252,252,11};
       
       
        MyArray obj=new MyArray();
        obj.SumArray(arr1);
    }
}

