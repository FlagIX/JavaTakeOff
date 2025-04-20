package a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
                需求：
                秒杀活动开始时间：2023年11月11日 0:0:0
                结束时间：2023年11月11日 0:10:0
                小贾下单并付款的时间为：2023年11月11日 0:01:00
                小皮下单并付款的时间为：2023年11月11日 0:11:0
                用代码说明这两位同学有没有参加上秒杀活动？
*/

        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:11:0";


        SimpleDateFormat Sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");


        Date startDate = Sdf.parse(startStr);
        Date endDate = Sdf.parse(endStr);
        Date orderDate = Sdf.parse(orderStr);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        if(orderTime >= startTime && orderTime <= endTime){
            System.out.println("秒杀成功");
        }else {
            System.out.println("秒杀失败");
        }

    }
}
