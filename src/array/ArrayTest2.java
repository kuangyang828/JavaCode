package array;

public class ArrayTest2 {

    //1.数组的反转
    //2.二分法查找（熟悉）
    public static void main(String[] args) {
        //数组的反转
        String[] arr = new String[]{"GG", "MM", "AA", "II", "PP"};
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        //二分法查找
        //前提：所要查找的数组必须有序(升序/降序)
        int[] arr1 = new int[]{-212, -123, -56, -21, 13, 23, 46, 123, 234, 456};

        int head = 0;//初始的首索引
        int end = arr1.length - 1;//初始的末索引
        boolean isFlag = true;

        int dest = 123;

        while (head <= end) {
            int middle = (head+end) / 2;
            if (arr1[middle] == dest) {
                System.out.println("你要查找的'" + dest + "'位置是\t" + middle);
                isFlag = false;
                break;
            }
            if (arr1[middle] > dest) {
                end = middle - 1;
            }
            if (arr1[middle] < dest) {
                head = middle + 1;
            }
        }

        if (isFlag) {
            System.out.println("没有找到你要查找的哦！");
        }

    }
}
