package homeworkOne;

public class PrintUserInfo {
    public static String printUserInfo(String name, int age, String homeCity){
        String userInfo = String.format("Hello! My name is %s. I am %d years old and I live in the city of %s", name, age, homeCity);
        return userInfo;
    }
}
