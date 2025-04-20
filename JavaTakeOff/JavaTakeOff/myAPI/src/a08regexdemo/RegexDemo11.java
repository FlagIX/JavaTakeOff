package a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        //public String replaceAll(String regex,String newstr)      按照正则表达式的规则进行替换
        //public String[]split(String regex)                        按照正则表达式的规则切割字符串

        /*
            有一段字符串：小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1：把字符串中三个姓名之间的字母替换为Vs
            要求2：把字符串中的三个姓名切割出来
*/

        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        //细节：
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换。
        String s1 = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);

        String[] s2 = str.split("[\\w&&[^_]]");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }
}
