package S3ref;

public class MethodChange {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출: " + a);
        changePrimitive(a);
        System.out.println("메서드 호출: " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}

//25.10.01 김영한의 실전 자바 기본편 - 섹션3.기본형과 참조형 - 15.기본형 vs 참조형3 - 메서드 호출