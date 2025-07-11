package practice;

import java.util.Random;

public class practice1 {
    //int[]tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    //要求：打乱一维数组中的数据，并按照4个一组的方式添加到二维数组中。
    public static void main(String[] args) {
        //定义一个数组
        int[]tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //创建随机数
        Random random = new Random();
        for (int i = 0; i <4; i++) {
            int randomIndex = random.nextInt(tempArr.length);
            int temp;
            temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        //创建一个二维数组
        int[][] data = new int[4][4];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
