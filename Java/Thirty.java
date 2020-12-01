 //Write Java program which accept number of rows and number of columns from user and display below pattern. 
//Input :  iRow = 3  iCol = 4  
//Output : * # * #   
//         * # * #  
 //        * # * #   



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
                if((j%2)==0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
        }
    }
} 
class Thirty


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