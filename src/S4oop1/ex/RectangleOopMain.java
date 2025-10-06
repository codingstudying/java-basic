package S4oop1.ex;

public class RectangleOopMain{

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}

//25.10.05 김영한의 실전 자바 기본편 - 섹션4.객체 지향 프로그래밍 - 27.문제와 풀이