package a18test4;

import java.util.Random;

public class MyThread extends Thread {

    redPacket rp;

    public MyThread(redPacket rp) {
        this.rp = rp;
    }

    @Override
    public void run() {
        int amount = rp.randomlyAssignTheAmountOfRedEnvelopes();
        if (amount <= 0) {
            System.out.println(getName() + "没有抢到！！");
        } else {
            System.out.println(getName() + "抢到了" + amount + "元！！");
        }
    }

    public static class redPacket {
        private int totalAmount = 100;
        private int count = 3;
        private int remainingAmount = totalAmount;
        private int remainingCount = count;

        public redPacket(int totalAmount, int count) {
            if (totalAmount <= 0) {
                throw new RuntimeException("金额数目小于零");
            }
            if (count <= 0) {
                throw new RuntimeException("红包数量小于零");
            }
            if (totalAmount < count) {
                throw new RuntimeException("红包总金额小于红包数目");
            }
            this.totalAmount = totalAmount;
            this.count = count;
            this.remainingAmount = totalAmount;
            this.remainingCount = count;
        }

        public int getRemainingCount() {
            return remainingCount;
        }

        public int getRemainingAmount() {
            return remainingAmount;
        }

        public int getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(int totalAmount) {
            this.totalAmount = totalAmount;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public synchronized int randomlyAssignTheAmountOfRedEnvelopes() {

            if(remainingAmount <= 0){
                return 0;
            }
            if(remainingCount <= 0){
                return 0;
            }
            int amount = 0;
            if(remainingCount == 1){
                amount = remainingAmount;
            }else {
                Random r = new Random();
                amount = r.nextInt(remainingAmount) + 1 - count;
            }
            if(amount > 0){
                count--;
                remainingCount = count;
                remainingAmount = remainingAmount - amount;
            }
            return amount;
        }
    }
}
