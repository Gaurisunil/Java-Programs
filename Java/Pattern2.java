/*java program to print pyramid of characters using class 
Enter Number : 5               
     A           
   A B A        
  A B C B A     
 A B C D C B A  
 A B C D E D C B A */




import java.util.Scanner; 
class Pattern2 
{ 
     private int num; 

 public void setNum(int num) 
  {   
      this.num=num; 
   }  
   public int getNum()  
   {   
       return this.num; 
    } 
 public void printAnswer() 
  {  
       for(int i=1;i<=getNum();i++)   
       {  
             for(int j=1;j<=getNum()-i+1;j++) 
                {     
                    System.out.print("  ");   
                     }    
                     for(int j=1;j<=i;j++)   
                      {   
                            System.out.print((char)(64+j)+" ");  
                              }  
                                for(int j=i-1;j>=1;j--)   
                                 {    
                                      System.out.print((char)(64+j)+" ");   
                                       }   
                                        System.out.println();  
                                         }
                                         } 
                                          public void inputNum() 
                                           {  
                                                Scanner sc  =   new Scanner(System.in); 
                                                  System.out.print("Enter Number  : ");
                                                     int num =   sc.nextInt();   
                                                     setNum(num); 
                                                      } 
                              public static void main(String[] ar) 



                            {  
                           Pattern2 ob = new Pattern2(); 
                         ob.inputNum(); 
                      ob.printAnswer(); 
                           } 
                           } 