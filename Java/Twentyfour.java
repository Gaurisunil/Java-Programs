// Write Java program which accept number of rows and number of columns from user and display below pattern. 
//Input :  iRow = 4  iCol = 5  
//Output : 4 4 4 4 4  
//         3 3 3 3 3 
//         2 2 2 2 2 
//          1 1 1 1 1 






import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int iNo=iRow;
        for(int i=1;i<=iRow;i++,iNo--)
        {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print(iNo+"\t");
                
            }
            System.out.println();
        }
    }
} 
class Twentyfour


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