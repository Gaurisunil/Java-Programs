 /*Write a java program to find Maximum difference between two elements such that larger element appears after the smaller number 
Examples:  If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).  
If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9) */








class MaximumDiffrence 
{  
       int maxDiff(int arr[], int arr_size)   
         {        
              int max_diff = arr[1] - arr[0];        
               int i, j;         
               for (i = 0; i < arr_size; i++)         
               {            
                    for (j = i + 1; j < arr_size; j++)            
                       {               
                           if (arr[j] - arr[i] > max_diff)                   
                             max_diff = arr[j] - arr[i];          
                        }         
                     }        
                                 return max_diff;   
                }     
                                     public static void main(String[] args)  
                                        {     
                                                MaximumDiffrence maxdif = new MaximumDiffrence();    
                                                     int arr[] = {1, 2, 90, 10, 110};       
                                                       System.out.println("Maximum differnce is " +maxdif.maxDiff(arr, 5));    
                                         } 
} 