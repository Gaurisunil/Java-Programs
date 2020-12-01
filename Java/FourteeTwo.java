   /*Write a java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 4  
Output : * * * #  
         * * # @   
         * # @ @   
         # @ @ @     */

import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
       
       int i=0,j=0;
       for( i=0;i<=iRow;i++)
        {
            for( j=1;j<=iCol;j++)
            {
                if((i+j)==iRow+1)
        {                
                    System.out.print("#\t");
         }               
                
               
            else if(i+j<=iRow)
             { 
                System.out.print("*\t"); 
             }
             else 
             { 
                System.out.print("@\t"); 
             }
            }
          System.out.println();
  
          } 
    }
} 
class FourteeTwo


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