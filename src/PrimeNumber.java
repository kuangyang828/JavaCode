public class PrimeNumber {
    //输出100以内的质数
    // 质数（素数）：只能被1和自身整除的数------>从2开始，到这个数-1结束为止,都不能被这个数整除
    //最小的质数是2

    public static void main(String[] args) {
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值    （每个数给个马甲）

        //获取当前时间距离1970-01-01 00：00：00 的毫秒数
        long start = System.currentTimeMillis();

        //遍历2到100的自然数
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {//j：被根号下i去除（原本是i-1）  优化二：对本身是质数的自然数也有效
                if (i % j == 0) {//i被j除尽
                    isFlag = false;
                    break;//优化一，只对本身不是质数的自然数有效。
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
            isFlag = true;//重置马甲
        }

        //获取当前时间距离1970-01-01 00：00：00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为"+(end-start));//14354 - 优化一：break-->1162 - 优化二-->74
    }
}