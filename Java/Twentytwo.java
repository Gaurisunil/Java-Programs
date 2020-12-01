import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        char ch='A';
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++,ch++)
            {
                System.out.print(ch+"\t");
                
            }
            System.out.println();
        }
    }
} 
class Twentytwo
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