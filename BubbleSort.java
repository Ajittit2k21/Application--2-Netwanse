/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraySortingDSA;

/**
 *
 * @author MSii
 */
public class BubbleSort 
{
    public static void bubbleSort(int arr[])
    {
        for(int tern = 0; tern < arr.length-1; tern++)
        {
            for(int j=0; j<arr.length - 1-tern; j++)
            {
                //swap the array 
                
                if(arr[j] > arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
public static void PrintArr(int arr[])
     {
         for(int i=0; i<arr.length; i++)
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println(" ");
     }
public static void main(String[] args) {
        
    int arr[] = {2,3,1,5,4}; 
      bubbleSort(arr);
      PrintArr(arr);
      
    } 
}
