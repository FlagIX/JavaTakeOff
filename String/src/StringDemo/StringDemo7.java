package StringDemo;

public class StringDemo7 {
    public static void main(String[] args) {
        /*
        定义一个方法，把it数组中的数据按照指定的格式拼接成一个字符串返回，
        调用该方法，并在控制台输出结果。
        例如：
        数组为int0arr={1,2,3};
        执行方法后的输出结果为：[1,2,3]
        */

        int [] arr = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }

    public static String arrToString(int [] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
             str = str + arr[i];
             if(i!=arr.length-1){
                 str = str +",";
             }
        }
        str = str + "]";
        return str;
    }
}
