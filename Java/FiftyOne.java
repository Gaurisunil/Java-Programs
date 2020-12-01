 /*Write a java program which accept two two arrays from user and display minimum element of each array. 
Input :  2 9 7 5 2 3   9 3 5 5 
Output : 2 3   
*/



import java.util.*;
class MyArray
{
    public void Display(int arr1[],int arr2[])
    {
       
       int i=0,j=0;
       int iMin1=arr1[0];
       int iMin2=arr2[0];
       for( i=0;i<arr1.length;i++)
           {
            if(iMin1>=arr1[i])
                iMin1=arr1[i];
            }
            
            }  
          // 

System.out.println();             
          for( j=0;j<arr2.length;j++)
             {
                     if(iMin2>=arr2[i])
            {
                iMin2=arr2[i];
            }
            
             }
         System.out.println(iMin1+"\t");
           System.out.println(iMin2+"\t");
      }
} 
class FiftyOne


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr1[]={2,9,7,5,2};
        int arr2[]={1,8,7,5,5};
    MyArray obj=new MyArray();
        obj.Display(arr1,arr2);
       
    }
}