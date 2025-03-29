package ArrayListDemo;

import java.util.ArrayList;

public class ArratListDemo2 {
    public static void main(String[] args) {
        /*
        boolean add(Ee)
        添加
        boolean remove(Ee)
        E remove(int index)
        删除
        E set(int index,Ee)
        修改
        E get(int index)
        查询
        int size(）
        获取长度
        */

        //ArrayList的成员方法
        
        //创建对象
        ArrayList<String> list = new ArrayList<>();
        
        //添加元素
        boolean result = list.add("aaa");
        System.out.println(result);
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //删除元素
        list.remove("aaa");
        System.out.println(list);
        String str = list.remove(0);
        System.out.println(list);

        //修改元素
        String str1 = list.set(0,"eee");//返回被修改的元素
        System.out.println(str1);
        System.out.println(list);

        //查询元素
        String s = list.get(0);
        System.out.println(s);

        //获取长度
        int len = list.size();
        System.out.println(len);

        //遍历
        for (int i = 0; i < list.size(); i++) {

        }
    }
}
