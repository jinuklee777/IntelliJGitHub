package exception_;

public class CustomExceptionExample {
    public static void main(String[] args) {
        int ran = (int)(Math.random()*2);
        if(ran == (int)(Math.random()*2)) {
            throw new DuplicateException("아이디가 중복됩니다.");
        }
        System.out.println("아이디가 중복되지 않습니다.");
    }
}
