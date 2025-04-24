package Test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1：属性有姓名、年龄、身高。
        要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        (姓名中不要有中文或特殊字符，会涉及到后面的知识)
        */

        //创建对象
        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.64);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend gf3 = new GirlFriend("xiaohuihui", 19, 1.78);

        //创建数组
        GirlFriend[] arr = {gf1, gf2, gf3};

        //进行排序
//        Arrays.sort(arr, new Comparator<GirlFriend>() {
//            @Override
//            public int compare(GirlFriend o1, GirlFriend o2) {
//                //要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
//                double i = o1.getAge() - o2.getAge();
//                i = i == 0 ? o1.getHeight() - o2.getHeight() : i;
//                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
//
//                if (i > 0) {
//                    return 1;
//                } else if (i < 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });


        //1 ambda表达母
        //() -> {}
        //():对应着抽象方法的形参
        //{}:方法体
        Arrays.sort(arr, (o1,o2) -> {
                    //要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
                    double i = o1.getAge() - o2.getAge();
                    i = i == 0 ? o1.getHeight() - o2.getHeight() : i;
                    i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;

                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        );

        System.out.println(Arrays.toString(arr));
    }
}
