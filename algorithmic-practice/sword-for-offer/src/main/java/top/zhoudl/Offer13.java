package top.zhoudl;

/**
 * @author: zhoudongliang
 * @date: 2019/8/8 09:35
 * @description:
 */
public class Offer13 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     *
     *
     * 从题目得出的信息：
     * 相对位置不变--->保持稳定性；奇数位于前面，偶数位于后面 --->存在判断，并且需要挪动元素位置；
     *
     * 提供两种解题思路
     * 1.使用冒泡排序思路
     * 2.使用插入排序思路
     */

    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 6, 4, 3, 2};
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("处理前 ：");
        print(array1);
        reOrderArray_1(array1);
        System.out.println("处理后 ：");
        print(array1);

    }

    public static void reOrderArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // 遍历数组
            for (int j = array.length - 1; j > i; j--) {
                // 前偶后奇交换
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        /**
         * 运行时间：21ms
         * 占用内存：9236k
         */

    }

    public static void reOrderArray_1(int[] array) {
        // 使用插入排序的思想
        int m = array.length;
        int k = 0;
        for(int i=0;i<m;i++) {
            if(array[i] % 2 == 1) {
                int j = i;
                while (j > k) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    j--;
                }
                k++;
            }
        }
    }


        public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
