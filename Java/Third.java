//Write a java Program which accept string from user and count number of Small characters.
//Input:"Gauri S"
//Output:2  (4-2)



import java.util.*;
class StringDemo
{
    public int Differencs(String input)
    {
        char arr[]=input.toCharArray();
        int Count1=0,Count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='a')&&(arr[i]<='z'))
            {
                Count1++;
            }
            else if((arr[i]>='A')&&(arr[i]<='Z'))
            {
                  Count2++;
            }
        }
        return Count1-Count2;
    }
}


class Third
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        StringDemo obj=new StringDemo();
        int iRet=obj.Differencs(str);
        System.out.println(" Difference of Small & Capital Count is"+iRet);
    }
}