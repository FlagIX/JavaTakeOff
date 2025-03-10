package ObjectOriented.Test6;

public class PhoneTest {
    public static void main(String[] args) {
        // 定义数组
        Phone[] arr = new Phone[3];
        // 创建手机对象
        Phone p1 = new Phone("小米", 1999, "黑色");
        Phone p2 = new Phone("苹果", 8999, "玫瑰金");
        Phone p3 = new Phone("一加", 2999, "棕色");

        // 把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        double avg = sum*1.0 / arr.length;
        System.out.println("手机的平均价格为：" + avg);
    }
}
