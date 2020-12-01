//Write a java Program which accept string from user and count number of Small characters.
//Input:"Gauri S"
//Output:4

import java.util.*;
class StringDemo
{
    public int Small(String input)
    {
        char arr[]=input.toCharArray();
        int Count=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='a')&&(arr[i]<='z'))
            {
                Count++;
            }
        }
        return Count;
    }
}


class Second 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        StringDemo obj=new StringDemo();
        int iRet=obj.Small(str);
        System.out.println("Small Count is"+iRet);
    }
}