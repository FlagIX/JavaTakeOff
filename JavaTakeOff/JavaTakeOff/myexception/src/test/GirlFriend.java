package test;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 10) {
            this.name = name;
        } else {
            throw new RuntimeException("名字不合法");
        }
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age >= 18 && age <= 40) {
            this.age = age;
        } else {
            throw new NumberFormatException("年龄不合法");
        }

    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
