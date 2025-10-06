package S3ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}

//25.10.01 김영한의 실전 자바 기본편 - 섹션3.기본형과 참조형 - 15.기본형 vs 참조형3 - 메서드 호출