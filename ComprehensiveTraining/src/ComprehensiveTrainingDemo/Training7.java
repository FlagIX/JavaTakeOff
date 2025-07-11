package ComprehensiveTrainingDemo;

public class Training7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组当中

        int num = 12345;
        int temp = num;
        //1.确定数组长度
        int count = 0;
        while (num!=0){
            num/=10;
            count++;
        }
        //2.创建数组
        int [] arr = new int[count];
        //3.把每一位数字添加到数组当中
        int index = arr.length-1;
        while (temp!=0){
            //获取个位
            int ge = temp%10;

            temp = temp/10;

            arr[index]=ge;
            index--;

        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
