/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

/**
 *
 * @author shauqeecom
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
     public static void Bsort(int[] arr){
           for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
               }
                System.out.println(" after iteration "+i);
                System.out.println();
               for(int a=0;a<arr.length;a++){
                   System.out.print(arr[a]+" ");
                }
               System.out.println();
               
           }
           System.out.println("sorted array");
           System.out.println();
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={7,10,15,9,6};
        System.out.println("unsorted array");
        System.out.println();
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
        Bsort(arr);
        
        } 
    
    
}
