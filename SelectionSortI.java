/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraySortingDSA;

/**
 *
 * @author MSii
 */
public class SelectionSortI 
{
    public static void selectionSort(int arr[])
    {
        for(int tern = 0; tern < arr.length-1; tern++)
        {
            int minPosition = tern;
            for(int j=tern+1; j<arr.length; j++)
            {
                if(arr[minPosition] > arr[j]) //Increasing order
                {
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[tern];
            arr[tern] = temp;
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
        
    int arr[] = {1 ,2,5,3,4};
        selectionSort(arr);
        PrintArr(arr);
        
    }
}
