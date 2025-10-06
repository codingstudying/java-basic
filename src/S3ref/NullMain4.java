package S3ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);   //0
        System.out.println("bigData.data=" + bigData.data);     //null

        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}

//25.10.03 김영한의 실전 자바 기본편 - 섹션3.기본형과 참조형 - 19.NullPointerException