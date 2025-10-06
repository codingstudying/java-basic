package S2class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentnames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentnames.length; i++) {
            System.out.println("이름:" + studentnames[i] + " 나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }
    }
}

//25.10.01 김영한의 실전 자바 기본편 - 섹션2.클래스와 데이터 - 5.클래스가 필요한 이유