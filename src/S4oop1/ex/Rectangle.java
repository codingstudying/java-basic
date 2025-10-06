package S4oop1.ex;

public class Rectangle {

    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }
}

//25.10.05 김영한의 실전 자바 기본편 - 섹션4.객체 지향 프로그래밍 - 27.문제와 풀이