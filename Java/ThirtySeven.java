import java.util.*;
class Pattern
{
    public void Pattern(String str)
    {
       char arr[]=str.toCharArray();
       int i=0,j=0;
       for( i=0;i<arr.length;i++)
        {
            for( j=0;j<arr.length;j++)
            {
                if(i>=j)
                {
                    System.out.print(arr[j]+"\t");
                }
                
               
            else
             {
                System.out.print("#\t"); 
             }
            }
          System.out.println();
  
          } 
    }
} 
class ThirtySeven


{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the  String");
        String str=sobj.nextLine();
       
        Pattern obj=new Pattern();
        obj.Pattern(str);
    }
}