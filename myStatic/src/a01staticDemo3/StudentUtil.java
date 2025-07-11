package a01staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student>list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempage = list.get(i).getAge();
            if(tempage>maxAge){
                maxAge = tempage;
            }
        }
        return maxAge;
    }
}
