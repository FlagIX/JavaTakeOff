package ComprehensiveTraining1;

//二维数组动态初始化
public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        二维数组动态初始化格式：
        数据类型[][]数组名=new数据类型[m][n];
        表示这个二维数组，可以存放多少个一维数组
        n表示每一个一维数组，可以存放多少个元素
         */

        //用动态初始化定义二维数组
        //定义一个二维数组，这个二维数组可以存放3个一维数组，每一个一维数组可以存放2个元素
        int [][] arr = new int[3][2];

        //赋值
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
