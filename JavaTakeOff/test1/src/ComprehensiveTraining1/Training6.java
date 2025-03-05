package ComprehensiveTraining1;

public class Training6 {
    public static void main(String[] args) {
        /*
        某系统的数字密码（大于日）。比如1983，采用加密方式进行传输，
        规则如下：
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        */
        //1.
        int [] arr = {1,9,8,3};

        //2.加密
        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
        }
        //3.反转
        for (int i = 0,j = arr.length-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //结果
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10+arr[i];
        }
        System.out.println("加密后的结果是："+num);
    }
}
