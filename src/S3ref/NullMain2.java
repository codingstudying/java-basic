package S3ref;

public class NullMain2 {
    public static void main(String[] args) {
        //Data data = null;
        Data data = new Data();
        data.value = 10; //NullPointException 예외 발생
        System.out.println("data = " + data.value);
    }
}

//25.10.03 김영한의 실전 자바 기본편 - 섹션3.기본형과 참조형 - 19.NullPointerException