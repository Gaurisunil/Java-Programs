 //Equilibrium index of an array 
//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an arrya A: 














class EquilibriumIndex 
{    
     int equilibrium(int arr[], int n)    
      {         int sum = 0;     
            
       int leftsum = 0; 
              
        for (int i = 0; i < n; ++i)            
         sum += arr[i];          
          for (int i = 0; i < n; ++i)        
           {            
                sum -= arr[i];
                           
                     if (leftsum == sum)                 
                      return i;              
                       leftsum += arr[i];   
                             }   
                                     return -1;    
                                      }     
                                        public static void main(String[] args) 
{
                   EquilibriumIndex equi = new EquilibriumIndex();      
                      int arr[] = {-7, 1, 5, 2, -4, 3, 0};        
                       int arr_size = arr.length;         
                       System.out.println("First equilibrium index is " +                            equi.equilibrium(arr, arr_size)); 
}
}
