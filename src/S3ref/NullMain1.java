package S3ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}

//25.10.03 김영한의 실전 자바 기본편 - 섹션3.기본형과 참조형 - 18.null