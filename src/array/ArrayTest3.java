package array;

public class ArrayTest3 {

    public static void main(String[] args) {

        //冒泡排序
        int[] arr = new int[]{12, 234, 5345, 34, -432, 323, -432, -32, 343, 12};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
