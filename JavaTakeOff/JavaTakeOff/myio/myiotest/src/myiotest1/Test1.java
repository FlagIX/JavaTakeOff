package myiotest1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        获取姓氏：https://baijiaxing.hao86.com/
        获取男生名字：https://www.meimeiming.com/zhouyi/5143.html  //http://www.cimingwang.com/nanhaimingzi/948.html
        获取女生名字：https://www.meimeiming.com/zhouyi/8347.html  //http://www.cimingwang.com/nvhaimingzi/5558.html
        */

        //1.定义变量记录网址
        String familyNameNet = "https://baijiaxing.hao86.com/";
        String boyNameNet = "https://www.meimeiming.com/zhouyi/5143.html";
        String girlNameNet = "https://www.meimeiming.com/zhouyi/8347.html";

        //调用方法来爬取数据
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //调用方法过滤数据
        ArrayList<String> familyNameTempList = getData(familyNameStr, "<a(?=[^>]*?href\\s*=\\s*([\"'])\\/[\\u4e00-\\u9fa5]\\/\\1)(?=[^>]*?target\\s*=\\s*([\"'])_blank\\2)[^>]*>([\\u4e00-\\u9fa5])<\\/a>", 3);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "(\\d{1,3})(、)([\\u4E00-\\u9FA5]{2})", 3);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(\\d{1,3})(、)([\\u4E00-\\u9FA5]{2})", 3);

        //数据去重处理
        ArrayList<String> familyNameList = dataProcessing(familyNameTempList);
        ArrayList<String> boyNameList = dataProcessing(boyNameTempList);
        ArrayList<String> girlNameList = dataProcessing(girlNameTempList);

        //生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> infos = getInfos(familyNameList, boyNameList, girlNameList, 10, 10);

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaTakeOff\\myio\\myiotest\\names.txt"));
        for (String info : infos) {
            bw.write(info);
            bw.newLine();
        }
        bw.close();
    }

    private static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String s : boyhs) {
            int age = r.nextInt(20, 30);
            list.add(s + "-男" + "-" + age);
        }
        for (String s : girlhs) {
            int age = r.nextInt(20, 30);
            list.add(s + "-女" + "-" + age);
        }

        return list;
    }

    private static ArrayList<String> dataProcessing(ArrayList<String> tempList) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : tempList) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    //作用：
    //  从网络中爬取数据，把数据拼接成字符串返回
    //形参：
    //  网址
    //返回值：
    //  爬取到的所有数据
    private static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder:拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象
        URL url = new URL(net);
        //3.链接上这个网址
        //细节：保证网络是畅通的，而且这个网址是可以链接上的。
        URLConnection conn = url.openConnection();
        //添加请求头
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        //4.读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.释放资源
        isr.close();
        //6.返回数据
        return sb.toString();
    }
}
