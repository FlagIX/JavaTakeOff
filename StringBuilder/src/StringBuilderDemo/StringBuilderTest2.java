package StringBuilderDemo;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        //拼接字符串
        /*
        需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
        调用该方法，并在控制台输出结果。
        例如：数组为int[]arr={1,2,3};
        执行方法后的输出结果为：[1,2,3]
        */

        int [] arr = {1,2,3};
        String str = splicing(arr);
        System.out.println(str);
    }
    public static String splicing(int []arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                sb.append("["+arr[i]+",");
            }else if(i==arr.length-1){
                sb.append(arr[i]+"]");
            }else{
                sb.append(arr[i]+",");
            }
        }
        String result = sb.toString();
        return result;
    }
}
