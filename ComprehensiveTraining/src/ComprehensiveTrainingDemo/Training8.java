package ComprehensiveTrainingDemo;

public class Training8 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于日）。比如1983，采用加密方式进行传输，
        规则如下：
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        按照以上规则进行解密：
        比如1983加密之后变成8346，解密之后变成1983
        */

        //获得加密后的数字
        int num = 8346;
        int temp = num;
        int count = 0;
        while (num!=0){
            num/=10;
            count++;
        }
        //添加到数组
        int arr[] = new int[count];
        int index = arr.length-1;
        while (temp!=0){
            int ge = temp%10;
            temp = temp/10;
            arr[index]=ge;
            index--;
        }
        //反转
        for (int i = 0,j = arr.length-1;i<j;i++,j--) {
            int temp1 = arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }

        //解密
        //3.由于加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断，0~4之间+10  5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0&&arr[i]<=4){
                arr[i]=arr[i]+10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //结果
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
            num1 = num1*10+arr[i];
        }
        System.out.println("解密后的结果是："+num1);
    }
}
