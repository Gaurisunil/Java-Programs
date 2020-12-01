 // Write java program which accept N numbers from user and accept Range, Display all elements from that range 
//Input :  N :   6 
  //Start: 60     End :  90     Elements : 85 66 3 76 93 88  
//Output : 66 76 88 


import java.util.*;
class Number
{
    public void Display(int arr[],int iStart,int iEnd)
    {
        int i=0;
        for(i=1;i<arr.length;i++)
        {
            if((arr[i]>iStart)&&(arr[i]<iEnd))
            {
               System.out.println(arr[i]+"\t");
               }      
        }
    }
}





class Eighteen
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter no Elements");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
         System.out.println("Enter the Elements");
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sobj.nextInt();
         }
         System.out.println("Enter the Start No");
         int iValue1=sobj.nextInt();
         System.out.println("Enter the End No");
         int iValue2=sobj.nextInt();
        Number obj=new Number();
        obj.Display(arr,iValue1,iValue2);
        
       
     
    }
        
}