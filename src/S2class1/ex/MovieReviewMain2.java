package S2class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰" + review.review);
        }
    }
}

//25.10.01 김영한의 실전 자바 기본편 - 섹션2.클래스와 데이터 - 11.문제와 풀이