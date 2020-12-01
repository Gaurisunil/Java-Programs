import java.util.*;
class MyArray
{
    public int Display(int arr1[])
    {
       
       int i=0;
    
       int brr[]=new int [arr.length];
       for( i=0;i<arr1.length;i++)
           {
            brr[i]=arr[i];
            
            }  
                       
          return brr;
      }
} 
class  FiftyTwo


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int arr1[]={2,9,7,5,2};
        //int arr2[]={1,8,7,5,5};
    MyArray obj=new MyArray();
     int arr =obj.Display(arr1);

      for( i=0;i<arr1.length;i++)
      {
           System.out.println(arr[i]+"\t");
      }
       
    }
}