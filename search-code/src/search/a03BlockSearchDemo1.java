package search;

public class a03BlockSearchDemo1 {
    public static void main(String[] args) {
        //分块查找
        //核心思想：
        //块内无序，块间有序
        //实现步骤：
        //1.创建数组blockArr存放每一个块对象的信息
        //2.先查找blockArr确定要查找的数据属于哪一块
        //3.再单独遍历这一块数据即可

        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                56, 48, 61, 52, 73, 66};

        //创建块对象
        Block1 b1 = new Block1(21, 0, 5);
        Block1 b2 = new Block1(45, 6, 11);
        Block1 b3 = new Block1(73, 12, 17);

        //用数组来管理块（索引表）
        Block1[] blocks = {b1, b2, b3};

        //记录要查找的数据
        int number = 61;

        //查找数据
        int index = getIndex(blocks, arr, number);

        //打印数据
        System.out.println(index);
    }

    private static int getIndex(Block1[] blocks, int[] arr, int number) {
        //确定要查找的元素在哪一个块中
        int blockIndex = getBlockIndex(blocks, number);

        if (blockIndex == -1) {
            //要查找的数据不在数组中
            return -1;
        }
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    private static int getBlockIndex(Block1[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMaxData()) {
                return i;
            }
        }
        return -1;
    }
}

class Block1 {
    private int maxData;
    private int startIndex;
    private int endIndex;

    public Block1() {
    }

    public Block1(int maxData, int startIndex, int endIndex) {
        this.maxData = maxData;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return maxData
     */
    public int getMaxData() {
        return maxData;
    }

    /**
     * 设置
     *
     * @param maxData
     */
    public void setMaxData(int maxData) {
        this.maxData = maxData;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{maxData = " + maxData + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}