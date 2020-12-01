//write a java program which accept string from user and display it in reverse order
//ip:"Hello"
//op:"olleH"


import java.util.*;
class StringDemo
{
    public void Reverse(String input)
    {
        char arr[]=input.toCharArray();
        int iStart=0;
        int iEnd=arr.length-1;
        char temp=0;
        while(iStart<iEnd)
        {
            temp=arr[iStart];
            arr[iStart]=arr[iEnd];
            arr[iEnd]=temp;
            iStart++;
            iEnd--;
            
        }
      
}
  
}


class Five
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        StringDemo obj=new StringDemo();
        obj.Reverse(str);
     
    }
}