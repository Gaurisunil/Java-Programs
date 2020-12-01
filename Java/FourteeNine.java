/* Write Java program which accept two arrays from user and display summation of each array. 
Input :  2 9 7 5 2 3   9 3 5 5 
Output : 28 22    */



import java.util.*;
class MyArray
{
    public void Display(int arr1[],int arr2[])
    {
       
       int i=0,j=0;
       int iSum1=0,iSum2=0;
       for( i=0;i<arr1.length;i++)
           {
            iSum1=iSum1+arr1[i];
             System.out.print(arr1[i]+"\t");
               
           }  
           System.out.println();             
          for( j=0;j<arr2.length;j++)
             {
                    iSum2=iSum2+arr2[j];
                    System.out.print(arr2[j]+"\t");
                  
             }
           System.out.println();   
           System.out.println(iSum1+"\t");
           System.out.println(iSum2+"\t");
    }
} 
class FourteeNine


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr1[]={2,9,7,5,2,3};
        int arr2[]={1,8,7,5,5};
    MyArray obj=new MyArray();
        obj.Display(arr1,arr2);
    }
}