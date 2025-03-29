package ObjectOrientedDemo.Test7;

public class GirlFriend2Test {
    public static void main(String[] args) {
        //定义数组
        GirlFriend2[] arr = new GirlFriend2[4];
        //创建对象
        GirlFriend2 gf1 = new GirlFriend2("迪丽热巴", 18, "女", "美食");
        GirlFriend2 gf2 = new GirlFriend2("古力娜扎", 20, "女", "旅行");
        GirlFriend2 gf3 = new GirlFriend2("章若楠", 22, "女", "美食");
        GirlFriend2 gf4 = new GirlFriend2("赵丽颖", 19, "女", "旅行");

        //把对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend2 gf = arr[i];
            sum += gf.getAge();
        }
        double avg = sum*1.0 / arr.length;
        System.out.println("平均年龄为：" + avg);

        //遍历数组
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend2 gf = arr[i];
            if(gf.getAge() < avg){
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getFavorite());
                count++;
            }

        }
        System.out.println("年龄低于平均年龄的有" + count + "人");
    }
}
