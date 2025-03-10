package ObjectOriented.Test7;

public class GirlFriend2 {
    private String name;
    private int age;
    private String gender;
    private String favorite;

    // 构造方法

    public GirlFriend2() {
    }

    public GirlFriend2(String name, int age, String gender, String favorite) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.favorite = favorite;
    }
    //get/set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
