public class SelectionSort{
   public static void selectionSort(int[] arr){
       int n =arr.length;
        for(int i=0;i<n-1;i++){
        
        int minIndex = findMin(arr,i,n-1);
        swap(arr,i,minIndex);
        }
     }
    public static int findMin(int[] arr,int start,int end){
    int minIndex = start;    
    for(int i =start+1; i<=end; i++){
      if(arr[i]< arr[minIndex]){
      minIndex =i;
      }
    }
    return minIndex;
  }
    public static void swap(int[]arr,int i,int j) {
      int temp =arr[i];
      arr[i] =arr [j];
      arr[j] =temp;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[]args){
        int[] arr ={64,25,12,22,21};
        System.out.println("original array :");
        printArray(arr);
        
        selectionSort(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr);
        
        }
    }
