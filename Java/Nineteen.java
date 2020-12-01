 //Write java program which accept N numbers from user and return product of all odd elements. 
//Input :  N :   6     Elements : 15 66 3 70 10 88 
//Output : 45 


import java.util.*;
class Number
{
    public int Product(int arr[])
    {
        int iMult=1;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%2)!=0)
            {
               iMult=iMult*arr[i];
            }
        }
               if(iMult==1)
               {
                   return 0;
               }  
        
               else  
               {
                   return iMult;
               }  
          

    }
}





class Nineteen
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
         
        Number obj=new Number();
        int iRet=obj.Product(arr);
        System.out.println("Product is "+iRet);
        
       
     
    }
        
}