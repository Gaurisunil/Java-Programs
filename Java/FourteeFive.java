/* Write a java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol =  4  
Output :  1 2 3 4 5  
          1 2     5   
          1  3    5   
          1     4 5     */





import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
       
       int i=0,j=0;
       int ino=1;
       for( i=1;i<=iRow;i++)
        {
            for( j=1;j<=iCol;j++,ino++)
            {
                if((i==1)||(j==1)||(j==iCol)||(i==j))
        {                
                    System.out.print(ino+"\t");
         }               
             
             else 
             { 
                System.out.print("\t"); 
             }
            }
            if(ino==iCol+1)
            {
                ino=1;
            }
          System.out.println();
  
          } 
    }
} 
class FourteeFive


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  no rows");
        int iValue1=sobj.nextInt();
        System.out.println("Enter the  no colums");
        int iValue2=sobj.nextInt();
        Pattern obj=new Pattern();
        obj.Pattern(iValue1,iValue2);
    }
}