package myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.IOException;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //利用糊涂包生成假数据，并写到文件当中
        //1.定义变量记录网址
        String familyNameNet = "https://baijiaxing.hao86.com/";
        String boyNameNet = "https://www.meimeiming.com/zhouyi/5143.html";
        String girlNameNet = "https://www.meimeiming.com/zhouyi/8347.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        List<String> familyNameTempList = ReUtil.findAll("<a(?=[^>]*?href\\s*=\\s*([\"'])\\/[\\u4e00-\\u9fa5]\\/\\1)(?=[^>]*?target\\s*=\\s*([\"'])_blank\\2)[^>]*>([\\u4e00-\\u9fa5])<\\/a>", familyNameStr, 3);
        List<String> boyNameTempList = ReUtil.findAll("(\\d{1,3})(、)([\\u4E00-\\u9FA5]{2})", boyNameStr, 3);
        List<String> girlNameTempList = ReUtil.findAll("(\\d{1,3})(、)([\\u4E00-\\u9FA5]{2})", girlNameStr, 3);

        //4.数据处理
        ArrayList<String> familyNameList = dataProcessing((ArrayList<String>) familyNameTempList);
        ArrayList<String> boyNameList = dataProcessing((ArrayList<String>) boyNameTempList);
        ArrayList<String> girlNameList = dataProcessing((ArrayList<String>) girlNameTempList);

        //5.生成数据
        ArrayList<String> infos = getInfos(familyNameList, boyNameList, girlNameList, 10, 10);

        //6.写出数据
        //细节：
        //糊涂包的相对路径，不是相对于当前项目而言的，而是相对c1ass文件而言的
        FileUtil.writeLines(infos,"names2.txt","UTF-8");

//        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\myiotest\\names2.txt"));
//        for (String info : infos) {
//            bw.write(info);
//            bw.newLine();
//        }
//        bw.close();
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
}
