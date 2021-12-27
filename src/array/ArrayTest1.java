package array;

public class ArrayTest1 {

    /*
    定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
    要求：所有随机数都是两位数。
    提示；[0,1) * 90-->[0,90)+ 10-->[10,100)-->[10,99](int)(Math.random() * 90 + 10)
    */

    public static void main(String[] args) {

        //1.动态定义int型一维数组，长度为10
        int[] arr = new int[10];

        System.out.print("数组为：");
        //2.随机赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //3.求最大值，最小值，和值，平均值，
        int maxNum = arr[0], minNum = arr[0], sun = 0, avg = 0;
        for (int i = 0; i < arr.length; i++) {
            //求最大值
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
            //求最小值
            if (minNum > arr[i]){
                minNum = arr[i];
            }
            //求和
            sun += arr[i];
            //求平均值
            avg = sun/arr.length;

        }
        System.out.println("最大值是" + maxNum);
        System.out.println("最小值是" + minNum);
        System.out.println("和是" + sun);
        System.out.println("平均值是" + avg);


    }

}
