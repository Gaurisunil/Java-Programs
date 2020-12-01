 //Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not. 
//Input :  N :   6 
  //NO:  66 
  //Elements : 85 66 3 66 93 88  
//Output : TRUE 






import java.util.*;
class Number
{
    boolean Chk(int arr[],int iNo)
    {
        int Count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==iNo)
            {
                Count++;
                break;
            }
        }
        if(Count!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}





class Sixteen
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
         System.out.println("Enter the Particular No");
         int iValue=sobj.nextInt();
        boolean bRet=false;
        Number obj=new Number();
         bRet = obj.Chk(arr,iValue);
        
        if(bRet==true)
        {
          System.out.println("No is Present");  
        }
        else
        {
            System.out.println("No is Absent");
        }
       
     
    }
        
}