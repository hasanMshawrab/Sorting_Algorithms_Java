public class BubbleSort {

    public static void printArray(int[] array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 22, 7, 34, 12};
        System.out.println("Not-Sorted:");
        printArray(arr);

        for (int i=0; i < arr.length; i++){
            for (int j=0; j< arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    //swap elem.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted:");
        printArray(arr);
    }

}
