// Write Java program which accept number of rows and number of columns from user and display below pattern. 
//Input :  iRow = 4  iCol = 3  
//Output : 1 2 3 
//         1 2 3  
//         1 2 3 
//         1 2 3   



import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
       int iNo=1;
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print(iNo+"\t");
                iNo++;
                if(iNo==iCol+1)
                {
                    iNo=1;
                }
                
            }
            System.out.println();
        }
    }
} 
class Twentyseven


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