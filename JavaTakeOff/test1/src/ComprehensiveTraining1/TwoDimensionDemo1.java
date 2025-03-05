package ComprehensiveTraining1;

//二维数组静态初始化
public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*
        二维数组静态初始化格式：
            数据类型[][]数组名=new数据类型[][]{{元素1，元素2}，{元素1，元素2}}；
        简化格式：
            数据类型[][]数组名={元素1，元素2}，{元素1，元素2})；
        元素访问：
            数组名[索引][索引]：
        二维数组遍历：
        先得到一维数组，再遍历一维数组获取元素
         */
        //1.二维数组静态初始化格式
        //数据类型[][]数组名=new数据类型[][]{{元素1，元素2}，{元素1，元素2}}；
        int [][] arr1 = new int[][]{{1,2,3},{4,5,6}};
        int [][] arr2 = {{1,2,3},{4,5,6}};
        //以后建议这样定义，把每一个一维数组，单独写成一行
        //注意：每一个一维数组其实是二维数组中的元素，所以每一个一维数组之间需要用逗号隔开。最后一个一维数组后面不需要加逗号
        int [] [] arr3 = {
                {1,2,3},
                {4,5,6}
        };
        //2.元素访问
        //二维数组中的元素是一维数组,arr1[0]是一维数组
        //二维数组中的元素是一维数组，所以需要先得到一维数组，再得到一维数组中的元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr3[0][2]);

        //3.二维数组遍历
        //先得到二维数组中的每一个一维数组
        for (int i = 0; i < arr1.length; i++) {
            //再遍历每一个一维数组
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
