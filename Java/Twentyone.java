// Write Java program which accept number of rows and number of columns from user and display below pattern. 
//Input :  iRow = 4  iCol = 4  
//Output :   A B C D  
//           a b c d  
//           A B C D   
//           a b c d 




import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        char ch1='A';
        char ch2='a';
        for(int i=1;i<=iRow;i++)
        {
            if((i%2)!=0)
            {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print(ch1+"\t");
                ch1++;
                if(ch1=='E')
                {
                    ch1='A';
                }
            }

            System.out.println();
        }

      else  if((i%2)==0)
            {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print(ch2+"\t");
                ch2++;
                if(ch2=='e')
                {
                    ch2='a';
                }
            }
             System.out.println();
            }
        }
    }
} 
class Twentyone
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