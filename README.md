# AlgorithmicPractice
算法题练习记录，题目主要来源于 LeetCode、剑指 Offer 、牛客网等等。

## 剑指 Offer

我个人对题目进行了粗略的划分，之后的刷题过程也会大致按照这个顺序进行，尽量把同一系列的题集中攻克，具体整理如下：

### 数组 - 11 道

[剑指Offer - 01 ：二维数组中的查找](https://github.com/Bylant/AlgorithmicPractice/blob/master/algorithmic-practice/sword-for-offer/src/main/java/top/zhoudl/Offer01.java)

##### 解题思路

###### 方式一：采取了暴力搜索的方式，直接遍历了二维数组；

###### 方式二：根据数组特点对其进行了查找，主要思路如下

* 首先选取最左下角或者最右上角的一个数 temp（本版本代码中采取了选择左下角的数字）
* 使用 target 和上述 temp 值进行比较
* 如果 target 小于 temp, 则代表行数需要减一
* 如果 target 大于 temp, 则代表列数需要加一
* 如果以上两种情况都不是，则代表找到了目标值，直接返回 true

[剑指Offer - 06 ：旋转数组的最小数字](https://github.com/Bylant/AlgorithmicPractice/blob/master/algorithmic-practice/sword-for-offer/src/main/java/top/zhoudl/Offer02.java)

###### 方式一：还是简单暴力的解决方法，哈哈，我对整个数组进行了排序，我真是个“人才”，人家就找个最小数，你愣是给整个数组排序了，不是闲的蛋疼吗，果然不出所料，耗时久，内存也占用不少；

###### 方式二：利用了旋转数组的特性，首先非递减数组，在旋转操作之后可以看成是把原来的一个数组变成了两段有序数组，这样一来我们就可以遍历数组，然后两两比较，直到找到前一个值大于后一个值得情况下，返回后一个值，这个值则必然是数组旋转之前的最小值。

剑指Offer - 13 ：调整数组顺序使奇数位于偶数前面

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。


从题目得出的信息：
相对位置不变--->保持稳定性；奇数位于前面，偶数位于后面 --->存在判断，并且需要挪动元素位置；

提供两种解题思路

1. 使用冒泡排序思路
2. 使用插入排序思路

剑指Offer - 28 ：数组中出现次数超过一半的数字

剑指Offer - 30 ：连续子数组的最大和

剑指Offer - 32 ：把数组排成最小的数

剑指Offer - 35 ：数组中的逆序对

剑指Offer - 37 ：数字在排序数组中出现的次数

剑指Offer - 40 ：数组中只出现一次的数字

剑指Offer - 50 ：数组中重复的数字

剑指Offer - 51：构建乘积数组

### 链表 - 8 道

剑指 Offer - 03 ：从尾到头打印链表

剑指 Offer - 14 ：链表中倒数第k个结点

剑指 Offer - 15 ：反转链表

剑指 Offer - 16 ：合并两个排序的链表

剑指 Offer - 25 ：复杂链表的复制

剑指 Offer - 36 ：两个链表的第一个公共结点

剑指 Offer - 55 ：链表中环的入口结点

剑指 Offer - 56 ：删除链表中重复的结点

### 二叉树 - 12 道

剑指 Offer - 04 ：重建二叉树

剑指 Offer - 17 ：树的子结构

剑指 Offer - 18 ：二叉树的镜像

剑指 Offer - 22 ：从上往下打印二叉树

剑指 Offer - 24 ：二叉树中和为某一值的路径

剑指 Offer - 38 ：二叉树的深度

剑指 Offer - 39 ：平衡二叉树

剑指 Offer - 57 ：二叉树的下一个结点

剑指 Offer - 58 ：对称的二叉树

剑指 Offer - 59 ：按之字顺序打印二叉树

剑指 Offer - 60 ：把二叉树打印成多行

剑指 Offer - 61 ：序列化二叉树

### 二叉搜索树 - 3 道

剑指Offer - 23 ：二叉搜索树的后序遍历序列

剑指Offer - 26 ：二叉搜索树与双向链表

剑指Offer - 62 ：二叉搜索树的第k个结点

### 字符串 - 8 道

剑指Offer - 02 ：替换空格

剑指Offer - 27 ：字符串的排列

剑指Offer - 34 ：第一个只出现一次的字符

剑指Offer - 43 ：左旋转字符串

剑指Offer - 44 ：翻转单词顺序序列

剑指Offer - 49 ：把字符串转换成整数

剑指Offer - 52 ：正则表达式匹配

剑指Offer - 53 ：表示数值的字符串

### 栈 - 3 道

剑指Offer - 05 ：用两个栈实现队列

剑指Offer - 20 ：包含 min 函数的栈

剑指Offer - 21：栈的压入、弹出序列

### 递归 - 4 道

剑指Offer - 07 ：裴波那契数列

剑指Offer - 08 ：跳台阶

剑指Offer - 09 ：变态跳台阶

剑指Offer - 10 ：矩形覆盖

### 回溯法 - 2 道

剑指Offer - 65 ：矩阵中的路径

剑指Offer - 66 ：机器人的运动范围

### 其他 - 15 道

剑指Offer - 11 ：二进制中 1 的个数

剑指Offer - 12 ：数值的整数次方

剑指Offer - 19 ：顺时针打印矩阵

剑指Offer - 29 ：最小的 K 个数

剑指Offer - 31 ：整数中 1 出现的次数（从 1 到 n 整数中 1 出现的次数）

剑指Offer - 33 ：丑数

剑指Offer - 41 ：和为 S 的连续正数序列

剑指Offer - 42 ：和为 S 的两个数字

剑指Offer - 45 ：扑克牌顺子

剑指Offer - 46 ：孩子们的游戏（圆圈中最后剩下的数）

剑指Offer - 47 ：求 1+2+3+…+n

剑指Offer - 48 ：不用加减乘除的加法

剑指Offer - 54 ：字符流中第一个不重复的字符

剑指Offer - 63 ：数据流中的中位数

剑指Offer - 64 ：滑动窗口的最大值