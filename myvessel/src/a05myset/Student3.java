package a05myset;

public class Student3 {
    private String name;
    private int age;
    private int ChineseGrade;
    private int MathGrade;
    private int EnglishGrade;


    public Student3() {
    }

    public Student3(String name, int age, int ChineseGrade, int MathGrade, int EnglishGrade) {
        this.name = name;
        this.age = age;
        this.ChineseGrade = ChineseGrade;
        this.MathGrade = MathGrade;
        this.EnglishGrade = EnglishGrade;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return ChineseGrade
     */
    public int getChineseGrade() {
        return ChineseGrade;
    }

    /**
     * 设置
     * @param ChineseGrade
     */
    public void setChineseGrade(int ChineseGrade) {
        this.ChineseGrade = ChineseGrade;
    }

    /**
     * 获取
     * @return MathGrade
     */
    public int getMathGrade() {
        return MathGrade;
    }

    /**
     * 设置
     * @param MathGrade
     */
    public void setMathGrade(int MathGrade) {
        this.MathGrade = MathGrade;
    }

    /**
     * 获取
     * @return EnglishGrade
     */
    public int getEnglishGrade() {
        return EnglishGrade;
    }

    /**
     * 设置
     * @param EnglishGrade
     */
    public void setEnglishGrade(int EnglishGrade) {
        this.EnglishGrade = EnglishGrade;
    }

    public String toString() {
        return "Student3{name = " + name + ", age = " + age + ", ChineseGrade = " + ChineseGrade + ", MathGrade = " + MathGrade + ", EnglishGrade = " + EnglishGrade + "}";
    }

    public int getSum(){
        return ChineseGrade + MathGrade + EnglishGrade;
    }
}
