  //write java a Program which accept string from user and check whether it contains vowel in it or not.
  //ip:"Gauri"
  //op:True 
  //ip:"khj"
   //op:False

import java.util.*;
class StringDemo
{
    public boolean Vowel(String input)
    {
        char arr[]=input.toCharArray();
        int Count=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>='a')||(arr[i]<='e')||(arr[i]<='u')||(arr[i]<='i')||(arr[i]<='o'))
            {
                Count++;
            }
        }
            if(Count==0)
            {
                return false;
            }
            else
            {
                return true;
            }
            
        }
    
}


class Four
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        StringDemo obj=new StringDemo();
        boolean bRet=false;
         bRet=obj.Vowel(str);
         if(bRet==true)
         {
             System.out.println("it contains Vowel");
         }
        else
        {

         System.out.println("it not contains Vowel");
         }
    }
}