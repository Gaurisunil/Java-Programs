 /* Java program to read and add two distances using class 
In this java program, we will read two distances in feet and inches and find their sum, here program is implementing using class and objects concept. 
Given program is used to read two distances (in feet and inches) and print their sum in feet and inches, note that if total inches are more than 12 then it would be consider as 1 feet. 
Example: 
Input: Enter first distance: Enter feet: 20 Enter inches: 10 Enter second distance: Enter feet: 20 Enter inches: 10 
Output: Total distance is: Feet: 41    Inches: 8 */



import java.util.*; 
class Distance 
{     
    private int feet;     
    private int inches;         
    public void getDistance()     
    {        
         Scanner sc=new Scanner(System.in);                 
         System.out.print("Enter feet: ");         
         feet=sc.nextInt();         
         System.out.print("Enter inches: ");        
          inches=sc.nextInt();    
           }    
            public void showDistance()    
             {        
                  System.out.println("Feet: "+ feet + "\tInches: "+ inches);    
                   } 

                     public void addDistance(Distance D1, Distance D2)   
                       {        
                            inches=D1.inches+D2.inches;      
                               feet=D1.feet+D2.feet+(inches/12);   
                                     inches=inches%12;     
                                     }
                                      } 
public class AddTwoDistance
 {   
       public static void main(String []s)    
        {         try        
         { 
            Distance D1=new Distance();            
             Distance D2=new Distance();          
                Distance D3=new Distance();                         //read first distance             
                System.out.println("Enter first distance: ");            
                 D1.getDistance();                         //read second distance             
                 System.out.println("Enter second distance: ");            
                  D2.getDistance();                         //add distances             
                  D3.addDistance(D1,D2);             //print distance             
                  System.out.println("Total distance is:" );          
           D3.showDistance();         
           }         
           catch (Exception e)       
             {    
                        System.out.println("Exception occurred :"+ e.toString());   
                              }   
                                }
                                 } 