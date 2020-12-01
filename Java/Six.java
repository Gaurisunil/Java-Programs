
//Write Java program which accept N numbers from user and return difference between summation of even elements and summation of odd elements. 
//Input :  N :   6 
  //Elements : 85 66 3 80 93 88  
//Output : 53 



import java.util.*;
class ArrayDemo
{
    public int Differencs(int arr[])
    {
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%2)==0)
            {
                even=even+arr[i];
            }
            else
            {
                odd=odd+arr[i];
            }
        }
        return even-odd;
    }
}


class Six
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
        int iRet=obj.Differencs(arr);
        System.out.println(" Difference of even & odd Count is"+iRet);
    }
}