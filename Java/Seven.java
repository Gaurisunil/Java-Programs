/// Write Java program which accept N numbers from user and display all such elements which are divisible by 5. 
//Input :  N :   6 
  //Elements : 85 66 3 80 93 88  
//Output : 85 80 

import java.util.*;
class ArrayDemo
{
    public void Display(int arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%5)==0)
            {
               
            System.out.println(arr[i]);
            }
        }

    }
}


class Seven
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter no Elements");
        int iSize=sobj.nextInt();
        int arr[]=new int [iSize];
        System.out.println("Enter the Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        ArrayDemo obj=new ArrayDemo();
        obj.Display(arr);
    }
        
}