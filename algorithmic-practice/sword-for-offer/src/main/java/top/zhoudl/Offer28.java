package top.zhoudl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongliang.zhou
 * @date 2019/9/5 15:06
 */
public class Offer28 {

    /*
    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
    由于数字2在数组中出现了5次，超过数组长度的一半，
    因此输出2。如果不存在则输出0。
    */

    public static void main(String[] args) {
        int[] tempArray = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int result = moreThanHalfNumSolution2(tempArray);
        System.out.println("i = " + result);
    }

    public static int moreThanHalfNumSolution(int[] array) {
        /**
         * 1.算出数组长度
         * 2.计算每个元素出现的次数
         * 3.一旦大于数组长度的一般 则返回 终止程序
         * 此处借用到了 HashMap 来实现
         */
        if (array == null || array.length == 0) {
            return 0;
        }
        int len = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        // 遍历 Map 判断具体次数
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= (len / 2)) {
                return key;
            }
        }

        return 0;
    }

    public static int moreThanHalfNumSolution2(int[] array) {
        /**
         * 不使用 HashMap 来实现
         * 1.算出数组长度
         * 2.统计元素出线次数
         * 如果有符合条件的数字，则它出现的次数比其他所有数字出现的次数和还要多
         * 在遍历数组时保存两个值：第一个是数组中某一个数字，另外一个值是次数。
         * 遍历下一个数字时，若它与之前保存的数字相同，则次数加 1，否则次数减 1；
         * 若次数为 0，则保存下一个数字，并将次数置为 1。
         * 遍历结束后，所保存的数字即为所求。
         * 然后再判断它是否符合条件即可。
         */

        if (array == null || array.length == 0) {
            return 0;
        }
        int len = array.length;

        int value = array[0], num = 1;
        for (int i = 1; i < array.length; i++) {
            if(num == 0) {
                value = array[i];
            }
            if(array[i] == value) {
                num ++;
            } else {
                num --;
            }
        }

        // 结果验证
        int tempNum = 0;
        for (int i = 1; i < array.length; i++) {
            if(value == array[i]) {
                tempNum ++;
            }
        }
        if(tempNum >= (len / 2)) {
            return value;
        }
        return 0;
    }

}
