package static_;

public class SingletonDesignExample {
    public static void main(String[] args) {
        MyConnection m1 = MyConnection.getConnection();
        MyConnection m2 = MyConnection.getConnection();
        //MyConnection m3 = new MyConnection();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1 == m2);
    }
}
