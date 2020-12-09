/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort;

/**
 *
 * @author shauqeecom
 */
public class InsertionSort {
     public static void insertSort(int arr[]){
       int n=arr.length;
       for(int i=1;i<=n-1;i++){
          int key=arr[i];
          int h=i-1;
          while(h>=0&&arr[h]>key){
              arr[h+1]=arr[h];
              h--;
          }
          arr[h+1]=key;
           System.out.println("after iteration "+i);
           printArr(arr);
       }
     }
     public static void printArr(int arr[]){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println("");
     }
   
    public static void main(String[] args) {
       int arr[]={9,14,3,2,43,11,58,22};
        System.out.println("before insertion sort");
        printArr(arr);
        insertSort(arr);
        System.out.println("after insertion sort");
        printArr(arr);
    }
    
}
