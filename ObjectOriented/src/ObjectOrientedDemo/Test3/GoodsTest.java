package ObjectOrientedDemo.Test3;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个长度为3的数组，数组中存放3个商品对象
        Goods[] arr = new Goods[3];
        //创建商品对象
        Goods g1 = new Goods("001", "华为手机", 6999.9, 1000);
        Goods g2 = new Goods("002", "小米手机", 4999.9, 100);
        Goods g3 = new Goods("003", "OPPO手机", 3999.9, 10000);
        //把商品对象添加到数组中
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
