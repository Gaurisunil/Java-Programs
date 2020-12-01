import java.util.*;
class Matrix
{
    public void Swap(int arr[][],int iRow,int iCol)
    {
        int i=0,j=0,temp;
        for (int i=1;i<=iRow;i++)
        {
           for (int j=1;j<=iCol;j++)  
           {
               temp=arr[i][j];
               arr[i][j]=arr[i+1][j];
               arr[i+1][j]=arr[i][j];
           }
        }
        System.out.println("Matrix after change");
        for (int i=1;i<=iRow;i++)
        {
           for (int j=1;j<=iCol;j++)  
           {
               System.out.println(arr[i][j]+"\t");
    }
    System.out.println();
}
    }
}
class Demo
{
     
    
     public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  no rows");
        int iRow=sobj.nextInt();
        System.out.println("Enter the  no colums");
        int iCol=sobj.nextInt();
        int arr[][]=new int[iRow][iCol];
        System.out.println("ENTER ALL THE ELEMENTS");
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iRow;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }
         System.out.println("GIVE MATRIX IS");
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iRow;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }
       Matrix mobj=new Matrix();
mobj.Swap(arr,iRow,iCol);
    }       
}

 