package a08regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*
            正则表达式练习：
                需求
                请编写正则表达式验证用户名是否满足要求。
                要求：大小写字母，数字，下划线一共4-16位
                请编写正则表达式验证身份证号码是否满足要求。
                简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
                复杂要求：按照身份证号码的格式严格要求。

                身份证号码：
                        41080119930228457X
                        519801197609022309
                        15949119819795387X
                        139133197294939824
                        430102197606046442
        */

        //用户名
        String username = "\\w{4,16}";

        //简单身份证
        String easyIdCode1 = "[1-9]\\d{16}[\\dXx]";
        String easyIdCode2 = "[1-9]\\d{16}(\\d|X|x)";
        String easyIdCode3 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("41080119930228457X".matches(easyIdCode3));

        //严格身份证
        //41880119930228457×
        //前面6位：省份，市区，派出所等信息第一位不能是©，后面5位是任意数字
        //年的前半段：181920
        //年的后半段：任意数字出现两次
        //月份：01~09 10 11 12
        //日期：01~31
        //后面四位：任意数字出现3次最后一位可以是数字也可以是大写X或者小写
        String string = "/^[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]$/";

        System.out.println("-------------------------");

        //忽略大小写的书写方式
        //在匹配的时候忽略abc的大小写
        String regex = "(?i)abc";
        System.out.println("abc".matches(regex));
        System.out.println("ABC".matches(regex));
    }
}
