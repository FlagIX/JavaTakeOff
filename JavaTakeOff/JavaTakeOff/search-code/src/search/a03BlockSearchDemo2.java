package search;

public class a03BlockSearchDemo2 {
    public static void main(String[] args) {

        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        //创建块对象
        Block2 b1 = new Block2(22, 40, 0, 4);
        Block2 b2 = new Block2(13, 20, 5, 8);
        Block2 b3 = new Block2(7, 10, 9, 10);
        Block2 b4 = new Block2(43, 50, 11, 13);

        //创建索引表
        Block2[] block2s = {b1, b2, b3, b4};

        //要查找的数据
        int number = 19;

        //获取索引
        int Index = getIndex(block2s, arr, number);

        //打印
        System.out.println(Index);
    }

    private static int getIndex(Block2[] block2s, int[] arr, int number) {
        //获取要查找数据在的块
        int blcokIndex = getBlockIndex(block2s, number);

        if(blcokIndex == -1){
            return -1;
        }

        int startIndex = block2s[blcokIndex].getStartIndex();
        int endIndex = block2s[blcokIndex].getEndIndex();

        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    private static int getBlockIndex(Block2[] block2s, int number) {
        for (int i = 0; i < block2s.length; i++) {
            if (block2s[i].getMinData() < number && block2s[i].getMaxData() > number) {
                return i;
            }
        }
        return -1;
    }
}

class Block2 {
    private int minData;
    private int maxData;
    private int startIndex;
    private int endIndex;


    public Block2() {
    }

    public Block2(int minData, int maxData, int startIndex, int endIndex) {
        this.minData = minData;
        this.maxData = maxData;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return minData
     */
    public int getMinData() {
        return minData;
    }

    /**
     * 设置
     *
     * @param minData
     */
    public void setMinData(int minData) {
        this.minData = minData;
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
        return "Block2{minData = " + minData + ", maxData = " + maxData + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
