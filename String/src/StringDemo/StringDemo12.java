package StringDemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //敏感词替换
        //1.获取说的话
        String talk = "CNM，玩的什么东西，TMD";

        //2.建立敏感词库
        String []arr = {"CNM","TMD","MLGB","SB"};

        //3.将敏感词替换成***
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }

        //4.打印结果
        System.out.println(talk);
    }
}
