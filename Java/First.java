
//Write a java Program which accept string from user and count number of Capital characters.
//Input:"Marvellous Muti Os"
//Output:3


import java.util.*;
class StringDemo
{
    public int CountCap(String input)
    {
        char arr[]=input.toCharArray();
        int Count=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='A')&&(arr[i]<='Z'))
            {
                Count++;
            }
        }
        return Count;
    }
}


class First 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        StringDemo obj=new StringDemo();
        int iRet=obj.CountCap(str);
        System.out.println("Capital Count is"+iRet);
    }
}