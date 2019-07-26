package review;

public class testReflect {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cls = Class.forName("java.util.Date");
        Object obj = cls.newInstance();
        System.out.println(obj);
    }
}
