package S4oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}

//25.10.05 김영한의 실전 자바 기본편 - 섹션4.객체 지향 프로그래밍 - 27.문제와 풀이