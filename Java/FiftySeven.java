 /* Write Java program which accept array of characters from user and replace each capital character with its corresponding small character. 
Input :  b N j B R b A d G G  
Output : b n j b r b a d g g   */



import java.util.*;
class MyArray
{
    public void SumArray(char arr[])
    {
      // char arr[]=str.toCharArray();
       int i=0;
    
       
       for(i=0;i<arr.length;i++)
           {
          if((arr[i]>='A')&&(arr[i]<='Z'))
         {              
           arr[i]=arr[i]+32;
         }
           }
           for(i=0;i<arr.length;i++)
           {
                System.out.println(arr[i]+"\t");
           }
    }
} 
class  FiftySeven



   {
    
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  String");
        String str=sobj.nextLine();
       
        MyArray obj=new MyArray();
      obj.SumArray(str);
     // System.out.println("count is"+iRet);
}

   }