 //Write Java program which accept N numbers from user and display all such elements which are multiples of 11. 
//Input :  N :   6 
//  Elements : 85 66 3 55 93 88  
//Output : 66 55 88 


import java.util.*;
class ArrayDemo
{
    public void Display(int arr[])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%11)==0)
            {
               
            System.out.println(arr[i]+"\t");
            }
        }

    }
}


class Nine
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