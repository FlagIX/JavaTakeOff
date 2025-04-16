package a01mathdemo;

public class MathTest02 {
    public static void main(String[] args) {
        //(课后作业)分别统计有多少个四叶玫瑰数。（答案：3个）

        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            if(i == Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4)){
                count++;
            }
        }
        System.out.println(count);
    }

}
