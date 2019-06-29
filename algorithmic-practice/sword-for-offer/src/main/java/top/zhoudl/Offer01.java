package top.zhoudl;

/**
 * @Author zhoudl
 * @Date: 2019/6/7 23:54
 * @Description:
 *
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数
 *
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer01 {

    public static void main(String[] args) {

    }

    /**
     * 直接使用简单粗暴的遍历方式
     * @param target
     * @param array
     * @return
     */
    public boolean find(int target, int [][] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++){
                if(target == array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 根据数据独有特点进行查找
     * @param target
     * @param array
     * @return
     */
    public boolean find_1(int target, int [][] array) {
        if(array.length == 0) {
            return false;
        }
        // 定义行数
        int row = array.length;
        // 定义列数
        int lies = array[0].length;
        // 计数器
        int i = 0;
        while (row > 0 && i < lies) {

            if(target > array[row - 1][i]) {
                // target 大于左下角数值 列增加
                i++;
            } else if(target < array[row - 1][i]) {
                // target 小于左下角数值 行减少
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

}
