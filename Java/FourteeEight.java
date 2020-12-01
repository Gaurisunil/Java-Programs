/*Write Java program which accept two arrays from user and display odd contents of each array. 
Input :  2 9 6 5 2 3   45 6 12 18 23 4
 
Output :  9 5 3 
        :45 23   */




import java.util.*;
class MyArray
{
    public void Display(int arr1[],int arr2[])
    {
       
       int i=0,j=0;
       
       for( i=0;i<arr1.length;i++)
           {
            if((arr1[i]%2)!=0)
            {
                
             System.out.print(arr1[i]+"\t");
               }
           }  
           System.out.println();             
          for( j=0;j<arr2.length;j++)
             {
                 if((arr2[j]%2)!=0)
                 {
                    System.out.print(arr2[j]+"\t");
              }     
             }
          
          
    }
} 
class FourteeEight


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