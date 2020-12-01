

//Write Java program which accept number of rows and number of columns from user and display below pattern. 
//Input :  iRow = 3  iCol =  4  
//Output : 1 2 3 4  
 //        5 6 7 8  
 //       9 10 11 12    


import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int iNo=1;
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++,iNo++)
            {
                System.out.print(iNo+"\t");
                
            }
            System.out.println();
        }
    }
} 
class Twentyfive


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  Rows");
        int iValue1=sobj.nextInt();
        System.out.println("Enter the  Colums");
        int iValue2=sobj.nextInt();
         
        Pattern obj=new Pattern();
        obj.Pattern(iValue1,iValue2);
    }
}