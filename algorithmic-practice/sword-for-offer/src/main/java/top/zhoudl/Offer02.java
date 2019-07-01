package top.zhoudl;

/**
 * @Author zhoudl
 * @Date: 2019/7/1 21:52
 * @Description:
 */
public class Offer02 {

    /**
     * 题目描述
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */


    /**
     * 使用暴力排序的方法来完成，但是这种方式下耗时和内存空间占用都是非常大的
     * 因为题目要求的是我们只需要找到哪个最小值即可，而不是说对整个数组排序
     * @param array
     * @return
     */
    public static int minNumberInRotateArray0(int [] array) {
        if(array.length == 0) {
            return 0;
        }

        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length-i;j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }

    /**
     * 非减排序 说明是增排序 或者无序
     * 在旋转后数组将失去原来的顺序，我们借此来判断的话直接遍历数组，然后前一个值和后一个值两两比较
     * 直到找到前一个值大于后一个值得情况，则证明后边这个值就是数组原来的最小的值
     * @param array
     * @return
     */
    public static int minNumberInRotateArray1(int [] array) {
        if(array.length == 0) {
            return 0;
        }

        for(int i=0;i<array.length -1;i++) {
            if(array[i] > array[i+1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] array = {7,8,1,2,3};
        int[] array2 = {1,1,1,0,1};
        System.out.println(minNumberInRotateArray1(array2));
    }


}
