package Singleton1214;

public class SwarnaIslam1214 {
    private String gender;
    private int age;
    private static final SwarnaIslam1214 instance = new SwarnaIslam1214("Female",22);

    // private constructor to avoid client applications using the constructor
    private SwarnaIslam1214(String gender, int age){
        this.gender=gender;
        this.age=age;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static SwarnaIslam1214 getInstance() {
        return instance;
    }
}
