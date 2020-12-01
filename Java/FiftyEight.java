 /*Write java program which accept marks of N students from user and display class of each student. 
Less than 35 -  Fail Less than 50 -  Pass class Less than 60 -  Second class Less than 70 -  First class Greater than 70 -  First class with Distinction 
Input :  67.3  45.8  88.9  77.5  55.2 
Output : 67.3  First class   45.8  Pass class   88.9  First class with Distinction   77.5  First class with Distinction   55.2  Second class 

*/



import java.util.*;
class MyArray
{
    public void Percentage(double arr[])
    {
       int i=0;
    
       
       for(i=0;i<arr.length;i++)
           {
          if(arr[i]<=35)
          {
              System.out.println("Fail");
          }
          else if((arr[i]<=50)&&(arr[i]>35))
          {
                 System.out.println("Pass class");
          }
          else if((arr[i]<60)&&(arr[i]>50))
          {
                 System.out.println("Second class");
          }
          else if((arr[i]>70)&&(arr[i]>60))
          {
                 System.out.println("first class with dist");
             }
      }

    }
} 
class  FiftyEight



   {
    
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
         double arr1[]={11.9,52.9,50.9,91.6};
       
       
        MyArray obj=new MyArray();
        obj.Percentage(arr1);
}

   }